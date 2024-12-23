package com.gustavo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.gustavo.models.Users;
import com.gustavo.repository.UsersRepository;

@SpringBootApplication

public class BudgetTrackerSpringApplication {

	public static void main(String[] args) {

	SpringApplication.run(BudgetTrackerSpringApplication.class, args);
}

@Bean
	CommandLineRunner initDatabase(UsersRepository usersRepository){
		return args -> {
			Users u = new Users();
			
			u.setName("Gustavinho do Grau");		
			u.setBalance(625.96f);	
			
			usersRepository.save(u);

	};
}
}
