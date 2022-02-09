import java.util.Scanner;

public class EjercicioTriangulo {
	public static void main(String[] args) {
		System.out.println("Dame el primer angulo de tu triangulo");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Dame el segundo angulo de tu triangulo");
		int num2 = sc.nextInt();
		System.out.println("Dame el ultimo angulo de tu triangulo");
		int num3 = sc.nextInt();
		
		if(num1+num2+num3!=180) {
			System.out.println("No es un triangulo valido");
		}else {
			System.out.println("Tu triangulo es valido");
		}
	}
}
