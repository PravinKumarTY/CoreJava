package com.dev.thread;

public class T3 implements Runnable{

	@Override
	public void run() {
		System.out.println("T3 thread started...");
		  for(int k=0; k<=10; k++) {
			  System.out.println("k="+k);
		  }
		System.out.println("T3 thread terminated..");
		
	}

}
