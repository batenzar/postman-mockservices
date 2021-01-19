package io.batenzar.springbootbasicauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class SpringbootBasicauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBasicauthApplication.class, args);
	}

}
