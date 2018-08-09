package com.cospedia.commentservice.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "comments")
public class CommentController {

    @RequestMapping(value = "/")
    public String findAll() {
        return "{\"message\":\"I am comment service\"}";
    }

}
