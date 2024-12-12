package com.gustavo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.gustavo.models.Users;
import com.gustavo.repository.UsersRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"com.gustavo"})
public class BudgetTrackerSpringApplication {

	public static void main(String[] args) {

	SpringApplication.run(BudgetTrackerSpringApplication.class, args);
}

@Bean
	CommandLineRunner initDatabase(UsersRepository usersRepository){
		return args -> {
			usersRepository.deleteAll();

			Users u = new Users();
				u.setId(1);
				u.setName("Gustavo");
				u.setBalance(625.96f);
				usersRepository.save(u);				
		};
	}
}
