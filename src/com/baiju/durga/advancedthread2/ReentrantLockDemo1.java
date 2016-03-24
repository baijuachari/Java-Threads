package com.baiju.durga.advancedthread2;

import java.util.concurrent.locks.*;

class Display {
	ReentrantLock l = new ReentrantLock();
	public void wish(String name) {
		l.lock();//------------------------->1
		for (int i = 0; i < 10; i++) {
			System.out.print("Good morning: ");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){}
			System.out.println(name);
		}
		l.unlock();//------------------------>2
	}
}

class MyThread extends Thread {
	String name;
	Display display;
	MyThread(Display d, String name) {
		this.display = d;
		this.name = name;
	}
	public void run() {
		display.wish(name);
	}
}

public class ReentrantLockDemo1 {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Yuvaraj");
		t1.start();
		t2.start();
	}
}
