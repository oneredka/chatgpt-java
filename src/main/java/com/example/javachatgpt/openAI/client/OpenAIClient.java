package com.example.javachatgpt.openAI.client;

import com.example.javachatgpt.openAI.model.chat.request.ChatGPTRequest;
import com.example.javachatgpt.openAI.model.Transcription.request.WhisperTranscriptionRequest;
import com.example.javachatgpt.openAI.model.chat.response.ChatGPTResponse;
import com.example.javachatgpt.openAI.model.chat.response.ModelResponse;
import com.example.javachatgpt.openAI.model.Transcription.response.WhisperTranscriptionResponse;
import com.example.javachatgpt.openAI.model.img.reqeuest.ImgRequest;
import com.example.javachatgpt.openAI.model.img.response.ImgResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @className: OpenAIClient
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/4/4
 **/
@FeignClient(
        name = "openai-service",
        url = "${openai-service.urls.base-url}",
        configuration = OpenAIClientConfig.class
)
public interface OpenAIClient {

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @return
     */
    @GetMapping(value = "${openai-service.urls.model-url}")
    ModelResponse models();

    /**
     * Creates a completion for the chat message
     * @param chatGPTRequest
     * @return
     */
    @PostMapping(value = "${openai-service.urls.chat-url}", headers = {"Content-Type=application/json"})
    ChatGPTResponse chat(@RequestBody ChatGPTRequest chatGPTRequest);

    /**
     *
     * @param whisperTranscriptionRequest
     * @return
     */
    @PostMapping(value = "${openai-service.urls.create-transcription-url}", headers = {"Content-Type=multipart/form-data"})
    WhisperTranscriptionResponse createTranscription(@ModelAttribute WhisperTranscriptionRequest whisperTranscriptionRequest);

    /**
     * generate images
     * @param imgRequest
     * @return
     */
    @PostMapping(value = "${openai-service.urls.img-generation-url}", headers = {"Content-Type=application/json"})
    ImgResponse imagesGenerations(@ModelAttribute ImgRequest imgRequest);
}
