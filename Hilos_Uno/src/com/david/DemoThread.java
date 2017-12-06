package com.david;

public class DemoThread implements Runnable {
	
	private String nombre;

	public DemoThread(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ejecutandose hilo " + nombre);
	}

}
