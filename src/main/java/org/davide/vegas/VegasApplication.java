package org.davide.vegas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VegasApplication {

	public static void main(String[] args) {
		System.out.println(System.getProperties().get("java.library.path"));
		SpringApplication.run(VegasApplication.class, args);
	}
}
