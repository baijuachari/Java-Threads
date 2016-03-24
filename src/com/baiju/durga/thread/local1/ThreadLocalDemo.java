package com.baiju.durga.thread.local1;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal();
		System.out.println(tl.get()); //null
		tl.set("durga");
		System.out.println(tl.get()); //durga
		tl.remove();
		System.out.println(tl.get()); //null
	}
}
