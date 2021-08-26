package com.practice.blogposthibernate.controller;

import com.practice.blogposthibernate.model.BlogPost;
import com.practice.blogposthibernate.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    private BlogPostService blogPostService;

    @GetMapping("/")
    public Iterable<BlogPost> findAllPosts() {
        return blogPostService.getBlogPosts();
    }

    @GetMapping("post/{id}")
    public Optional<BlogPost> findPost(@PathVariable int id) {
        return blogPostService.getBlogPost(id);
    }

    @PostMapping("/addPost")
    public BlogPost addBlogPost(@RequestBody BlogPost blogPost) {
        return blogPostService.savePost(blogPost);
    }

    @PutMapping("/updatePost")
    public BlogPost updatePost(@RequestBody BlogPost blogPost) {
        return blogPostService.updateBlogPost(blogPost);
    }

    @DeleteMapping("/deletePost/{id}")
    public String deletePost(@PathVariable int id) {
        return blogPostService.deleteBlogPost(id);
    }

}