package com.audio.models;

import java.sql.Timestamp;

public class Message {
	String id;
	String senderId;
	String recieverId;
	Timestamp time;
	Object content;

	public Message() {
		super();
	}

	public Message(String id, String senderId, String recieverId, Timestamp time, Object content) {
		super();
		this.id = id;
		this.senderId = senderId;
		this.recieverId = recieverId;
		this.time = time;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getRecieverId() {
		return recieverId;
	}

	public void setRecieverId(String recieverId) {
		this.recieverId = recieverId;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
}
