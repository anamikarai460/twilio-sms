package com.twiliosms.controller;
import com.twiliosms.SmsRequest;
import com.twiliosms.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/sms")
public class SmsController {
    @Autowired
    private SmsService smsService;
//    @Autowired
//    public SmsController(SmsService twilioService) {
//        this.smsService = twilioService;
//    }
    @PostMapping("/send")
    public void sendSms(@RequestBody SmsRequest smsRequest) {
        // Replace with the actual phone number and message
//        String toPhoneNumber = "+1234567890";
//        String message = "Hello, this is a test message from your Spring Boot application.";
        smsService.sendSms(smsRequest.getTo(), smsRequest.getMessage());
//        smsService.sendSms(toPhoneNumber, message);
    }
    public void test(){
    }

}

