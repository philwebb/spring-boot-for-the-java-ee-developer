package sbjee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.dumbster.smtp.SimpleSmtpServer;

@SpringBootApplication
public class Application {

	@Bean
	public CommandLineRunner runner(MailSender sender) {
		return (a) -> {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo("example@example.com");
			message.setText("Hello World!");
			sender.send(message);
		};
	}

	public static void main(String[] args) {
		SimpleSmtpServer server = SimpleSmtpServer.start(8025);
		try {
			SpringApplication.run(Application.class, args);
		} finally {
			System.err.println(server.getReceivedEmail().next());
			server.stop();
		}
	}

}
