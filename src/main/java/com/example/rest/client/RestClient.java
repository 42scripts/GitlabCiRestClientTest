package com.example.rest.client;

import com.example.rest.domen.RequestRetryJob;
import com.example.rest.domen.TestObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

public class RestClient {
    public static void sendAndReceiveInfo(){
        RestTemplate restTemplate = new RestTemplate();
/*        TestObject testObject = restTemplate.getForObject("http://localhost:8080/message/1", TestObject.class);
        System.out.println("id:   "+testObject.getId());
        System.out.println("message:   "+testObject.getMessage());*/

        RequestRetryJob requestRetryJob = restTemplate.getForObject("http://bcvm649:8081/api/v4/projects/1/pipelines/46/retry", RequestRetryJob.class);
    }
}
