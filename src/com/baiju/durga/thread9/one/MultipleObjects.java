package com.baiju.durga.thread9.one;

class Y {};
class Z{};
public class MultipleObjects {
	public synchronized void m1() {
		Y y = new Y();
		synchronized(y) {
			Z z = new Z();
			synchronized(z) {
				;;;;;
			}
		}
	}
}

