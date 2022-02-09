
public class ManipularArreglo {
	public static void main(String[] args) {
		int [] numeros = new int[] {1,6,45,53,80,102,145,326,450,892};
		int temp = 0, temppar = 0, tempimpar = 0;
		for(int i=0; i< numeros.length; i++) {
			temp += numeros[i];
		}
		for(int i=0; i< numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				temppar += numeros[i];				
			}
		}
		for(int i=0; i< numeros.length; i++) {
			if(numeros[i] % 2 != 0) {
				tempimpar += numeros[i];				
			}
		}
		System.out.println(temp);
		System.out.println(temppar);
		System.out.println(tempimpar);
	}
}
