import java.util.Scanner;

public class NumeroParImpar
{
    public static void main( String[] args )
    {
        int numero;
        Scanner teclado = new Scanner( System.in );

        System.out.printf( "Introduzca un número entero: " );
        numero = teclado.nextInt();

        String resultado = ((numero % 2 ==0) ? "par": "impar");
        System.out.println(resultado);
    }
}
