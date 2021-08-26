package com.practice.blogposthibernate.repository;

import com.practice.blogposthibernate.model.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostsRepository extends CrudRepository<BlogPost, Integer> {
}
