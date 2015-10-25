package sbjee;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@JmsListener(destination = "testQueue")
	public void processMessage(String content) {
		System.err.println(content);
	}

}
