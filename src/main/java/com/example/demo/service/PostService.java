package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;

    {
        Post first = new Post(0L, "Мой первый пост :)", new Date());
        Post second = new Post(1L, "В интернете весело :)", new Date());
        Post third = new Post(2L, "Я люблю Java.", new Date());

        first.setLikes(11);
        second.setLikes(4);
        third.setLikes(7);

        posts = new ArrayList<>(List.of(first, second, third));
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(), text, new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }
}
