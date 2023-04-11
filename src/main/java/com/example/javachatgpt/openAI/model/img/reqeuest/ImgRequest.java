package com.example.javachatgpt.openAI.model.img.reqeuest;

import lombok.Data;

import java.io.Serializable;

/**
 * @className: ImgRequest
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/4/6
 **/
@Data
public class ImgRequest implements Serializable {
    /**
     * A text description of the desired image(s). The maximum length is 1000 characters.
     */
    private String prompt;
    /**
     * The number of images to generate. Must be between 1 and 10.
     */
    private Integer n;
    private String size;

    /**
     * The format in which the generated images are returned. Must be one of url or b64_json.
     * Defaults to url
     */
    private String response_format = "url";
}
