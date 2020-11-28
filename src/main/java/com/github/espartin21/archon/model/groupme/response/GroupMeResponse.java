package com.github.espartin21.archon.model.groupme.response;

import com.github.espartin21.archon.model.groupme.response.util.GroupMeResponseMeta;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupMeResponse<T> {
    T response;
    GroupMeResponseMeta meta;
}
