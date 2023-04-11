package com.example.javachatgpt.openAI.model.chat.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @className: Permission
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/4/6
 **/
@Data
public class Permission implements Serializable {

    private String id;
    private String object;
    private LocalDate created;
    @JsonProperty("allow_create_engine")
    private boolean allow_create_engine;
    @JsonProperty("allow_sampling")
    private boolean allow_sampling;
    @JsonProperty("allow_logprobs")
    private boolean allow_logprobs;
    @JsonProperty("allow_search_indices")
    private boolean allow_search_indices;
    @JsonProperty("allow_view")
    private boolean allow_view;
    @JsonProperty("allow_fine_tuning")
    private boolean allow_fine_tuning;
    private String organization;
    private String group;
    @JsonProperty("is_blocking")
    private boolean is_blocking;
}
