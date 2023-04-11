package com.example.javachatgpt.openAI.model.chat.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
/**
 * @className: Usage
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/4/4
 **/
@Data
public class Usage implements Serializable {

    @JsonProperty("prompt_tokens")
    private String promptTokens;

    @JsonProperty("completion_tokens")
    private String completionTokens;

    @JsonProperty("total_tokens")
    private String totalTokens;
}

