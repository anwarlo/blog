package com.example.blog.repositories;

import com.example.blog.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends CrudRepository<Post,Long> {
//                                 post comes from java class    becuse id in Post class is Lonf
    //its gonna be same
}
