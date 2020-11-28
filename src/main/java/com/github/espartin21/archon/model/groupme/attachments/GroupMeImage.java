package com.github.espartin21.archon.model.groupme.attachments;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GroupMeImage extends GroupMeAttachment {
    private String url;
}
