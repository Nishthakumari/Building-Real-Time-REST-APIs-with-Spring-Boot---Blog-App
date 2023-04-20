package com.springboot.blog.springbootblogrestapi.service;

import com.springboot.blog.springbootblogrestapi.payload.PostDto;
import com.springboot.blog.springbootblogrestapi.payload.PostResponse;


public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy);
    PostDto getPostById(long id);
    PostDto updatePost(PostDto postDto, long id);
    void deletePostById(long id);


}
