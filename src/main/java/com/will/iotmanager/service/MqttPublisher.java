package com.will.iotmanager.service;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MqttPublisher {

    @Autowired
    private MqttClient mqttClient;

    public void sendMessage(String topic, String payload) throws Exception {
        MqttMessage message = new MqttMessage(payload.getBytes());
        message.setQos(2);
        message.setRetained(Boolean.TRUE);
        mqttClient.publish(topic, message);
    }
}
