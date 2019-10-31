package com.dev.inheritance;

public class WhatsAppVerTwo {
	static WhatsAppVerTwo w2=new WhatsAppVerTwo();
	String version="V2000";
	public void sendVideo() {
		System.out.println("This is "+version);
	}
	public static void main(String[] args) {
		w2.sendVideo();
	}
}
