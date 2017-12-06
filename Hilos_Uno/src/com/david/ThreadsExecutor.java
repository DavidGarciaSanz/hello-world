package com.david;

public class ThreadsExecutor {

	public static void main(String[] args) {

		Thread dm1 = new Thread(new DemoThread(Constantes.CTES_UNO));
		Thread dm2 = new Thread(new DemoThread(Constantes.CTES_DOS));
		Thread dm3 = new Thread(new DemoThread(Constantes.CTES_TRES));
		
		dm1.start();
		dm2.start();
		dm3.start();
		
		System.out.println(Constantes.CTES_FIN);

	}

}
