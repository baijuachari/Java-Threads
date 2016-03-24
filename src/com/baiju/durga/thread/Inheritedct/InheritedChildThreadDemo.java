package com.baiju.durga.thread.Inheritedct;

class ChildThread extends Thread {	
	public void run() {
		System.out.println("Child Thread Value: "+ParentThread.tl.get());
	}
}

class ParentThread extends Thread {
	public static InheritableThreadLocal tl = new InheritableThreadLocal() {
		public Object childValue(Object p) {
			return "CC";
		}
	};
	
	public void run() {
		tl.set("PP");
		System.out.println("Parent Thread Value: "+tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
	
}

public class InheritedChildThreadDemo {
	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}
}
