package com.example.ChatRoom.controllers;

import com.example.ChatRoom.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {


    @MessageMapping("/message")
    //send message to all who all are subscribed to the bleow url
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message){
        try{
            Thread.sleep(2000);


        }catch(InterruptedException e){

        }
        return message;
    }
}
