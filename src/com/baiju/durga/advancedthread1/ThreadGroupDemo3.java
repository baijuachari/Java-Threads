package com.baiju.durga.advancedthread1;

class MyThread extends Thread {
	MyThread(ThreadGroup g, String name) {
		super(g, name);
	}
	public void run() {
		System.out.println("Child Thread");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {}
	}
}
public class ThreadGroupDemo3 {
	public static void main(String[] args) throws Exception{
		ThreadGroup pg = new ThreadGroup("parentGroupo");
		ThreadGroup cg = new ThreadGroup("ChildGroup");
		MyThread t1 = new MyThread(pg, "ChildThread1");
		MyThread t2 = new MyThread(pg, "ChildThread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	}
}
