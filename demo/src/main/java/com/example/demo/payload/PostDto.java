package com.example.demo.payload;

import com.example.demo.enitites.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
 public class PostDto{
  private Long Postid;
  private String title;
  private String content;
  private String description;

 public PostDto(Post post) {
 }
}