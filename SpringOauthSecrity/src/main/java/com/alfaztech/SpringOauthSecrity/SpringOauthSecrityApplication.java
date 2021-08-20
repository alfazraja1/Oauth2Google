package com.alfaztech.SpringOauthSecrity;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOauthSecrityApplication {
	
	@GetMapping
	public String welcome()
	{
		return "Welcome in Google Security";
	}
	
	@GetMapping("/user")
	public Principal user(Principal principal )
	{
		System.out.print("UserName = " +principal.getName());
		return principal;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringOauthSecrityApplication.class, args);
		
		
	}

}
