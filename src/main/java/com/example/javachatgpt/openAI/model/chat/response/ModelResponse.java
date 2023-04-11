package com.example.javachatgpt.openAI.model.chat.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @className: ModelResponse
 * @description:
 * @tag
 * @author: louis
 * @date: 2023/4/6
 **/
@Data
public class ModelResponse implements Serializable {

    private List<Model> data;

    private String object;

}
