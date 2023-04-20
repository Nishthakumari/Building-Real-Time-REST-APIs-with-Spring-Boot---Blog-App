package com.springboot.blog.springbootblogrestapi.payload;

import lombok.Data;

import java.util.Set;

@Data
public class PostDto {

    private long id;
    private String title;
    private String description;
    private String content;
    private Set<CommentDto> comments;

}
