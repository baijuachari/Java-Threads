package com.baiju.durga.thread.tryLockTime;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread {
	static ReentrantLock l = new ReentrantLock();
	MyThread(String name) {
		super(name);
	}
	public void run() {
		do {
			try {
				if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName()+ "..Got the lock");
					Thread.sleep(30000);
					l.unlock();
					System.out.println(Thread.currentThread().getName()+ "..Releases the lock");
					break;
				}else {
					System.out.println(Thread.currentThread().getName()+ "..Unable to get the lock");
				}
			}catch(InterruptedException e) {}
			
		}while(true);
	}
}

public class ReentrantLockTryLock2 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("First Thread");
		MyThread t2 = new MyThread("Second Thread");
		t1.start();
		t2.start();
	}
}
