package com.david;

public class ThreadsExecutor {

	public static void main(String[] args) {

		Thread dm1 = new Thread(new DemoThread("uno"));
		Thread dm2 = new Thread(new DemoThread("dos"));
		Thread dm3 = new Thread(new DemoThread("tres"));
		
		dm1.start();
		dm2.start();
		dm3.start();
		
		System.out.println("Final del programa");

	}

}
