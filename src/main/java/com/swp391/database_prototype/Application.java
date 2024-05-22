package com.swp391.database_prototype;

import com.github.javafaker.Faker;
import com.swp391.database_prototype.pojos.Account;
import com.swp391.database_prototype.enums.Role;
import com.swp391.database_prototype.repositories.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Random;

@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner (AccountRepository accountRepository) {
		return args -> {
				logger.info("Application start");
				Faker faker = new Faker();
				Random rand = new Random();
				for (int i = 0; i < 50; i++) {
					Account account = Account.builder()
							.email(faker.internet().safeEmailAddress())
							.password(faker.internet().password())
							.dateCreated(LocalDateTime.now())
							.role(Role.CUSTOMER)
							.build();
					accountRepository.save(account);
				}

//				Account acc = Account.builder()
//						.email("nguyenhoangdung335@gmail.com")
//						.password("dung111004")
//						.dateCreated(LocalDateTime.now())
//						.role(Role.CUSTOMER)
//						.build();
//				accountRepository.save(acc);
//			acc = Account.builder()
//					.id("ACC00003")
//					.email("nguyenhoangdung335@gmail.com")
//					.password("dung111004")
//					.dateCreated(LocalDateTime.now())
//					.role(Role.CUSTOMER)
//					.build();
//			accountRepository.save(acc);
		};
	}
}
