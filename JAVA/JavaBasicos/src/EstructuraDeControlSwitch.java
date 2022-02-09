import java.util.Scanner;

public class EstructuraDeControlSwitch {
	//Estructuras de control nos sirve para controlar el flujo de comportamiento de un programa.
	//Para la toma de decisiones
	
	/*
	 * switch(condicion_a_evaluar){
	 * 		case "valor":
	 * 			codigo a ejecutar
	 * 			break
	 * ...
	 * 		case "n":
	 * 			codigo a ejecutar
	 * 			break
	 * 		default:
	 * 			codigo a ejecutar
	 * }
	 */
	
	//Solicitar al usuario un dia de la semana y mostrar un mensaje
	
	public static void main (String[] args) {
		System.out.println("Introduce un d�a de la semana y recibe un bonito mensaje. :-)");
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine();
		
		
		switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es viernes, toma un caf�");
		break;
		case "martes":
			System.out.println("Lunes chiquito.Esto est� cansado, pero ya casi");
		break;
		case "miercoles":
			System.out.println("Mi�rcoles pero a que costo");
		break;
		case "jueves":
			System.out.println("Juebebes de sed peligrosa");
		break;
		case "viernes":
			System.out.println("Viernes de fiesta hasta morir");
		break;
		case "sabado":
			System.out.println("No como esos sabados que casi hacen que me corran");
		break;
		case "domingo":
			System.out.println("Ma�ana es lunes :'-(;");
		break;
		default:
			System.out.println("Espera Kha");
			
		}
		
	}
	

}
