import java.util.Scanner;

	public class Tabla
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Ingresa cualquier número positivo: ");
	        num = console.nextInt();
	                
	        System.out.println("Tabla de multiplicar de  " + num);
	        int i =1;
	        while(i<=10) {
	        	System.out.println(num*i);
	        	i++;
	        } 
	       //Implementa un bucle while que imprima el resultado
	    }
	}
