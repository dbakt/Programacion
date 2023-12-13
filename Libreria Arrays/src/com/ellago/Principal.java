package com.ellago;
/**@author Daniel Barbero Alarcón
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class Principal { //clase principal 

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		/*1. y 3. CrearArrayInt: creará un array con números aleatorios enteros, pasándole como parámetro
		la longitud del array. mostrarArrayInt*/
		System.out.print("Dime la longitud de tu array de enteros: ");
		int longitud = Integer.parseInt(teclado.nextLine());
		
		int [] arrayInt = FArrays.crearArrayInt(longitud); //creamos un array con su método
		
		FArrays.mostrarArrayInt(arrayInt);//mostramos el array con el método
		
		/*5. BuscarArrayInt: buscará un  entero dentro de un array, devolverá true si lo encuentra 
 		y false si no. El array y el entero serán pasados como parámetros.*/
		System.out.print("\n¿Qué número quieres buscar? ");
		int numero = Integer.parseInt(teclado.nextLine());
		
		System.out.println("\n¿Está tu número en el array? " +FArrays.buscarArrayInt(arrayInt, numero));
		
		/*9. VecesIntArray: devolverá el número de veces que aparece el entero en el array. 
 		Tanto el array como el entero se pasarán como parámetros.*/
		
		System.out.println("\nTu número está " +FArrays.vecesIntArray(arrayInt, numero)+ " veces");
	
		
		/*7. LocalizaPosInt: localizará la primera posición del entero en el array y la devolverá;
  		en caso contrario, devolverá -1. Tanto el array como el valor serán pasados por
  		parámetros.*/

		System.out.println("\nLa primera posición en la que aparece es en la " +FArrays.localizaPosInt(arrayInt, numero));
		
		/*12. SustituirIntArray: cambiará los enteros encontrados en el array por el 
		 segundo entero y devolverá el número de veces que se ha cambiado. 
		 Si no se ha cambiado ninguna vez, devolverá  -1. 
		 Parámetros a pasar: el array de enteros, el número buscado, el número a sustituir.*/
		
		System.out.println("\nVamos a crear una segunda matriz de diferente longitud");
		System.out.print("\n¿Qué longitud quieres que tenga? ");
		int longitud2 = Integer.parseInt(teclado.nextLine());
		
		int [] arrayInt2 = FArrays.crearArrayInt(longitud2);
		FArrays.mostrarArrayInt(arrayInt2);
		
		System.out.print("\n¿Qué número de tu segundo array quieres cambiar? ");
		int num_bus = Integer.parseInt(teclado.nextLine());
		
		System.out.print("\n¿Por qué número lo quieres sustituir? ");
		int num_sust = Integer.parseInt(teclado.nextLine());
		
		System.out.println("\nNúmero de intercambios realizados:" +FArrays.sustituirIntArray(arrayInt2, num_bus, num_sust));
		
		
		/*11. UnirArraysInt: devolverá un array con la unión de dos arrays pasado como parámetros
		 dos arrays de la misma longitud*/
		System.out.println("\nVamos a unir ambas matrices numéricas");
		
		int[] arrayIntUnion = FArrays.unirArraysInt(arrayInt, arrayInt2);
		FArrays.mostrarArrayInt(arrayIntUnion);
		
		
		/*14. Ordenación de array de enteros (Método de la burbuja). 
		Realizar una función que ordene un array por el método de la burbuja 
		(mirar documento de algoritmos de búsquedas y ordenación)
		 */
		System.out.println("\nVamos a ordenar tu primera matriz");
		FArrays.ordenarArrayInt(arrayInt);
		FArrays.mostrarArrayInt(arrayInt);
		
		/*16. Realizar la búsqueda dicotómica de un entero en un array ordenado. 
		
		 */
		System.out.print("\nBúsqueda dicotómica: ¿Qué numero de tu segunda matriz quieres buscar?");
		int num_bus2 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("\nTu segunda matriz ordenada es:");
		FArrays.ordenarArrayInt(arrayInt2);
		FArrays.mostrarArrayInt(arrayInt2);
		System.out.println("\n Tu número está en la posición: "+FArrays.busquedaDicotomInt(arrayInt2, num_bus2));
		
		
	
		/*2. y 4. CrearArrayString: creará un array con String que contendrá "Dato"+un número aleatorio,
		 *pasándole como parámetro la longitud del array. mostrarArrayString*/
		System.out.print("\nDime la longitud de tu array de String: ");
		longitud = Integer.parseInt(teclado.nextLine());
		
		String [] arrayString = FArrays.crearArrayString(longitud); //creamos un array con su método
		
		FArrays.mostrarArrayString(arrayString); //mostramos el array con su método
		
		
		/*6. BuscarArrayString: buscará un String (dato + int) dentro de un array de String y devolverá true
  		si o encuentra y false en caso contrario. Tanto el array como el String 
  		serán pasados por parámetros.*/
		System.out.print("\n¿Qué dato quieres buscar? ");
		String dato = teclado.nextLine();
		
		System.out.println("\n¿Está tu dato en el array? " +FArrays.buscarArrayString(arrayString, dato));
	
		/*10. VecesStringArray: devolverá el número de veces que aparece el String en el array. 
		 Tanto el array como el String serán pasados por parámetros.*/
		System.out.println("\nTu String está " +FArrays.vecesStringArray(arrayString, dato)+ " veces");
		
		/*8. LocalizaPosString: localizará la primera posición del String en el array. 
 		Si no se encuentra, devolverá -1. Tanto el array como el valor serán pasados 
 		por parámetros.*/
	
		System.out.println("\nLa primera posición en la que aparece es en la " +FArrays.localizaPosString(arrayString, dato));
		
		
		/*13. SustituirStringArray: cambiará los String encontrados en el array por el 
		 segundo String y devolverá el número de veces que se ha cambiado. 
		 Si no se ha cambiado ninguna vez, devolverá  -1. 
		 Parámetros a pasar: el array de enteros, el número buscado, el número a sustituir.*/
		
		System.out.print("\n¿Qué String de tu array quieres cambiar? ");
		String string_bus = teclado.nextLine();
		
		System.out.print("\n¿Por qué String lo quieres sustituir? ");
		String string_sust = teclado.nextLine();
		
		System.out.println("\nNúmero de intercambios realizados:" +FArrays.sustituirStringArray(arrayString, string_bus, string_sust));
		
		
		/*15. Ordenación de array de String (Método de la burbuja). 
		Realizar una función que ordene un array por el método de la burbuja 
		(mirar documento de algoritmos de búsquedas y ordenación)
		 */
		System.out.println("\nVamos a ordenar tu matriz de String");
		FArrays.ordenarArrayString(arrayString);
		FArrays.mostrarArrayString(arrayString);
		
		
		
		/*17. Realizar la búsqueda dicotómica de un entero en un array ordenado. 
		*/
		System.out.print("\nBúsqueda dicotómica: ¿Qué dato de tu matriz quieres buscar?");
		String dato2 = teclado.nextLine();
		
		System.out.print("\nLa primera posición en la que lo ha encontrado es "+FArrays.busquedaDicotomString(arrayString, dato2));
		
		
		/*18. Consultar la clase Arrays en la API de Java y concretamente el método sort().
		Crear un array de tipo entero y otro de tipo String y ordenarlo con este método. 
		¿Has visto qué tipo de algoritmo de ordenación usa?*/
		System.out.println("\n\nVamos a crear un array de tipo entero y otra de tipo String para ordenarlas con el método sort()");
		
		System.out.print("\nDime la longitud de tu array de enteros: ");
		int longitud3 = Integer.parseInt(teclado.nextLine());
		int [] arrayInt3 = FArrays.crearArrayInt(longitud3); //creamos un array con su método
		FArrays.mostrarArrayInt(arrayInt3);
		

		System.out.println("\nAquí tienes tu matriz ordenada: ");
		Arrays.sort(arrayInt3);
		FArrays.mostrarArrayInt(arrayInt3);
		
		
		System.out.print("\nDime la longitud de tu array de Strings: ");
		int longitud4 = Integer.parseInt(teclado.nextLine());
		String [] arrayString3 = FArrays.crearArrayString(longitud4); //creamos un array con su método
		FArrays.mostrarArrayString(arrayString3);
		
		System.out.println("\nAquí tienes tu matriz ordenada: ");
		Arrays.sort(arrayString3);
		FArrays.mostrarArrayString(arrayString3);
		
		/*19 y 20 CrearArrayPersona: creará un array que contendrá valores el tipo de dato Persona
 		Al crear el array, el nombre de cada Persona será generado con una letra mayúscula generada aleatoriamente 
 		(mirar tabla ASCII) seguido de un número del 1 al 200 generados también aleatoriamente. 
 		La edad también se generará aleatoriamente del 1 al 120. Luego mostrarArrayPersona*/
		System.out.print("\nVamos a crear un array de tipo Persona. ¿Qué longitud deseas que tenga? ");
		int longitud5 = Integer.parseInt(teclado.nextLine());
		
		Persona [] arrayP = FArrays.crearArrayPersona(longitud5);
		FArrays.mostrarArrayPersona(arrayP);
		
		
		/*21. OrdenarArrayPersona: ordenará el array de Personas según su edad 
		 */
		System.out.println("\nAquí tienes tu matriz ordenada: ");
		FArrays.ordenarArrayPersona(arrayP);
		
		/*22 y 23. CrearMatrizInt: creará una matriz de enteros aleatorios de n filas y m columnas que serán 
 		pasados por parámetros. Los números aleatorios generados serán entre 20 y 120. Luego mostrarMatrizInt*/
		System.out.println("\n Vamos a crear una matriz bidimensional de enteros");
		System.out.print("\n ¿Cuántas filas quieres que tenga? ");
		int filas = Integer.parseInt(teclado.nextLine());
		
		System.out.print("\n ¿Cuántas columnas quieres que tenga? ");
		int columnas = Integer.parseInt(teclado.nextLine());
		
		int[][]matriz = FArrays.crearMatrizInt(filas, columnas);
		FArrays.mostrarMatrizInt(matriz);
		
		/*24 y 25. CrearMatrizString: creará una matriz de String aleatorios de n filas y m columnas que serán 
 		pasados por parámetros.  El valor de cada String será formado por una letra mayúsculas generada aleatoriamente seguido 
 		de un número entre 1 y 101 generados también aleatoriamente.*/
		System.out.println("\n Vamos a crear una matriz bidimensional de String");
		System.out.print("\n ¿Cuántas filas quieres que tenga? ");
		int filas2 = Integer.parseInt(teclado.nextLine());
		
		System.out.print("\n ¿Cuántas columnas quieres que tenga? ");
		int columnas2 = Integer.parseInt(teclado.nextLine());
		
		String[][]matriz2 = FArrays.crearMatrizString(filas2, columnas2);
		FArrays.mostrarMatrizString(matriz2);
		
		teclado.close();
	}
	
}

