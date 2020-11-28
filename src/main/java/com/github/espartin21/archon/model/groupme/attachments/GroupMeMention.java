package com.github.espartin21.archon.model.groupme.attachments;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GroupMeMention extends GroupMeAttachment {
    private List<List<Integer>> loci;
    private List<String> user_ids;
}
