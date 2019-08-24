package com.thaido.springwebflux;

import com.thaido.springwebflux.client.GreetingWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebfluxApplication.class, args);

		GreetingWebClient client = new GreetingWebClient();
    System.out.println(client.getResult());
	}

}
