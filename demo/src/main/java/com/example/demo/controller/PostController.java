package com.example.demo.controller;

import com.example.demo.enitites.Post;
import com.example.demo.payload.PostDto;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<PostDto> savePost(@RequestBody PostDto postDtO) {
        PostDto dto = postService.savePost(postDtO);

        return ResponseEntity.ok(dto);
    }
}


