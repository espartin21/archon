package com.github.espartin21.archon.model.groupme.groupinfo.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupMeGroupInfoMessageInformation {
    private int count;
    private String last_message_id;
    private int last_message_created_at;
    private GroupMeGroupInfoMessagePreview preview;
}
