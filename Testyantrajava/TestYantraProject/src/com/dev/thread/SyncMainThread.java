package com.dev.thread;

public class SyncMainThread {

	public static void main(String[] args) {
		System.out.println("Sync main thread is started.....");
		Printer p=new Printer();
		//new Thread4(p).start();
		Thread4 t4=new Thread4(p);
		t4.start();
		/*try {
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		new Thread5(p).start();
		System.out.println("SyncMain thread terminated.....");

	}
}
