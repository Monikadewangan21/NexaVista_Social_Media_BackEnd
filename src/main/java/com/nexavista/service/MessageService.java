package com.nexavista.service;

import java.util.List;

import com.nexavista.exception.ChatException;
import com.nexavista.exception.MessageException;
import com.nexavista.exception.UserException;
import com.nexavista.model.Message;
import com.nexavista.request.SendMessageRequest;

public interface MessageService  {
	
	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public String deleteMessage(Integer messageId) throws MessageException;

}
