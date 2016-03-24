package com.baiju.durga.thread.local1;

class CustomerThread extends Thread {
	static Integer custId = 0;
	private static ThreadLocal tl = new ThreadLocal() {
		protected Integer initialValue() {
			return ++custId;
		}
	};
	CustomerThread(String name) {
		super(name);
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"..executing ID : "+tl.get());
	}
}
public class CustomerThreadDemo {
	public static void main(String[] args) {
		CustomerThread c1 = new CustomerThread("First Thread");
		CustomerThread c2 = new CustomerThread("Second Thread");
		CustomerThread c3 = new CustomerThread("Third Thread");
		CustomerThread c4 = new CustomerThread("Forth Thread");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}
}
