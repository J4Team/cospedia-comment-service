package com.cospedia.commentservice.service;

import com.cospedia.commentservice.model.Comment;
import com.cospedia.commentservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public void deleteByUserId(Long userId) {
        commentRepository.deleteById(userId);
    }
    public void deleteByCommentId(Long commentId) {
        commentRepository.deleteById(commentId);
    }

    public Comment findByUserId(Long userId) {
        return commentRepository.findById(userId).get();
    }
    public Comment findByCommentId(Long commentId) {
        return commentRepository.findById(commentId).get();
    }

}
