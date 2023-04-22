package com.springboot.blog.springbootblogrestapi.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {

    private long id;

    @NotEmpty(message = "Name should not be null or Empty")
    private String name;

    @NotEmpty(message = "Name should not be null or Empty")
    @Email
    private String email;
    
    @NotEmpty
    @Size(min = 10, message = "Comment  body must be minimum 10 characters")
    private String body;
}
