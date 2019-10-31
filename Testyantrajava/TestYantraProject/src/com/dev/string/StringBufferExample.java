package com.dev.string;

public class StringBufferExample {

	public static void main(String[] args) {
		String str="Hello";
		//StringBuffer sb="hello"; we can not assign String literal in String Buffer and StringBilder
		StringBuffer sb=new StringBuffer("Hello");
		StringBuilder sbi=new StringBuilder("Hello");
		System.out.println(str);
		System.out.println(sb);
		System.out.println(sbi);
		System.out.println(sb.length());//length of StringBuffer.
		System.out.println(sb.capacity());//capacity of StringBuffer.

	}

}
