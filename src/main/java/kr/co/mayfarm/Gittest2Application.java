package kr.co.mayfarm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Gittest2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Gittest2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello, World");
	}

}
