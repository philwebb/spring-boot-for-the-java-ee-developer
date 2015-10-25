package sbjee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class Application {

	@Bean
	public CommandLineRunner runner(MyService service) {
		return (a) -> {
			System.err.println(service.lengthy(1));
			System.err.println(service.lengthy(2));
			System.err.println(service.lengthy(1));
			System.err.println(service.lengthy(2));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
