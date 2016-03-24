package com.baiju.durga.thread12;
class A {
	public synchronized void d1(B b) {
		System.out.println("Thread A starts executing d1()");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){}
		b.last();
	}
	public synchronized void last() {
		System.out.println("Thread A in last() method");
	}
};

class B {
	public synchronized void d2(A a) {
		System.out.println("Thread A starts executing d2()");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){}
		a.last();
	}
	public synchronized void last() {
		System.out.println("Thread B in last() method");
	}
};

public class DeadLockDemo extends Thread{
	A a = new A();
	B b = new B();
	public void m1() {
		this.start();
		a.d1(b);
	}
	public void run() {
		b.d2(a);
	}
	public static void main(String[] args) {
		DeadLockDemo t = new DeadLockDemo();
		t.m1();
	}
}
