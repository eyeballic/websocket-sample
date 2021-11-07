package com.example.demo.server;

import java.awt.TrayIcon.MessageType;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TrackMessage {

    private MessageType type;
    private String content;
    private String sender;
    private String time;
    
    public TrackMessage() {
    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    		this.time = LocalDateTime.now().format(formatter);
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
    
    public String getTime() {
    		return time;
    }
}