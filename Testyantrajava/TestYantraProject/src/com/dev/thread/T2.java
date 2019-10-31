package com.dev.thread;

public class T2 extends Thread {
  @Override
  public void run() {
	System.out.println("T2 thread started ....");
	for(int j=1; j<=10; j++) {
		System.out.println("J="+j);
	}
	System.out.println("T2 thread terminated...");
  }
}
