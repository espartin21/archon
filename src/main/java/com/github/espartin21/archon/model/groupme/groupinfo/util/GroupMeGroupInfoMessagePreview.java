package com.github.espartin21.archon.model.groupme.groupinfo.util;

import com.github.espartin21.archon.model.groupme.attachments.GroupMeAttachment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupMeGroupInfoMessagePreview {
    String nickname;
    String text;
    String image_url;
    GroupMeAttachment[] attachments;
}
