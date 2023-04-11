package com.example.javachatgpt.openAI.model.img.response;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * @className: ImgResponse
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/4/6
 **/
@Data
public class ImgResponse implements Serializable {

    private LocalDate created;

    private List<ImgUrl> data;
}
