package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        Post first = new Post("Мой первый пост :)", 7);
        Post second = new Post("В интернете весело :)", 4);
        Post third = new Post("Я люблю Java.", 11);

        List<Post> posts = new ArrayList<>();
        posts.add(first);
        posts.add(second);
        posts.add(third);

        return posts;
    }
}
