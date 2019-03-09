package com.audio.controllers;

import java.sql.Timestamp;
import java.util.UUID;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.audio.models.Message;
import com.audio.models.Response;

@RestController
public class MessageController {
	
	private Logger LOG = Logger.getLogger(getClass());
	
	@RequestMapping(value = "/message", method = RequestMethod.POST)
	public Response<Object> processMessage(@RequestBody Message message, @RequestParam String type) {
		
		LOG.info("Message processing started");
		message.setId(UUID.randomUUID().toString());
		message.setTime(new Timestamp(System.currentTimeMillis()));
		LOG.info("Message processing completed");
		
		
		Response<Object> response = new Response<>();
		response.setStatus("Success");
		response.setMessage("Message successfully sent");
		response.setResponse(message);
		
		return response;
	}
}
