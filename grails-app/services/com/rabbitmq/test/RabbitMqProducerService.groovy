package com.rabbitmq.test

import grails.transaction.Transactional

@Transactional(readOnly = true)
class RabbitMqProducerService {

    void sendMessageAsString(String queue, String message) {

        rabbitSend "${queue}", "${message}"
    }

    void sendMessageAsMap(String queue, Map mapMessage) {
        rabbitSend "${queue}", mapMessage
    }
}
