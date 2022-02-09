package operadores;

public class Ciclos {
	public static void main(String[] args) {
		//while
		
		int control = 0;
		
		while(control <10) {
			System.out.println("Control = " + control);
			control ++;
		}
		
		//do while
		control = 0;
		do {
			System.out.println("Control = " + control);
			control++;
		}while(control<3);
		
		//for
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Control = " + i);
		}
		
		//break & continue
		
		for(int j = 0; j < 10; j++) {
			if (j % 2 == 0) {
				System.out.println("Control = " + j);
				break;
			}
			System.out.println("Control = " + j);
		}
	}
}
