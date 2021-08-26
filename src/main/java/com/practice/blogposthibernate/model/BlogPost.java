package com.practice.blogposthibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "blog_posts")
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String post;

    @Column(name = "author_name")
    private String authorName;

    public BlogPost() {}

    public BlogPost(String post, String authorName) {
        this.post = post;
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
