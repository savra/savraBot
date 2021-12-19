package com.hvdbs.savrabot;

import com.hvdbs.savrabot.service.SavraBot;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.security.auth.login.LoginException;

@SpringBootApplication
public class SavraBotApplication {
	public static void main(String[] args) throws LoginException {
		SpringApplication springApplication = new SpringApplication(SavraBotApplication.class);

		JDA jda = JDABuilder.createDefault("token").addEventListeners(new SavraBot()).build();

		springApplication.run(args);
	}

}
