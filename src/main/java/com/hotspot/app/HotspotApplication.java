package com.hotspot.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HotspotApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotspotApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(UserRepository repository) {
		return args -> {
			repository.save(
				new User("John","Smith","jsmith@email.com","password","1")
			);
			repository.save(
				new User("Sarah","Thomson","sthomson@email.com","password","2")
			);
			repository.save(
				new User("Jane","Stewart","jstewart@email.com","password","3")
			);
			repository.save(
				new User("Greg","Custis","gcustis@email.com","password","4")
			);
			repository.save(
				new User("Patricia","Reid","preid@email.com","password","1")
			);
		};
	}

}
