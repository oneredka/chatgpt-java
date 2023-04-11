package com.example.javachatgpt.openAI.model.chat.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @className: ChatGPTRequest
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/4/4
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatGPTRequest implements Serializable {
    private String model;
    private List<Message> messages;
}
