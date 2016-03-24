package com.baiju.durga.thread9.one;

class Display {
	public void wish(String name) {
		;;;;;;;; //1 lakh lines of code
		synchronized(this){
			for (int i = 0; i < 10; i ++ ) {
				System.out.print("hello: ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);		
			}
		}
		;;;;;;;;;;//1 lakh lines of code
	}
}

class MyThread extends Thread {
	
	Display d;
	String name;
	
	MyThread(){};
	MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Yuvaraj");
		t1.start();
		t2.start();
	}
}
