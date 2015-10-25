package sbjee;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/**")
	public String hello() {
		randomlySleep();
		return "Hello World!";
	}

	private void randomlySleep() {
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException ex) {
		}
	}

}
