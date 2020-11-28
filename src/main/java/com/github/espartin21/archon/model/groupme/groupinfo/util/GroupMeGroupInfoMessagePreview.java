package com.github.espartin21.archon.model.groupme.groupinfo.util;

import com.github.espartin21.archon.model.groupme.attachments.GroupMeAttachment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupMeGroupInfoMessagePreview {
    private String nickname;
    private String text;
    private String image_url;
    private GroupMeAttachment[] attachments;
}
