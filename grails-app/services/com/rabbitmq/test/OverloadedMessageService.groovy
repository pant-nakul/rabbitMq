package com.rabbitmq.test

import grails.transaction.Transactional

@Transactional(readOnly = true)
class OverloadedMessageService {
    static rabbitQueue = 'myTestQueue'

    void handleMessage(String message) {
        println "========================================================"

        println("Message Received ${message}")
        // We have recieved the message from the rabbitmq server's queue

        println "========================================================"
    }

    void handleMessage(Map message) {
        println "========================================================"
        // do something with the map
        println message.getClass()
        println message
        // We have recieved the message from the rabbitmq server's queue

        println "========================================================"
    }
}
