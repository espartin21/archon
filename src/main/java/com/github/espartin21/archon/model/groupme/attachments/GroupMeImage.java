package com.github.espartin21.archon.model.groupme.attachments;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GroupMeImage extends GroupMeAttachment {
    final String type = "image";
    String url;
}
