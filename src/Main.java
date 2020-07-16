import java.util.ArrayList;
import java.util.List;

public class Main {
    static final boolean noPrintAtAll = false;
    static final boolean print = false && !noPrintAtAll;
    static final boolean splitPrint = false && !noPrintAtAll;
    static final String nesting_field_character = "_";

    public static void main(String[] args) {
        displayText(Texts.trash);
        displayText(Texts.owners);
    }

    private static void displayText(String inputInQuestion) {
        inputInQuestion =
                inputInQuestion.replaceAll("\"", "")
                        .replaceAll("\n", "");

        System.out.println("input");
        System.out.println(inputInQuestion);

        System.out.println("Loading...\n");
        String result = handle(inputInQuestion);

        List.of(result.split("\n"))
                .stream()
                .filter(s -> !s.equals(""))
                .forEach((String x) -> {
                    x = cleanup(x);
                    String replaced = x.replaceAll("_", "/");
                    System.out.printf("%s(\"%s\"),\n", x.toUpperCase(), replaced);
                });
    }

    private static String handle(String input) {
        return handle("", input);
    }

    private static String handle(String prepend, String input) {
        if (print) {
            System.out.printf("Handling [%s]\t[%s]\n", prepend, input);
        }
        final List<String> batchOfInput = handleBatch(input);
        if (batchOfInput.size() != 1) {
            if (print) {
                System.out.printf("Handling batch of size %d\n", batchOfInput.size());
            }

            //Still a batch
            StringBuilder batchCombiner = new StringBuilder();
            batchOfInput.forEach(item_in_batch -> {
                batchCombiner.append(handle(prepend, item_in_batch)).append("\n");
            });
            return batchCombiner.toString();
        }
        //Now singular item

        if (input.contains("{")) {
            //A list
            if (print) {
                System.out.println("its a list");
            }
            final String regex = ": \\{";
            String[] splitBy = input.split(regex);
            String main = splitBy[0];

            String rest = replaceLast(input.substring(main.length() + regex.length()), "}", "");

            main = cleanup(main);

            if (print) {
                System.out.printf("Main [%s]\n" +
                        "Rest [%s]\n", main, rest);
            }
            return handle(applyPrepend(prepend, main), rest);
        } else {
            //Singular
            if (print) {
                System.out.println("singular");
            }
            return applyPrepend(prepend, input.split(":")[0]);
        }
    }

    private static String applyPrepend(String prepend, String value) {
        if (prepend.equals("")) {
            return value;
        }
        return cleanup(prepend) + nesting_field_character + cleanup(value);
    }

    private static String cleanup(String string) {
        return string.replaceAll(" ", "")
                .replaceAll("\n", "")
                .replaceAll("\\(", "")
                .replaceAll("\\)", "");
    }

    private static List<String> handleBatch(String string) {
        return split(string, ',', '{', '}');
    }

    private static List<String> split(String toSplit, char delimeter, char noEntryOpen, char noEntryClose) {
        ArrayList<String> strings = new ArrayList<>();
        int amountOfOpens = 0;
        int amountOfCloses = 0;

        int lastSplit = 0;
        for (int i = 0; i < toSplit.length(); i++) {
            final char currentChar = toSplit.charAt(i);
            if (currentChar == noEntryOpen) {
                if (splitPrint) {
                    System.out.printf("Found open at %d, [%c]\n", i, currentChar);
                }
                amountOfOpens++;
            } else if (currentChar == noEntryClose) {
                if (splitPrint) {
                    System.out.printf("Found close at %d, [%c]\n", i, currentChar);
                }
                amountOfCloses++;
            }

            if ((amountOfOpens - amountOfCloses) == 0) {
                if (splitPrint) {
                    System.out.printf("Checking delim at [%d]\n", i);
                }
                if (currentChar == delimeter) {
                    strings.add(toSplit.substring(lastSplit, i));
                    lastSplit = i + 1;
                }
            } else {
                if (splitPrint) {
                    System.out.printf("Not checking delim at [%d]\n", i);
                }
            }
        }
        strings.add(toSplit.substring(lastSplit));
        return strings;
    }

    public static String replaceLast(String string, String toReplace, String replacement) {
        int pos = string.lastIndexOf(toReplace);
        if (pos > -1) {
            return string.substring(0, pos)
                    + replacement
                    + string.substring(pos + toReplace.length());
        } else {
            return string;
        }
    }

}
