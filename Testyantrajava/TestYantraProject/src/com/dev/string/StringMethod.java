package com.dev.string;

public class StringMethod {
	public static void main(String []args) {
		String str="Some string";
		String str1="Some String";
		int length=str.length();
		System.out.println("Length of string..:"+length);
		char[] ch=str.toCharArray();
		System.out.println(ch[10]);
		char charch=str.charAt(5);
		System.out.println("Output of charAt()..:"+charch);
		boolean b=str.equals(str1);
		System.out.println("Output of equals.:"+b);
		boolean eqIng=str.equalsIgnoreCase(str1);
		System.out.println("Output of equalIgnoreCase:"+eqIng);
		boolean contain=str.contains("Som");
		System.out.println("Output of contains() method..:"+contain);
		String replace=str.replace('S','A');
		System.out.println("Output of replace()..:"+replace);
		int indexOf=str.indexOf('S');
		System.out.println("Output of indexOf() ..:"+indexOf);
		String upperCase=str.toUpperCase();
		System.out.println("Output UpperCase..:"+upperCase);
		String lowerCase=str.toLowerCase();
		System.out.println("Output of toLowerCase()..:"+lowerCase);
		String subStr=str.substring(3,12);
		System.out.println("Substring..:"+subStr);
		
	}
}
