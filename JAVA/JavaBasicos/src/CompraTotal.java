import java.util.Scanner;

public class CompraTotal {
	public static void main(String[] args) {
		System.out.println("Dame el total de compra:");
		Scanner sc = new Scanner(System.in);
		double cantidadInicial = sc.nextInt();
		double cantidadDescuento;
		if(cantidadInicial>=0 && cantidadInicial <1000) {
			cantidadDescuento = cantidadInicial;
			System.out.println("La cantidad total es " + cantidadInicial + " la cantidad con descuento es de " + cantidadDescuento);
		}else if(cantidadInicial >=10000) {
			cantidadDescuento = cantidadInicial * 0.70;
			System.out.println("La cantidad total es " + cantidadInicial + " la cantidad con descuento es de " + cantidadDescuento);
		}else if(cantidadInicial >=1000 && cantidadInicial <5000) {
			cantidadDescuento = cantidadInicial * 0.90;
			System.out.println("La cantidad total es " + cantidadInicial + " la cantidad con descuento es de " + cantidadDescuento);
		}else if(cantidadInicial >=5000 && cantidadInicial < 10000) {
			cantidadDescuento = cantidadInicial * 0.80;
			System.out.println("La cantidad total es " + cantidadInicial + " la cantidad con descuento es de " + cantidadDescuento);
		}else{
			System.out.println("No se que hiciste pero creo que me rompiste");
		}
	}
}
