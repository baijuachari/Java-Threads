package com.baiju.durga.thread.local1;

public class ThreadLocalDemo2 {

	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal() {
			public Object initialValue() {
				return "abc";
			}
		};
		System.out.println(tl.get()); //null
		tl.set("durga");
		System.out.println(tl.get()); //durga
		tl.remove();
		System.out.println(tl.get()); //null
	}
}
