package com.dev.inheritance;

public class WhatsAppVerOne {
	static WhatsAppVerOne w=new WhatsAppVerOne();
	String version="V1000";
	public void sendMessage() {
		System.out.println("This is Send message of:"+version);
	}
	public static void main(String[] args) {
		w.sendMessage();
	}
}
