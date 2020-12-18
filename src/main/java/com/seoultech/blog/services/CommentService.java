package com.seoultech.blog.services;

import com.seoultech.blog.entities.Comment;
import com.seoultech.blog.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getComments(Long postId) {
        return commentRepository.findByPostId(postId);
    }

    public void comment(Comment comment) {
        commentRepository.save(comment);
    }

    public boolean deletePost(Long id) {
        commentRepository.deleteById(id);
        return true;
    }
}
