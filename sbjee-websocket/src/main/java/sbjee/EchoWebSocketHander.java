package sbjee;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class EchoWebSocketHander extends TextWebSocketHandler {

	@Override
	protected void handleTextMessage(WebSocketSession session,
			TextMessage message) throws Exception {
		session.sendMessage(new TextMessage("Back atcha' "+message));
	}

}
