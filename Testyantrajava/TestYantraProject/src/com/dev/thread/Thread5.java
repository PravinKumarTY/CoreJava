package com.dev.thread;

public class Thread5 extends Thread{
  Printer p;
  public Thread5(Printer pref) {
	 p=pref;
  }
	
  @Override
  public void run() {
	p.printVal(10,"Thread 5");
  }
}
