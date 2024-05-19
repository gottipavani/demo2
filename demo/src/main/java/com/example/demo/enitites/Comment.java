package com.example.demo.enitites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "comments")
    public class Comment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "comment_id")
        private Long commentId;

        @Column(name = "name")
        private String name;

        @Column(name = "email")
        private String email;

        @Column(name = "body")
        private String body;

        @ManyToOne
        @JoinColumn(name = "post_id")
        private Post post;


    }




