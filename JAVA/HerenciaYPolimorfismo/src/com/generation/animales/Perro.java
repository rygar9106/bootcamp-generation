package com.generation.animales;

public class Perro extends Animal implements Mascota, Jugar{

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("Voy por la pelota");
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("Persigo un auto");
	}

	@Override
	public void baniar() {
		// TODO Auto-generated method stub
		System.out.println("Me gusta el agua");
	}

	@Override
	public void moverLaColita() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugarConCajas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ensuciarse() {
		// TODO Auto-generated method stub
		
	}

}
