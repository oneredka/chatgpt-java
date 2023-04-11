package com.example.javachatgpt.openAI.model.chat.request;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @className: Message
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/4/4
 **/
@Data
@Builder
public class Message implements Serializable {
    private String role;
    private String content;
}

