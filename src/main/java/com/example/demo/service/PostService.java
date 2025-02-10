package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts = new ArrayList<>();

    {
        posts.add(new Post("Мой первый пост :)", new Date(), 7));
        posts.add(new Post("В интернете весело :)", new Date(), 4));
        posts.add(new Post("Я люблю Java.", new Date(), 11));
    }

    public void create(String text) {
        posts.add(new Post(text, new Date(), 0));
    }

    public List<Post> listAllPosts() {
        return posts;
    }
}
