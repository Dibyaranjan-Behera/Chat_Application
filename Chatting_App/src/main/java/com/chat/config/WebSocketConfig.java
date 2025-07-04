package com.chat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		
		registry.addEndpoint("/chat")  //defining end-point of the application (ex-localhost:8080/chat)
				.setAllowedOrigins("http://localhost:8080")  //Restricts origins to http://localhost:8080 (for security)
				.withSockJS(); //Supports fallback communication methods using SockJS if WebSocket is not available
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		
		//set message broker
		registry.enableSimpleBroker("/topic");  //"/topic" is a destination prefix for broadcasting messages.
		//expect message with /app/sendMessage
		registry.setApplicationDestinationPrefixes("/app"); //Any STOMP message sent to a destination starting with /app will be routed to a method annotated with @MessageMapping
	}

}
