package com.seoultech.blog.controllers;

import com.seoultech.blog.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.seoultech.blog.services.PostService;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    private PostService postService;

    @PostMapping(value = "/")
    public String index(){
        return "Index";
    }

    @GetMapping(value="/posts")
    public List<Post> posts(){
        return postService.getAllPosts();
    }

    @PostMapping(value="/post")
    public void publicPost(@RequestBody Post post){
        postService.insert(post);
    }
}
