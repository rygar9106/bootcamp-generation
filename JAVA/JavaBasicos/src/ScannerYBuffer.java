import java.util.Scanner;

public class ScannerYBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num1 = sc.nextInt();
		sc.nextLine();//Limpiamos buffer
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		sc.close();
		System.out.println("Tu nombre es: " + nombre + "tu numero es: " + num1);
		/*System.out.println("Introduce otro número");
		int num2 = sc.nextInt();
		
		System.out.println("Numero 1: " + num1 + "Numero 2: " + num2);*/
	}
}
