package com.will.iotmanager.controller;

import com.will.iotmanager.model.Message;
import com.will.iotmanager.service.MqttPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqttController {

    @Autowired
    private MqttPublisher mqttPublisher;

    @PostMapping("/publish")
    public String publishMessage(@RequestParam String topic, @RequestParam String message) {
        try {
            mqttPublisher.sendMessage(topic, message);
            return "Mensagem publicada com sucesso!";
        } catch (Exception e) {
            return "Erro ao publicar mensagem: " + e.getMessage();
        }
    }

    @PostMapping("/receive")
    public void receiveMesage(@RequestBody Message message) {
        System.out.println(message.getMessage());
    }
}
