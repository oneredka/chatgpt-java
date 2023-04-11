package com.example.javachatgpt.openAI.model.chat.response;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * @className: ChatGPTResponse
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/4/4
 **/
@Data
public class ChatGPTResponse implements Serializable {
    private String id;
    private String object;
    private String model;
    private LocalDate created;
    private List<Choice> choices;
    private Usage usage;
}
