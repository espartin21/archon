package com.github.espartin21.archon.model.groupme.attachments;

import lombok.*;

import org.javatuples.Pair;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GroupMeMention extends GroupMeAttachment {
    List<List<Integer>> loci;
//    final String type = "mentions";
    List<String> user_ids;
}
