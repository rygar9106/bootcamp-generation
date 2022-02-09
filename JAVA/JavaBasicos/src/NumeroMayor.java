import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		System.out.println("Dame el primer número para compararlo");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Dame el segundo número para compararlo");
		int num2 = sc.nextInt();
		System.out.println("Dame el ultimo número para compararlo");
		int num3 = sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("El numero más grande es " + num1);
		}else if (num2>num1 && num2>num3) {
			System.out.println("El numero más grande es " + num2);
		}else if (num3>num1 && num3>num1) {
			System.out.println("El numero más grande es " + num3);
		}else {
			System.out.println("Hay números iguales");
		}
	}
}
