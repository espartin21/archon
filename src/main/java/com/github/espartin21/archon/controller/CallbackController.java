package com.github.espartin21.archon.controller;

import com.github.espartin21.archon.model.groupme.GroupMeInfo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallbackController {
    @PostMapping("/callback")
    public void callback(@RequestBody GroupMeInfo groupMeInfo) {
    }
}
