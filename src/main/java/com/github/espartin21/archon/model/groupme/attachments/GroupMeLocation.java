package com.github.espartin21.archon.model.groupme.attachments;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GroupMeLocation extends GroupMeAttachment {
    private String lng;
    private String lat;
    private String name;
}
