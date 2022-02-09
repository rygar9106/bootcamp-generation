import java.util.Scanner;
/*
 * Pedir al usuario 2 números por consola y preguntarle que desea realizar
 * 1) Suma
 * 2) Resta
 * 3) División
 * 4) Multiplicación
 * 
 * y despues imprimir el resultado
 */

public class Calculadora {
	public static void main (String[] args) {
		System.out.println("Dame tu primero número para una operacion");
		try (Scanner sc = new Scanner(System.in)) {
			Integer num1 = sc.nextInt();
			System.out.println("Dame tu segundo número para una operacion");
			Integer num2 = sc.nextInt();
			System.out.println("1) Suma\r\n"
					+ "  2) Resta\r\n"
					+ "  3) División\r\n"
					+ "  4) Multiplicación");
			Integer operacion = sc.nextInt();
			
			switch(operacion) {
			case 1:
				Integer suma = num1+num2;
				System.out.println("La suma es "+ suma );
			break;
			case 2:
				Integer resta = num1-num2;
				System.out.println("La resta es "+ resta );
			break;
			case 3:
				Double division = Double.valueOf(num1 / num2);
				System.out.println("La división es " + division);
			break;
			case 4:
				Integer multiplicacion = num1 * num2;
				System.out.println("La multiplicación es " + multiplicacion);
			break;
			default:
				System.out.println("Espera Kha");
				
			}
		}
		
	}

}
