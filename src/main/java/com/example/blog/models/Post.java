package com.example.blog.models;


import com.example.blog.models.User;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity @Table(name = "posts")
public class Post {
//creating table
    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false,length = 100)
    private String title;

    @Column(nullable = false)
    private String body;


    @ManyToOne @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<PostImage> postImages;


    public Post(String title, String body,User user,List<PostImage> postImages) {
        this.title = title;
        this.body = body;
        this.user = user;
        this.postImages = postImages;
    }


    public Post() {
    }

    public List<PostImage> getPostImages(){
        return postImages;
    }

    public void setPostImages(List<PostImage> postImages){
        this.postImages = postImages;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    //geters and seters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

//to create the Post table and all the columns and then post repository interface