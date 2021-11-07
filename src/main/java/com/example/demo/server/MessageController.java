package com.example.demo.server;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic")
    public TrackMessage sendMessage(@Payload TrackMessage tarckMessage) {
        return tarckMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic")
    public TrackMessage addUser(@Payload TrackMessage tarckMessage, SimpMessageHeaderAccessor headerAccessor){
        headerAccessor.getSessionAttributes().put("username", tarckMessage.getSender());
        return tarckMessage;
    }
}