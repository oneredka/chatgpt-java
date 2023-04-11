package com.example.javachatgpt.openAI.model.chat.request;

import lombok.Data;

import java.io.Serializable;
/**
 * @className: ChatRequest
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/4/4
 **/
@Data
public class ChatRequest implements Serializable {
    private String question;
}
