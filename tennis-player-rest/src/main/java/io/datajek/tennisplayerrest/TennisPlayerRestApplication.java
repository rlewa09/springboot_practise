package io.datajek.tennisplayerrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TennisPlayerRestApplication {
	@GetMapping("/welcome")
	public String welcome() {
		return "Tennis Player REST API";
	}
	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerRestApplication.class, args);
	}

}
