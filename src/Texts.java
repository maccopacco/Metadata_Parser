public class Texts {
    public static final String owners = "\"owners\": {\n" +
            "      \"kind\": \"drive#user\",\n" +
            "      \"displayName\": string,\n" +
            "      \"photoLink\": string,\n" +
            "      \"me\": boolean,\n" +
            "      \"permissionId\": string,\n" +
            "      \"emailAddress\": string\n" +
            "    }\n";

    public static final String trash = "  \"trashingUser\": {\n" +
            "    \"kind\": \"drive#user\",\n" +
            "    \"displayName\": string,\n" +
            "    \"photoLink\": string,\n" +
            "    \"me\": boolean,\n" +
            "    \"permissionId\": string,\n" +
            "    \"emailAddress\": string\n" +
            "  }";
    public static final String file = "\"kind\": \"drive#file\",\n" +
            "  \"id\": string,\n" +
            "  \"name\": string,\n" +
            "  \"mimeType\": string,\n" +
            "  \"description\": string,\n" +
            "  \"starred\": boolean,\n" +
            "  \"trashed\": boolean,\n" +
            "  \"explicitlyTrashed\": boolean,\n" +
            "  \"trashingUser\": {\n" +
            "    \"kind\": \"drive#user\",\n" +
            "    \"displayName\": string,\n" +
            "    \"photoLink\": string,\n" +
            "    \"me\": boolean,\n" +
            "    \"permissionId\": string,\n" +
            "    \"emailAddress\": string\n" +
            "  }" +
            ",\n" +
            "  \"trashedTime\": datetime,\n" +
            "  \"parents\": [\n" +
            "    string\n" +
            "  ],\n" +
            "  \"properties\": {\n" +
            "    (key): string\n" +
            "  },\n" +
            "  \"appProperties\": {\n" +
            "    (key): string\n" +
            "  },\n" +
            "  \"spaces\": [\n" +
            "    string\n" +
            "  ],\n" +
            "  \"version\": long,\n" +
            "  \"webContentLink\": string,\n" +
            "  \"webViewLink\": string,\n" +
            "  \"iconLink\": string,\n" +
            "  \"hasThumbnail\": boolean,\n" +
            "  \"thumbnailLink\": string,\n" +
            "  \"thumbnailVersion\": long,\n" +
            "  \"viewedByMe\": boolean,\n" +
            "  \"viewedByMeTime\": datetime,\n" +
            "  \"createdTime\": datetime,\n" +
            "  \"modifiedTime\": datetime,\n" +
            "  \"modifiedByMeTime\": datetime,\n" +
            "  \"modifiedByMe\": boolean,\n" +
            "  \"sharedWithMeTime\": datetime,\n" +
            "  \"sharingUser\": {\n" +
            "    \"kind\": \"drive#user\",\n" +
            "    \"displayName\": string,\n" +
            "    \"photoLink\": string,\n" +
            "    \"me\": boolean,\n" +
            "    \"permissionId\": string,\n" +
            "    \"emailAddress\": string\n" +
            "  },\n" +
//            "  \"owners\": [\n" +
//            "    {\n" +
//            "      \"kind\": \"drive#user\",\n" +
//            "      \"displayName\": string,\n" +
//            "      \"photoLink\": string,\n" +
//            "      \"me\": boolean,\n" +
//            "      \"permissionId\": string,\n" +
//            "      \"emailAddress\": string\n" +
//            "    }\n" +
//            "  ],\n" +
            "  \"teamDriveId\": string,\n" +
            "  \"driveId\": string,\n" +
            "  \"lastModifyingUser\": {\n" +
            "    \"kind\": \"drive#user\",\n" +
            "    \"displayName\": string,\n" +
            "    \"photoLink\": string,\n" +
            "    \"me\": boolean,\n" +
            "    \"permissionId\": string,\n" +
            "    \"emailAddress\": string\n" +
            "  },\n" +
            "  \"shared\": boolean,\n" +
            "  \"ownedByMe\": boolean,\n" +
            "  \"capabilities\": {\n" +
            "    \"canAddChildren\": boolean,\n" +
            "    \"canAddFolderFromAnotherDrive\": boolean,\n" +
            "    \"canAddMyDriveParent\": boolean,\n" +
            "    \"canChangeCopyRequiresWriterPermission\": boolean,\n" +
            "    \"canChangeViewersCanCopyContent\": boolean,\n" +
            "    \"canComment\": boolean,\n" +
            "    \"canCopy\": boolean,\n" +
            "    \"canDelete\": boolean,\n" +
            "    \"canDeleteChildren\": boolean,\n" +
            "    \"canDownload\": boolean,\n" +
            "    \"canEdit\": boolean,\n" +
            "    \"canListChildren\": boolean,\n" +
            "    \"canModifyContent\": boolean,\n" +
            "    \"canMoveChildrenOutOfTeamDrive\": boolean,\n" +
            "    \"canMoveChildrenOutOfDrive\": boolean,\n" +
            "    \"canMoveChildrenWithinTeamDrive\": boolean,\n" +
            "    \"canMoveChildrenWithinDrive\": boolean,\n" +
            "    \"canMoveItemIntoTeamDrive\": boolean,\n" +
            "    \"canMoveItemOutOfTeamDrive\": boolean,\n" +
            "    \"canMoveItemOutOfDrive\": boolean,\n" +
            "    \"canMoveItemWithinTeamDrive\": boolean,\n" +
            "    \"canMoveItemWithinDrive\": boolean,\n" +
            "    \"canMoveTeamDriveItem\": boolean,\n" +
            "    \"canReadRevisions\": boolean,\n" +
            "    \"canReadTeamDrive\": boolean,\n" +
            "    \"canReadDrive\": boolean,\n" +
            "    \"canRemoveChildren\": boolean,\n" +
            "    \"canRemoveMyDriveParent\": boolean,\n" +
            "    \"canRename\": boolean,\n" +
            "    \"canShare\": boolean,\n" +
            "    \"canTrash\": boolean,\n" +
            "    \"canTrashChildren\": boolean,\n" +
            "    \"canUntrash\": boolean\n" +
            "  },\n" +
            "  \"viewersCanCopyContent\": boolean,\n" +
            "  \"copyRequiresWriterPermission\": boolean,\n" +
            "  \"writersCanShare\": boolean,\n" +
            "  \"permissions\": [\n" +
            "    permissions Resource\n" +
            "  ],\n" +
            "  \"permissionIds\": [\n" +
            "    string\n" +
            "  ],\n" +
            "  \"hasAugmentedPermissions\": boolean,\n" +
            "  \"folderColorRgb\": string,\n" +
            "  \"originalFilename\": string,\n" +
            "  \"fullFileExtension\": string,\n" +
            "  \"fileExtension\": string,\n" +
            "  \"md5Checksum\": string,\n" +
            "  \"size\": long,\n" +
            "  \"quotaBytesUsed\": long,\n" +
            "  \"headRevisionId\": string,\n" +
            "  \"contentHints\": {\n" +
            "    \"thumbnail\": {\n" +
            "      \"image\": bytes,\n" +
            "      \"mimeType\": string\n" +
            "    },\n" +
            "    \"indexableText\": string\n" +
            "  },\n" +
            "  \"imageMediaMetadata\": {\n" +
            "    \"width\": integer,\n" +
            "    \"height\": integer,\n" +
            "    \"rotation\": integer,\n" +
            "    \"location\": {\n" +
            "      \"latitude\": double,\n" +
            "      \"longitude\": double,\n" +
            "      \"altitude\": double\n" +
            "    },\n" +
            "    \"time\": string,\n" +
            "    \"cameraMake\": string,\n" +
            "    \"cameraModel\": string,\n" +
            "    \"exposureTime\": float,\n" +
            "    \"aperture\": float,\n" +
            "    \"flashUsed\": boolean,\n" +
            "    \"focalLength\": float,\n" +
            "    \"isoSpeed\": integer,\n" +
            "    \"meteringMode\": string,\n" +
            "    \"sensor\": string,\n" +
            "    \"exposureMode\": string,\n" +
            "    \"colorSpace\": string,\n" +
            "    \"whiteBalance\": string,\n" +
            "    \"exposureBias\": float,\n" +
            "    \"maxApertureValue\": float,\n" +
            "    \"subjectDistance\": integer,\n" +
            "    \"lens\": string\n" +
            "  },\n" +
            "  \"videoMediaMetadata\": {\n" +
            "    \"width\": integer,\n" +
            "    \"height\": integer,\n" +
            "    \"durationMillis\": long\n" +
            "  },\n" +
            "  \"isAppAuthorized\": boolean,\n" +
            "  \"exportLinks\": {\n" +
            "    (key): string\n" +
            "  },\n" +
            "  \"shortcutDetails\": {\n" +
            "    \"targetId\": string,\n" +
            "    \"targetMimeType\": string\n" +
            "  }";

    public static final String input1 = "\"kind\": \"drive#file\",\n" +
            "  \"id\": string,\n" +
            "  \"name\": string,\n" +
            "  \"mimeType\": string,\n" +
            "  \"description\": string,\n" +
            "  \"starred\": boolean,\n" +
            "  \"trashed\": boolean,\n" +
            "  \"explicitlyTrashed\": boolean,\n" +
            "  \"trashingUser\": {\n" +
            "    \"kind\": \"drive#user\",\n" +
            "    \"displayName\": string,\n" +
            "    \"photoLink\": string,\n" +
            "    \"me\": boolean,\n" +
            "    \"permissionId\": string,\n" +
            "    \"emailAddress\": string\n" +
            "  },\n" +
            "  \"trashedTime\": datetime,\n" +
            "  \"parents\": [\n" +
            "    string\n" +
            "  ], bruhs: [bool\n]," +
            "  \"exportLinks\": {\n" +
            "    (key): string\n" +
            "  }";
}
