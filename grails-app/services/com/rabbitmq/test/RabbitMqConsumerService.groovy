package com.rabbitmq.test

import grails.transaction.Transactional

@Transactional(readOnly = true)
class RabbitMqConsumerService {

    static rabbitQueue = 'nakul'
    // This method gets called by the plugin whenever there is any new message in the queue.
    void handleMessage(message) {
        println "========================================================"

        println("Message Received ${message}")
        // We have recieved the message from the rabbitmq server's queue

        println "========================================================"
    }
}
