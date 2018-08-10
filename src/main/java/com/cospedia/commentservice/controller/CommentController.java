package com.cospedia.commentservice.controller;


import com.cospedia.commentservice.model.Comment;
import com.cospedia.commentservice.repository.CommentRepository;
import com.cospedia.commentservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Comment> findAll(){return commentService.findAll();}

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        commentService.deleteByCommentId(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Collection<Comment> addComment(@RequestBody Comment comment){
        commentRepository.save(comment);
        return commentService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Iterable <Comment> updateComment(@PathVariable Long id , @RequestBody Comment comment){
        Comment s = commentRepository.findById(id).get();
        s.setComment(s.getComment());
        commentRepository.save(comment);
        return commentService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Comment findByUserId(@PathVariable Long userId){return commentService.findByUserId(userId);}
}
