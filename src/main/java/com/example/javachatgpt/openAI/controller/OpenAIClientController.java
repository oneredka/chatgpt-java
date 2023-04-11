package com.example.javachatgpt.openAI.controller;

import com.example.javachatgpt.openAI.model.chat.request.ChatRequest;
import com.example.javachatgpt.openAI.model.chat.response.ChatGPTResponse;
import com.example.javachatgpt.openAI.model.Transcription.request.TranscriptionRequest;
import com.example.javachatgpt.openAI.model.chat.response.ModelResponse;
import com.example.javachatgpt.openAI.model.Transcription.response.WhisperTranscriptionResponse;
import com.example.javachatgpt.openAI.model.img.reqeuest.ImgRequest;
import com.example.javachatgpt.openAI.model.img.response.ImgResponse;
import com.example.javachatgpt.openAI.service.OpenAIClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @className: OpenAIClientController
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/4/4
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1")
public class OpenAIClientController {

    private final OpenAIClientService openAIClientService;

    @GetMapping(value = "/models")
    public ModelResponse models(){
        return openAIClientService.listModels();
    }

    @PostMapping(value = "/chat", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ChatGPTResponse chat(@RequestBody ChatRequest chatRequest){
        return openAIClientService.chat(chatRequest);
    }

    @PostMapping(value = "/transcription", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public WhisperTranscriptionResponse createTranscription(@ModelAttribute TranscriptionRequest transcriptionRequest){
        return openAIClientService.createTranscription(transcriptionRequest);
    }

    @PostMapping(value = "/images/generations", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ImgResponse imagesGenerations(@RequestBody ImgRequest imgRequest){
        return openAIClientService.imagesGenerations(imgRequest);
    }

}
