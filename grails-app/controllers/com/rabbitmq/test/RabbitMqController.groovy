package com.rabbitmq.test

class RabbitMqController {

    def rabbitMqProducerService

    def index() {
        rabbitMqProducerService.sendMessageAsString("nakul", "Hello from rabbit mq queue ")
        render "Success! please have a look at the terminal"
    }

    def messageAsMap() {
        Map<String, String> messageMap = [1: "One", 2: "Two"]
        rabbitMqProducerService.sendMessageAsMap("myTestQueue", messageMap)
        render "Success! please have a look at the terminal"
    }
}
