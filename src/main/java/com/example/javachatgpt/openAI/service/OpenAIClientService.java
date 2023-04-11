package com.example.javachatgpt.openAI.service;

import com.example.javachatgpt.openAI.client.OpenAIClient;
import com.example.javachatgpt.openAI.client.OpenAIClientConfig;
import com.example.javachatgpt.openAI.model.Transcription.request.TranscriptionRequest;
import com.example.javachatgpt.openAI.model.Transcription.request.WhisperTranscriptionRequest;
import com.example.javachatgpt.openAI.model.chat.request.*;
import com.example.javachatgpt.openAI.model.chat.response.ChatGPTResponse;
import com.example.javachatgpt.openAI.model.chat.response.ModelResponse;
import com.example.javachatgpt.openAI.model.Transcription.response.WhisperTranscriptionResponse;
import com.example.javachatgpt.openAI.model.img.reqeuest.ImgRequest;
import com.example.javachatgpt.openAI.model.img.response.ImgResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * @className: OpenAIClientService
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/4/4
 **/
@Service
@RequiredArgsConstructor
public class OpenAIClientService {

    private final OpenAIClient openAIClient;
    private final OpenAIClientConfig openAIClientConfig;

    private final static String ROLE_USER = "user";

    public ChatGPTResponse chat(ChatRequest chatRequest){
        Message message = Message.builder()
                .role(ROLE_USER)
                .content(chatRequest.getQuestion())
                .build();
        ChatGPTRequest chatGPTRequest = ChatGPTRequest.builder()
                .model(openAIClientConfig.getModel())
                .messages(Collections.singletonList(message))
                .build();
        ChatGPTResponse response = openAIClient.chat(chatGPTRequest);
        System.out.println(response.getChoices().get(0).getMessage().getContent());
        return response;
    }

    public WhisperTranscriptionResponse createTranscription(TranscriptionRequest transcriptionRequest){
        WhisperTranscriptionRequest whisperTranscriptionRequest = WhisperTranscriptionRequest.builder()
                .model(openAIClientConfig.getAudioModel())
                .file(transcriptionRequest.getFile())
                .build();
        return openAIClient.createTranscription(whisperTranscriptionRequest);
    }

    public ModelResponse listModels(){
        return openAIClient.models();
    }

    public ImgResponse imagesGenerations(ImgRequest imgRequest){
        return openAIClient.imagesGenerations(imgRequest);
    }
}
