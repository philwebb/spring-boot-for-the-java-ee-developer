package sbjee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	public FilterRegistrationBean filterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean(new LogFilter());
		registration.addUrlPatterns("/home/*");
		return registration;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
