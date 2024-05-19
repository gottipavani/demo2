package com.example.demo.enitites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
 @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name = "posts")
    public class Post {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "post_id")
        private Long postId;

        @Column(name = "title")
        private String title;

        @Column(name = "description")
        private String description;

        @Column(name = "content")
        private String content;

        @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
        private List<Comment> comments;
    }
