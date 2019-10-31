package com.dev.exceptions;

public class CustomException extends Exception {
    public CustomException() {
    	System.out.println("Custom Exception");
    }
    public CustomException(int n) {
    	System.out.println("Custom Exception for int argument");
    }
    public CustomException(String str) {
    	System.out.println("Custom Exception for string argument");
    }
    
}
