package com.practice.blogposthibernate.service;

import com.practice.blogposthibernate.model.BlogPost;
import com.practice.blogposthibernate.repository.BlogPostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogPostService {

    @Autowired
    private BlogPostsRepository blogPostsRepository;

    public BlogPost savePost(BlogPost blogPost) {
        return blogPostsRepository.save(blogPost);
    }

    public Iterable<BlogPost> getBlogPosts() {
        return blogPostsRepository.findAll();
    }

    public Optional<BlogPost> getBlogPost(int id) {
        return blogPostsRepository.findById(id);
    }

    public String deleteBlogPost(int id) {
        blogPostsRepository.deleteById(id);
        return "Product deleted with an id of " + id;
    }

    public BlogPost updateBlogPost(BlogPost blogPost) {
        BlogPost existingPost = blogPostsRepository.findById(blogPost.getId()).orElse(null);
        assert existingPost != null;
        existingPost.setPost(blogPost.getPost());
        existingPost.setAuthorName(blogPost.getAuthorName());
        return blogPostsRepository.save(existingPost);
    }

}
