# Metadata_Parser

Quick script to parse
```
"kind": "drive#file",
"id": string,
"name": string,
"mimeType": string,
"description": string,
"starred": boolean,
"trashed": boolean,
"explicitlyTrashed": boolean,
"trashingUser": {
  "kind": "drive#user",
  "displayName": string,
  "photoLink": string,
  "me": boolean,
  "permissionId": string,
  "emailAddress": string
}
```
(source found [here](https://developers.google.com/drive/api/v3/reference/files))
  into
  
```
KIND("kind"),
ID("id"),
NAME("name"),
MIMETYPE("mimeType"),
DESCRIPTION("description"),
STARRED("starred"),
TRASHED("trashed"),
EXPLICITLYTRASHED("explicitlyTrashed"),
TRASHINGUSER_KIND("trashingUser/kind"),
TRASHINGUSER_DISPLAYNAME("trashingUser/displayName"),
TRASHINGUSER_PHOTOLINK("trashingUser/photoLink"),
TRASHINGUSER_ME("trashingUser/me"),
TRASHINGUSER_PERMISSIONID("trashingUser/permissionId"),
TRASHINGUSER_EMAILADDRESS("trashingUser/emailAddress"),
```

for helper program in [MSCO Timelog Project](https://github.com/maccopacco/msco_timelog)
