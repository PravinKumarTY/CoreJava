package com.dev.exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Print statement before.");
		StringBuffer sb=new StringBuffer(-1);
		s();
		System.out.println("Print Statement after");
	}
	public static void s() {
		StringBuffer sb=new StringBuffer(-1);
	}
}
