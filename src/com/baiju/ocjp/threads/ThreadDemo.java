package com.baiju.ocjp.threads;


class MyOwnThread extends Thread{
	public void run() {				
		for (int i = 0; i < 1000; i++) {
			System.out.println("I am lazy Thread : " +i);			
		}
		try {
			Thread.sleep(5000);			
		} catch (InterruptedException e) {				
			System.out.println("I got interrupted");
		}

	}
}

public class ThreadDemo {
	
	public static void main(String[] args) throws InterruptedException {		
		MyOwnThread t = new MyOwnThread();
		t.start();
		//t.interrupt();//-----line(1)
		System.out.println("End of main..");
	}
}



