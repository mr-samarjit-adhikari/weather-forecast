package com.sapient.oauth2.ssofacebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@EnableOAuth2Sso
@SpringBootApplication
public class SsoFacebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsoFacebookApplication.class, args);
	}

}
