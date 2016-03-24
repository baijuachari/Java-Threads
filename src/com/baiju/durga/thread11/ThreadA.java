package com.baiju.durga.thread11;

class ThreadB extends Thread {
	int total = 0;
	public void run() {
		synchronized(this) {
			System.out.println("Child Thread starts the calculation");//2
			for (int i = 1; i <=100; i++){
				total = total + i;
			}
			System.out.println("Child Thread ready to give notification");//3
			this.notify();
		}
	}
}

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		synchronized(b) {
			System.out.println("Main thread calling child thread"); //1
			b.wait();
			System.out.println("Main thread got notification");//4
			System.out.println("Total:"+b.total);//5
		}
	}
}
