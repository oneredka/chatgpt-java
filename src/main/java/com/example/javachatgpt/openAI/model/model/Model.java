package com.example.javachatgpt.openAI.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @className: Model
 * @description:
 * @tag
 * @author: louis
 * @date: 2023/4/6
 **/
@Data
public class Model  implements Serializable {
    private String id;
    private String object;
    private List<Permission> permission;
    @JsonProperty("owned_by")
    private String ownedBy;
}
