package com.dev.array;

public class ArrayExample {
	public static void main(String[] args) {
		int []intArr; //declaration of array.
		char[]chArr;
		byte byteArr[];
		intArr=new int[5];//creation of array.
		chArr=new char[5];
		byteArr=new byte[5];
		
		intArr[0]=10;//intialization of int array
		intArr[1]=20;
		intArr[2]=30;
		intArr[3]=40;
		intArr[4]=50;
		
		chArr[0]='a';//intialization of char array
		chArr[1]='b';
		chArr[2]='c';
		chArr[3]='d';
		chArr[4]='e';
		
		byteArr[0]=1;//intialization of byte array
		byteArr[1]=2;
		byteArr[2]=3;
		byteArr[3]=4;
		byteArr[4]=5;
		
		int res=intArr[1]*3;
		System.out.println(res);
		
	}
}
