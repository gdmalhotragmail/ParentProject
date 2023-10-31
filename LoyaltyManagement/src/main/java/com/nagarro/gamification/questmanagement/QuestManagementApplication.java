package com.nagarro.gamification.questmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
@SpringBootApplication
@EnableMongoRepositories
public class QuestManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestManagementApplication.class, args);
	}
	
	@Bean
    public OpenAPI usersMicroserviceOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Loyalty")
                                 .description("LoyaltyDesc")
                                 .version("1.0"));
    }
	


}
