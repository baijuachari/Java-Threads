package com.baiju.durga.thread7;

public class Display {
	public static void wish(String name) {
		for (int i = 0; i < 10; i ++ ) {
			System.out.print("hello: ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);		
		}
	}
}
