import java.util.Scanner;

public class DeletreaNombre {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame tu nombre:");
		String nombre = sc.nextLine();
		int largo = nombre.length();
		for (int i = 0; i < largo; i++) {
			System.out.println(nombre.charAt(i));
		}
		sc.close();
	}
}
