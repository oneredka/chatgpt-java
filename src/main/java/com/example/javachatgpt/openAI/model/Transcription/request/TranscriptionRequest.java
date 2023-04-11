package com.example.javachatgpt.openAI.model.Transcription.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * @className: TranscriptionRequest
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/4/4
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TranscriptionRequest implements Serializable {
    private MultipartFile file;
}
