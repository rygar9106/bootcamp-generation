package com.generation.animales;

public class Gato extends Animal implements Mascota{

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("Juego con la caja");
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("Hay no que flojera");
	}

	@Override
	public void baniar() {
		// TODO Auto-generated method stub
		System.out.println("No me gusta el agua");
	}

}
