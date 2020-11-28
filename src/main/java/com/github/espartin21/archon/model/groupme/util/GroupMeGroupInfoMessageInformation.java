package com.github.espartin21.archon.model.groupme.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupMeGroupInfoMessageInformation {
    int count;
    String last_message_id;
    int last_message_created_at;
    GroupMeGroupInfoMessagePreview preview;
}
