package com.example.javachatgpt.openAI.model.chat.response;

import com.example.javachatgpt.openAI.model.chat.request.Message;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
/**
 * @className: Choice
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/4/4
 **/
@Data
public class Choice implements Serializable {
    private Integer index;
    private Message message;
    @JsonProperty("finish_reason")
    private String finishReason;
}
