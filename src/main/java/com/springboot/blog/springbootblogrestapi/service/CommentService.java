package com.springboot.blog.springbootblogrestapi.service;

import com.springboot.blog.springbootblogrestapi.payload.CommentDto;

public interface CommentService {
    CommentDto createComment(long post_id, CommentDto commentDto);
}
