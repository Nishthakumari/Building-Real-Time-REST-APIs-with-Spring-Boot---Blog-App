package com.springboot.blog.springbootblogrestapi.service;

import com.springboot.blog.springbootblogrestapi.payload.PostDto;

import java.util.List;


public interface PostService {
    PostDto createPost(PostDto postDto);
    List<PostDto> getAllPosts();
}
