package com.example.rest;

import com.example.rest.client.RestClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(RestApplication.class, args);
		RestClient client = new RestClient();
		//Thread.sleep(4000);
		client.sendAndReceiveInfo();
	}
}
