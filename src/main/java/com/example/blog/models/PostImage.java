package com.example.blog.models;

import javax.persistence.*;

@Entity
@Table(name = "post_images")
public class PostImage {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = true)
    private String path;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;



    public PostImage(){

    }

    public PostImage(String path,Post post){
        this.path = path;
        this.post = post;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getPath(){
        return path;
    }

    public void setPath(String path){
        this.path = path;
    }

    public Post getPost(){
        return post;
    }

    public void setPost(Post post){
        this.post = post;
    }

}
