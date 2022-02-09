
public class Arreglos {
	public static void main(String[] args) {
		//Solo un tipo de dato
		//especificar el tamaño o la cantidad  de elementos que va a contener
		
		//1 manera
		int numeros[];//creamos la variable
		numeros = new int[4];
		
		//2 manera
		String[] nombres = new String[4];
		String[] nombreDeFrutas = new String[] {"Manzana", "Platano","Uva", "Pera"};
		
		numeros[0] = 10;
		numeros[1] = 8;
		numeros[2] = 100;
		numeros[3] = 200;
		//numeros[4] = 200;
		
		nombres[0] = "Juan";
		nombres[1] = "Pedro";
		nombres[2] = "Antonio";
		nombres[3] = "Felipe";
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros);
		
		for (int i =0; i< numeros.length; i++) {
			System.out.println("Elementos de números " + numeros[i]);
			System.out.println("Elementos de nombres " + nombres[i]);
			System.out.println("Elementos de frutas " + nombreDeFrutas[i]);
			System.out.println("----------------------------------");
		}
	}
}
