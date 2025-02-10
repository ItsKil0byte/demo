package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        Post first = new Post("Мой первый пост :)");
        Post second = new Post("В интернете весело :)");
        Post third = new Post("Продам героин.");

        List<Post> posts = new ArrayList<>();
        posts.add(first);
        posts.add(second);
        posts.add(third);

        return posts;
    }
}
