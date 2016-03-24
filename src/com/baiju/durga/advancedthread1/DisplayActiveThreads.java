package com.baiju.durga.advancedthread1;

public class DisplayActiveThreads {

	public static void main(String[] args) {
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for (Thread s: t) {
			System.out.println(s.getName()+"..."+s.isDaemon());
		}
	}
}
