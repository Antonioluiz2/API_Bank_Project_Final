package br.com.luiz.itexperts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ItexpertsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItexpertsApplication.class, args);
	}


}
