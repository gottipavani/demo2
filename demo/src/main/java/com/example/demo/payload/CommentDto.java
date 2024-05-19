package com.example.demo.payload;

import com.example.demo.enitites.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CommentDto {
    private Long Commentid;
    private String body;
    private String name;
    private String email;
    private Post postDto;

}
