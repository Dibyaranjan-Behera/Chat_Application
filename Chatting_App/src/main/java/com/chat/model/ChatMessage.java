package com.chat.model;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
//@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
	
	private Integer id;
	private String sender;
	private String content;
}
