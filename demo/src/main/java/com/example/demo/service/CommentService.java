package com.example.demo.service;

import com.example.demo.enitites.Comment;
import com.example.demo.enitites.Post;
import com.example.demo.payload.CommentDto;
import com.example.demo.repository.CommentRepository;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CommentService{
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostRepository postRepository;
    public  CommentDto save(Long postId, CommentDto commentDto) {
        Post post =postRepository.findById(postId).get();
                Comment comment = new Comment();

                comment.setBody(commentDto.getBody());
                comment.setEmail(commentDto.getEmail());
                comment.setName(commentDto.getName());
                comment.setPost(post);
         Comment newComment = commentRepository.save(comment);
         CommentDto dto=new CommentDto();
        dto.setCommentid(newComment.getCommentId());

         dto.setName(newComment.getName());
        dto.setEmail(newComment.getEmail());
        dto.setBody(newComment.getBody());
dto.setPostDto(newComment.getPost());
        return dto;
    }
}
