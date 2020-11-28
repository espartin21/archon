package com.github.espartin21.archon.model.groupme.attachments;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GroupMeLocation extends GroupMeAttachment {
    final String type = "location";
    String lng;
    String lat;
    String name;
}
