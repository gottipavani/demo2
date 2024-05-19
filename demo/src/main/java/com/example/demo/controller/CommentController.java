package com.example.demo.controller;

import com.example.demo.enitites.Comment;
import com.example.demo.payload.CommentDto;
import com.example.demo.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/posts/")
public class CommentController{
    @Autowired
    private CommentService commentService;

    @PostMapping("{postId}/comments")
    public ResponseEntity<CommentDto> saveComment(@PathVariable Long postId, @RequestBody CommentDto commentDto){

        CommentDto dto=commentService.save(postId,commentDto);
        return ResponseEntity.ok(dto);
    }

}
