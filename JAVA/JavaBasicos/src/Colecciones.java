import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {

	public static void main(String[] args) {
		//Las colecciones nos sirven para almacenar un conjunto
		//de objetos
		//La diferencia de las colecciones y los objetos
		//es que las colecciones son dinamicas, pueden cambiar
		//el numero de objetos agregados
		
		//Set tiene 3 implementaciones
		//No puede tener elementos repetidos
		//HashSet
		//Los elementos no mantienen un orden
		//Implementacion más rápida
		/*Set <String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		

		
		/*Treeset 
		 * Esta implementación ordena  los elementos en funcion
		 * de sus valores
		 * es la implementacion más lenta
		 
		Set <String> frutas = new TreeSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		frutas.add("mango");*/
		
		/*LinkedHashSet
		 * ordena los elementos en orden de inserción
		 * y es más costoso que hashset
		 */
		/*
		Set <String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		frutas.add("mango");
		
		/*foreach, puede recuperar una coleccion y en cada
		 * recorrido recuperar el valor y lo podemos almacenar
		 * en una variable
		 * Sintaxis	
		 * for(tipoDeDatoElemento variable : elementoARecorrer )
		 
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		
		//List
		/*se permiten elementos duplicados
		 * acceder a elementos especificos
		 * buscar elementos
		 */
		//ArrayList
		
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("Chikorita");
		pokemones.add("Pikachu");
		pokemones.add("Mew");
		pokemones.add("Eevee");
		pokemones.add("Charizard");
		pokemones.add("Bulbasur");
		pokemones.add("Squirtle");
		
		/*add si agregamos un indice y un elemento, posiciona el elemento
		 * en el indice y realiza un desplazamiento  es decir no borra
		 * el elemento en la posición si no que lo desplaza
		 */
		
		pokemones.add(2,"Raichu");
		
		/*remove elimina el elemento de la posición especificada
		 */
		pokemones.remove(4);
		
		//set reemplaza el elemento ena la posción especificada
		
		pokemones.set(0,"Togepi");
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		System.out.println("**********");
		System.out.println(pokemones.get(4));
		/*indexOf, nos devuelve la posicion del elemento
		 * y si el elemento no se encuentra devuelve -1
		 * nos devuelve la primera posición que encuentre
		 */
		System.out.println(pokemones.indexOf("Squirtle"));
		/*String miCadena = "Hola a todes";
		 * System.out.println(miCadena.charAt(0));
		 */
		
		//LinkedList
		// Es una lista doblemente enlazada
		// Es más rapido para insertar y remover elementos
		System.out.println("**********");
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		/*Map
		 * Asocia claves a valores
		 * No puede contener claves duplicadas
		 * Solo puede tener un valor asociado
		 * 
		 * Hashmap
		 * Tiene mejor rendimiento pero no garantiza un orden
		 * a la hora de hacer iteraciones
		 */
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(123, "Carlos");
		usuarios.put(123, "Carlos2");
		usuarios.put(223, "Raul");
		usuarios.put(323, "Ro");
		
		System.out.println(usuarios.get(123));
		
		/*Keyset
		 * Nos permite recuperar el nombre de la clave
		 */
		System.out.println(usuarios.keySet());
		 /* values
		 * nos permite recuperar el valor directamente
		 */
		System.out.println(usuarios.values());
		//TreeMap
		
		Map <String, String> tamales = new TreeMap<String, String>();
		
		tamales.put("Oaxaqueño", "Mole Rojo");
		tamales.put("Torta","Mole Verde");
		tamales.put("Dulces", "Gansito");
		tamales.put("Salado", "Cochinita");
		
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		System.out.println(tamales);
		tamales.entrySet().forEach(elemento ->{
			System.out.println(elemento.getKey().toString() + " " + elemento.getValue().toString());
			System.out.println(elemento);
		});
		
		Map<Integer,String> carros = new LinkedHashMap<Integer, String>();
		
		carros.put(1, "Volvo");
		carros.put(567, "Pointer");
		carros.put(8, "Mustang");
	}
}
