package operadores;

import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		// Operadores Aritméticos
		// +,-,*,/,%
		
		int a = 10;
		int b = 20;
		double c = 10.5;
		int suma = b + a;
		System.out.println(suma);
		
		String str1 = "El resultado de la suma es: ";
		
		System.out.println(str1 + suma);
		//Resta
		System.out.println("El resultado de la resta es: " + (a-b));
		//Division
		
		int division = a/b;
		
		System.out.println("El resultado de la división es: " + division);
		
		double division2 = (double) a/b;
		double division3 = c/b;
		
		System.out.println("El resultado de la división es: "+ division2);
		System.out.println("El resultado de la división es: "+ division3);
		
		double modulo = a % c;
		
		System.out.println("El módulo de la operación es: "+ modulo);
		
		//Operador de asignacion =
		
		int d = 5, e;
		e = 6;
		System.out.println(d + " - " + e);
		
		//Operadores de declaración compuesta
		
		// +=, -=, *=, *=, %=
		
		int f = 0, g = 5;
		
		f+=5;
		
		System.out.println(f);
		
		/* Operadores relacionales
		 * 
		 * <,>,<=,>=
		 * == igualdad
		 * != diferencia
		 * Resultado un valor de tipo booleano(true,false)
		 *
		 */
		int h = 15, i =25;
		String j = "Hola";
		
		System.out.println(h>i);//false
		System.out.println(i!=h);
		//System.out.println(h!=j); son diferentes tipos de datos, no se pueden comparar
		
		/* Operador unitario
		 * ++,--
		 * preasignacion primero se le asigna valor antes de usarse
		 * postasignacion primero lee el valor y después agrega +1
		 */
		int k = 0,l = 0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		//Precedencia de operadores
		
		int operacion = 4+5*6/3;//14
		System.out.println(operacion);
		
		int x=0, y=0;
		int operacion2 = ++x + y--;
		System.out.println(operacion2);//1
		
		//Operador ternario
		//es un if else abreviado
		//Solo nos permite tomar una decision
		int edad = 19, valor1 = 0, valor2 = 1;
		int resultado = (edad <=18)? valor1 : valor2;
		
		System.out.println(resultado);
		
		//Operadores logicos
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(true && !false);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int num = sc.nextInt();
		System.out.println(num);
		
	}

}