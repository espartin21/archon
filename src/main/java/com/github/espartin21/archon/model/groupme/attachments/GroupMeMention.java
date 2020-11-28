package com.github.espartin21.archon.model.groupme.attachments;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.javatuples.Pair;

import java.util.List;

@Getter
@Setter
@ToString
public class GroupMeMention extends GroupMeAttachment {
    List<Pair<Integer, Integer>> loci;
    final String type = "mentions";
    List<String> user_ids;
}
