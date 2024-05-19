package com.example.demo.repository;

import com.example.demo.enitites.Comment;
import com.example.demo.enitites.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
        List<Comment> findByPost(Post post);

    }

