package com.example.blog.repositories;

import com.example.blog.models.PostImage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends CrudRepository<PostImage ,Long> {
}
