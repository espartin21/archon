package com.github.espartin21.archon.model.groupme.attachments;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GroupMeMention {
    final String type = "mentions";
    List<String> user_ids;
    // TODO: add loci
}
