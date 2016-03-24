package com.baiju.durga.threadpool1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {
	String name;
	PrintJob(String name) {
		this.name = name;
	}
	public void run() {
		System.out.println(name+"..job started by"+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		System.out.println(name+"..job completed by"+Thread.currentThread().getName());
	}
}
public class ExecutorExample1 {

	public static void main(String[] args) {
		PrintJob[] jobs = {
				new PrintJob("Anil"), 
				new PrintJob("Durga"),
				new PrintJob("Ravi"),
				new PrintJob("Kiran"),
				new PrintJob("Mahesh"),
				new PrintJob("Pavan")};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (PrintJob job: jobs) {
			service.submit(job);
		}
		service.shutdown();
	}
}
