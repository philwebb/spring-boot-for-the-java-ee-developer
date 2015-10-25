package sbjee;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

@Component
@ServerEndpoint("/reverse")
public class ReverseEndpoint {

	@OnMessage
	public void handleMessage(Session session, String message)
			throws IOException {
		StringBuilder reverse = new StringBuilder(message).reverse();
		session.getBasicRemote().sendText("Reversed: " + reverse);
	}

}
