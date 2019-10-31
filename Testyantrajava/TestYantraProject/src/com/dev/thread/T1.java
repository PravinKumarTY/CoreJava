package com.dev.thread;

public class T1 {
	public static void main(String[] args) {
		System.out.println("Main thread started...");
		//new T2().start();
		T2 t2=new T2();
		t2.setPriority(5);
		t2.start();
		T3 t3=new T3();
		
		Thread th=new Thread(t3);
		th.setPriority(10);
		th.setName("Thread T3");
		th.start();
		//new Thread(new T3()).start();
		for(int i=0; i<=10; i++) {
			System.out.println("i="+i);
		}
		Thread.currentThread().setName("Main thread");
		System.out.println("Thread T3..:"+th.getName());
		System.out.println("thread id..:"+th.getId());
		System.out.println("Main Thread ..."+Thread.currentThread().getName());
		System.out.println("Main thread terminated....");
	}
}
