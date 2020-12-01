package com.github.espartin21.archon.service.groupme;

import com.github.espartin21.archon.exception.ForbiddenException;
import com.github.espartin21.archon.exception.GroupNotFoundException;
import com.github.espartin21.archon.model.groupme.groupinfo.GroupMeGroupInfo;
import com.github.espartin21.archon.model.groupme.response.GroupMeResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Objects;

@Service
public class GroupMeServiceImpl implements GroupMeService {
    @Value("${groupme.api-key}")
    private String GROUPME_API_KEY;

    @Value("${groupme.api}")
    private String GROUPME_API;

    @Value("${groupme.group-id}")
    private String GROUP_ID;

    @Override
    public GroupMeGroupInfo getGroupInfo() {
        UriComponents uriComponents = UriComponentsBuilder
                .fromHttpUrl(GROUPME_API)
                .path("/groups/" + GROUP_ID)
                .queryParam("token", GROUPME_API_KEY)
                .build();

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<GroupMeResponse> response = restTemplate
                .getForEntity(uriComponents.toUriString(), GroupMeResponse.class);

        HttpStatus status = response.getStatusCode();
        if (status == HttpStatus.NOT_FOUND) {
            throw new GroupNotFoundException("GroupMe group info not found");
        } else if (status == HttpStatus.FORBIDDEN) {
            throw new ForbiddenException("Forbidden. Incorrect access token");
        }

        return Objects.requireNonNull(response.getBody()).getResponse();
    }
}
