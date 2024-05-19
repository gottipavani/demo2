package com.example.demo.service;
import com.example.demo.enitites.Post;
import com.example.demo.payload.PostDto;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public PostDto savePost(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());
        Post newPost = postRepository.save(post);

PostDto dto=new PostDto();
dto.setPostid(newPost.getPostId());
dto.setTitle(newPost.getTitle());
dto.setContent(newPost.getContent());
dto.setDescription(newPost.getDescription());
return dto;

    }


}
