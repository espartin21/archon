package com.github.espartin21.archon.model.groupme.attachments;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GroupMeLocation extends GroupMeAttachment {
    final String type = "location";
    String lng;
    String lat;
    String name;
}
