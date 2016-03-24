package com.baiju.durga.thread7;

public class MyThread extends Thread {
	
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
