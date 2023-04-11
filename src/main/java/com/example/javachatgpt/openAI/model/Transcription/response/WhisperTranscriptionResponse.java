package com.example.javachatgpt.openAI.model.Transcription.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @className: WhisperTranscriptionResponse
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/4/4
 **/
@Data
public class WhisperTranscriptionResponse implements Serializable {
    private String text;
}
