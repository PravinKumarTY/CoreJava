package com.dev.string;

public class StringMethodTwo {

	public static void main(String[] args) {
		String str="Hello Java";
		String str1="Hello java";
		int length=str.length();
		System.out.println("Output of length().."+length);
		char[] chaArr=str.toCharArray();
		System.out.println("Output of toCharArray()..:"+chaArr[6]);
		char ch=str.charAt(3);
		System.out.println("Output of charAt().."+ch);
		boolean eq=str.equals(str1);
		System.out.println("Output of equals()..:"+eq);
		boolean eqIngCase=str.equalsIgnoreCase(str1);
		System.out.println("Output of equalIgnoreCase()..:"+eqIngCase);
		
		

	}
}
