package sbjee;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	public InitializingBean testDataInitializer(CustomerRepository repository) {
		return () -> {
			repository.save(new Customer("Phil", "Webb"));
			repository.save(new Customer("Phil", "Silvers"));
			repository.save(new Customer("Phil", "Errup"));
			repository.save(new Customer("Josh", "Long"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
