package com.generation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado cuadrado1 = new Cuadrado();
		/*Herencia: cuando una clase hereda de otra
		 * esta tiene acceso a sus atributos y métodos
		 */
		//cuadrado1.setNombre ("Cuadrado");
		cuadrado1.setAlto(10);
		cuadrado1.setLargo(10);
		
		cuadrado1.calcularArea();
		System.out.println("El area del " + cuadrado1.getNombre() + " es " + cuadrado1.calcularArea());
		
		Triangulo triangulo1 = new Triangulo();
		//triangulo1.setNombre ("Triangulo");
		triangulo1.setAlto (10);
		triangulo1.setLargo (5);
		
		triangulo1.calcularArea();
		System.out.println("El area del " + triangulo1.getNombre() + " es " + triangulo1.calcularArea());
	}

}
