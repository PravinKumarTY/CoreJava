package com.dev.collections;

import java.util.ArrayList;

public class ArrayListExample {
   static int a=010;
   static int j=0011;
	public static void main(String[] args) {
		ArrayList<String> arl=new ArrayList<String>();
        arl.add("Hello");
        arl.add("xyz");
        arl.add("pqr");
        arl.add("mnq");
        arl.trimToSize();
        System.out.println("New Size of array..:"+arl.size());
        System.out.println(a);  
	}
}
