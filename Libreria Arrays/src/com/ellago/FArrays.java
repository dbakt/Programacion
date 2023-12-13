
package com.ellago;

import java.util.Arrays;

/**@author Daniel Barbero Alarcon
 * 
 */

/** Libreria de Arrays
 */
public class FArrays { 

//1
	
/**Crea un array de longitud deseada con int aleatorios del 0 al 10 

@param longitud longitud del array
@return un array de enteros

 */
	public static int[] crearArrayInt(int longitud) {
	
	int[] arrayInt = new int[longitud];
	
	for (int i = 0; i < longitud; i++) {
		arrayInt[i] = (int)(Math.random()*10);
	}
	
		return arrayInt;
	}
	
	
//2
	
/**Crea un array de longitud deseada con String que contendra "Dato "+ un numero aleatorio.
 
 @param longitud longitud del array
 @return array de 'Datos' aleatorios
 */
	public static String[] crearArrayString(int longitud) {
		
		String [] arrayString = new String [longitud];
		
		for (int i = 0; i < longitud; i++) {
			arrayString[i] = "Dato"+ (int)(Math.random()*10);
		}
		
		return arrayString;
	} 
	
	
	
//3
	
/**Muestra el contenido de un array de enteros que se pase por parametro.
	 
@param arrayInt array de enteros

*/
	public static void mostrarArrayInt(int[]arrayInt) {
		
		System.out.print("[ ");
		
		for (int contenido : arrayInt) {
			
			System.out.print(contenido+ " ");
			
		}
		System.out.print("]\n");
	}
	
	
	
	
//4
	
/**Muestra el contenido de un array de String que se pase por parametro.
	 
@param arrayString array de datos

*/
	public static void mostrarArrayString(String[]arrayString) {
		
		
		System.out.print("[ ");
		
		for (String contenido : arrayString) {
			
			System.out.print(contenido+ " ");
			
		}
		System.out.print("]\n");
	}
	
	
	
	
//5
	
/** Busca un entero dentro de un array de enteros y devuelve true si lo encuentra 
 y false si no
 
 @param arrayInt array en la que quieres buscar el entero
 @param numero entero que quieres buscar
 @return true o false dependiendo de si lo encuentra o no
 **/
	public static boolean buscarArrayInt(int[]arrayInt, int numero) {
		
		for(int i = 0; i < arrayInt.length; i++) {
			
			if (arrayInt[i] == numero) {
				return true;
			}
		}
		return false;
	}
	
	
	
//6
	
/**Busca un String (Dato + int) dentro de un array de String. Devuelve true
  si lo encuentra y false en caso contrario.
  
 @param arrayString array en la que quieres buscar el dato
 @param dato dato que quieres buscar
 @return true o false dependiendo de si lo encuentra o no
  */
	public static boolean buscarArrayString(String[] arrayString, String dato) {
		
		for(int i = 0; i < arrayString.length; i++) {
			
			if (arrayString[i].equals(dato)) {
				return true;
			}
		}
		return false;
	}
	

	
	
//7
	
/**Localiza la primera posicion del entero introducido como parametro en un array de enteros y la devolvera;
  en caso contrario, devolvera -1.
  
  @param arrayInt array de enteros sobre la que se va a hacer la busqueda del entero
  @param numero entero que queremos buscar
  @return índice del array en el que se encuentra el entero si está o -1 si no está
  */
	public static int localizaPosInt (int[] arrayInt, int numero) {
		
		for (int i = 0; i < arrayInt.length; i++) {
			
			if (arrayInt[i] == numero) {
				return i;
			} 
			
			
		}
		return -1;
	}
	
	
	
	
//8
	
/**Localiza la primera posicion en la que aparece el String buscado en el array. 
 Si no se encuentra, devolvera -1.
 
 @param arrayString array de String sobre la que se va a hacer la busqueda
 @param dato String que queremos localizar
 @return índice del array en el que se encuentra el String o -1 en caso de que no se encuentre 
 */
	public static int localizaPosString (String[] arrayString, String dato) {
		
		for (int i = 0; i < arrayString.length; i++) {
			
			if (arrayString[i].equals(dato)) {
				return i;
			} 
			
			
		}
		return -1;
		
	}
	
	

	
	
//9
	
/** Devuelve el numero de veces que aparece el entero en el array. 
 
 @param arrayInt array de enteros sobre la que se va a hacer la busqueda del entero
 @param numero entero que queremos buscar
 @return numero de veces que aparece el entero
 */
	public static int vecesIntArray(int[] arrayInt, int numero) {
	
		int acumulador = 0;
		
		for (int i = 0; i < arrayInt.length; i++) {
			
			if (arrayInt[i] == numero) {
				acumulador += 1;
			}
		}
		
		return acumulador;
	}


//10
/**Devuelve el numero de veces que aparece el String en el array. 
	 
  @param arrayString array de String sobre la que se va a hacer la busqueda del String
  @param dato String que queremos buscar
  @return  numero de veces que aparece el String
	 */
	public static int vecesStringArray(String[] arrayString, String dato) {
		
		int acumulador = 0;
		
		for (int i = 0; i < arrayString.length; i++) {
			
			if (arrayString[i].equals(dato)) {
				acumulador += 1;
			}
		}
		
		return acumulador;
	}
	
	
	
//11
	
/**Devuleve un array con la union de dos arrays pasando como 
 parametros dos arrays 
 
 @param arrayInt1 primer array al que se unirá el segundo array
 @param arrayInt2 segundo array 
 @return array resultante de la union anterior
  */
	public static int[] unirArraysInt(int[] arrayInt1, int[] arrayInt2) {
		
		int[] arrayInt3 = new int[arrayInt1.length + arrayInt2.length];
		
		for (int i = 0; i < arrayInt1.length; i++) {
			arrayInt3[i] = arrayInt1[i];
		}
		
		for (int k = 0; k < arrayInt2.length; k++) {
			arrayInt3[arrayInt1.length + k] = arrayInt2[k]; //el .length va uno más que los índices. Entonces si la anterior acaba en el indice 4, al poner .length estaríamos en la siguiente posicion
		}
		
		
		return arrayInt3;
	}
	
	

//12
	
/**Cambia los enteros encontrados en el array por el 
 * otro entero y devolvera el numero de veces que se ha cambiado. 
 * Si no se ha cambiado ninguna vez, devolvera  -1. 
 * 
 * @param arrayInt un array de enteros
 * @param num_bus un entero, que será el numero buscado
 * @param num_sust otro entero, que será el numero a sustituir
 * @return numero de veces que se intercambian los numeros (-1 si no se produce ningún intercambio)
 */

	public static int sustituirIntArray (int[] arrayInt, int num_bus, int num_sust) {
		
		int contador = 0; 
		
		for (int i = 0; i < arrayInt.length; i++) {
			
			if (arrayInt[i] == num_bus) {
				arrayInt[i] = num_sust;
				contador++;
			}
		}
		
		mostrarArrayInt(arrayInt);
		
		if(contador == 0) {
			return -1;
		}
		
		return contador;
		
		
	}
	
	
	
//13

/**Cambia los String encontrados en el array por el 
 * otro String y devolvera el numero de veces que se ha cambiado. 
 * Si no se ha cambiado ninguna vez, devolvera  -1. 
 * 
 * @param arrayString un array de String
 * @param string_bus un String, que será el String buscado
 * @param string_sust otro String, que será el String a sustituir
 * @return numero de veces que se intercambian los numeros (-1 si no se produce ningún intercambio)
 */

		public static int sustituirStringArray (String[] arrayString, String string_bus, String string_sust) {
			
			int contador = 0; 
			
			for (int i = 0; i < arrayString.length; i++) {
				
				if (arrayString[i].equals(string_bus)){
					arrayString[i] = string_sust;
					contador++;
				}
			}
			
			mostrarArrayString(arrayString);
			
			if(contador == 0) {
				return -1;
			}
			
			return contador;
			
			
		}	
		
		
//14
		
/**MISMO QUE EL ANTERIOR, PERO HECHO POR MI
 * Ordena un array de enteros. 

 @param arrayInt un array de enteros
 @return el array de enteros ordenado
 */
	public static void ordenarArrayInt(int[] datos) {
		
		for (int i = 1; i < datos.length; i++) {
			 boolean ordenado=true;
			 
			 for (int j = 0; j < datos.length-i; j++) {
			 
				 if (datos[j + 1] < datos[j]) {
					 // Intercambio (swapping)
					 int aux = datos[j + 1];
					 datos[j + 1] = datos[j];
					 datos[j] = aux;
					 ordenado=false; 
				 }
			 }
			 
			 if (ordenado) return;
		}
	}


		
		
	
//14
	
/**MISMO QUE EL ANTERIOR, PERO HECHO POR MI
 * Ordena un array de enteros. 

 @param arrayInt un array de enteros
 @return el array de enteros ordenado
 */
	public static int[] ordenarArrayIntMIO (int[] arrayInt) {
		
		//bucle para Nº veces que se recorre el array para ordenarlo
		for(int i = 0; i < arrayInt.length-1; i++) {//como máximo, para que esté ordenado, lo recorrerá uno menos que lo que ocupe
			
			//bucle para ir recorriendo el array
			for(int k = 0; k < arrayInt.length-1; k++) { //hasta length-1 porque como vamos de dos en dos, no podremos recorrer hasta length ya que tendríamos un índice que no apunta a nada
				
				if (arrayInt[k] > arrayInt[k+1]) {
					
					int temporal = arrayInt[k]; //usamos una temporal porque queremos intercambiar dos valores por otro sin que se superpongan
					arrayInt[k] = arrayInt[k+1];
					arrayInt[k+1] = temporal;
				}
			}
		}
		return arrayInt;
		
	}



//15
/**
 * Ordena un array de String 
 * 
 @param arrayString un array de String
 @return el array de String ordenado
 */
	public static void ordenarArrayString(String[] arrayString) {
		
		for (int i = 1; i < arrayString.length; i++) {
		 boolean ordenado=true;
		 
		 for (int j = 0; j < arrayString.length-i; j++) {
			 
			 if (arrayString[j].charAt(4) > arrayString[j+1].charAt(4)) {// porque los string con los que trabajamos son Dato+num
				// Intercambio (swapping)	
				String temporal = arrayString[j];
				arrayString[j] = arrayString[j+1];
				arrayString[j+1] = temporal;
				
				ordenado=false;
			} 
		  }
		 
		 if (ordenado) return;
		 
		}
	}


	
	
//15
/**MISMO QUE EL ANTERIOR, PERO HECHO POR MI
 * Ordena un array de String 
 * 
 @param arrayString un array de String
 @return el array de String ordenado
 */

	public static String[] ordenarArrayStringMIO(String[] arrayString) {
		
		for (int i = 0; i < arrayString.length - 1; i++) {
			for (int k = 0; k < arrayString.length - 1; k++) {
				if (arrayString[k].charAt(4) > arrayString[k+1].charAt(4)) {// porque los string con los que trabajamos son Dato+num
					String temporal = arrayString[k];
					arrayString[k] = arrayString[k+1];
					arrayString[k+1] = temporal;
				}
			}
		}
		return arrayString;
	}
	

//16
/**Búsqueda dicotomica Realizar la busqueda dicotomica de un entero en un array ordenado. 
 * (mirar documento de algoritmos de ordenación)
 * 
 @param arrayInt un array de enteros
 @param num_bus un numero que quieras buscar en la matriz
 */	
	public static int busquedaDicotomInt(int[] arrayInt, int num_bus) {
		
		int inicio = 0;
		int fin = arrayInt.length - 1;
		
		while (inicio <= fin) {//quiere decir que no nos hemos quedado con 
		
			int centro = (inicio + fin )/2; //vamos a la mitad del array
		
			if (arrayInt[centro] < num_bus) { //si es menor que el numero buscado
				inicio = centro + 1; //traspasamos el inicio para coger la mitad superior
		
			} else if (arrayInt[centro] > num_bus) { //si es mayor que el numero buscado
				fin = centro - 1; //traspasamos el fin para coger la mitad inferior
		
			} else {
				return centro; //si coinciden
			}
		}
		 return -1; //si no está el numero en el array
		}

	
//16
/** MISMO QUE EL ANTERIOR, PERO HECHO POR MI
 * Realizar la busqueda dicotomica de un entero en un array ordenado. 
 * 
 * 
 @param arrayInt un array de enteros
 @param num_bus un numero que quieras buscar en la matriz
 */
	public static void busquedaDicotomIntMIA (int[] arrayInt, int num_bus) {
		ordenarArrayInt(arrayInt); //primero es necesario ordenar el array
		
		boolean no_encontrado = true; //booleana para parar el bucle
		int[] arrayIntConst = arrayInt; //creo esta variable para mantener la matriz original, ya que utilizaré el método localizaPosInt al final y, por lo tanto, necesito su valor original
		
		while (no_encontrado & arrayInt.length > 1) {//bucle para que vaya buscando mientras se cumpla la condicion. La longitud para que podamos dividir la matriz en dos tiene que ser mayor que uno porque si no nos quedaríamos con una longitud 0
			
			if (arrayInt.length % 2 == 0) {
			if(num_bus == arrayInt[arrayInt.length/2]) {// en el caso de que lo encuentre
				no_encontrado = false; //rompe el bucle
				
			} else if (num_bus > arrayInt[arrayInt.length/2]) {//si el numero es mayor que el que está en la mitad, entonces es que se encuentra en la mitad superior del array
				int[] arrayMitadSup = new int[arrayInt.length/2]; //creamos la array de la mitad superior
				
				for(int i = 0; i < arrayMitadSup.length; i++) {//bucle para ir rellenando la matriz superior
					arrayMitadSup[i] = arrayInt[arrayInt.length/2 + i]; //hacemos eso para que empiece a tomar los valores de la mitad del array original en adelante
				}
				arrayInt = arrayMitadSup; //para que pueda volver a comprobar el primer if y repetir el ciclo
			
			} else if (num_bus < arrayInt[arrayInt.length/2]) {//si el numero es menor que el que está en la mitad, entonces es que se encuentra en la mitad inferior del array original
				int[] arrayMitadInf = new int[arrayInt.length/2]; //creamos el array de la mitad inferior
				
				for(int k = 0; k < arrayMitadInf.length; k++) {//bucle para ir rellenando la matriz inferior
					arrayMitadInf[k] = arrayInt[k]; //tomará los mismos valores que la primera mitad del array original
				}
				arrayInt = arrayMitadInf; //para que pueda volver a comprobar el primer if y repetir el ciclo
			}
			
		}else if (arrayInt.length % 2 != 0) {//en caso de que la longitud de la matriz se impar
			if(num_bus == arrayInt[arrayInt.length/2]) {// en el caso de que lo encuentre
				no_encontrado = false; //rompe el bucle
				
			} else if (num_bus > arrayInt[arrayInt.length/2]) {//si el numero es mayor que el que está en la mitad, entonces es que se encuentra en la mitad superior del array
				int[] arrayMitadSup = new int[arrayInt.length/2]; //creamos la array de la mitad superior
				
				for(int i = 0; i < arrayMitadSup.length; i++) {//bucle para ir rellenando la matriz superior
					arrayMitadSup[i] = arrayInt[arrayInt.length/2 +1 + i]; //hacemos eso para que empiece a tomar los valores de la mitad del array original en adelante. AÑADIMOS 1 PARA QUE NO TENGA EN CUENTA EL NUMERO QUE ACABA DE COMPROBAR Y QUE PUEDA RECORRER TODA LA MATRIZ PORQUE SI NO NO RECORRERIA TODA LA MATRIZ, DADO QUE ES IMPAR
				}
				arrayInt = arrayMitadSup; //para que pueda volver a comprobar el primer if y repetir el ciclo
			
			} else if (num_bus < arrayInt[arrayInt.length/2]) {//si el numero es menor que el que está en la mitad, entonces es que se encuentra en la mitad inferior del array original
				int[] arrayMitadInf = new int[arrayInt.length/2]; //creamos el array de la mitad inferior
				
				for(int k = 0; k < arrayMitadInf.length; k++) {//bucle para ir rellenando la matriz inferior
					arrayMitadInf[k] = arrayInt[k]; //tomará los mismos valores que la primera mitad del array original
				}
				arrayInt = arrayMitadInf; //para que pueda volver a comprobar el primer if y repetir el ciclo
			
			}
		}
	
	}
		if(no_encontrado == false) {
			System.out.println("\nTu numero ha sido encontrado. La primera casilla en la que aparece es en la: " +localizaPosInt(arrayIntConst, num_bus));// no uso arrayInt porque su valor va cambiando a lo largo de la busqueda dicotomica
			
		} else if (no_encontrado & arrayInt.length == 1) {//si la longitud es 1 y todavía no ha encontrado el numero, es que no está en la matriz
			System.out.println("\nTu numero no se encuentra en la matriz");
		}
	}
	
	

//17
/** Realizar la busqueda dicotomica de un String en un array ordenado. 
 * (mirar documento de algoritmos de ordenación) 
 * 
 @param arrayString una matriz de String
 @param dato un String que quieras buscar en la matriz
 @return índice en la que se encuentra el dato buscado

 */

	public static int busquedaDicotomString(String [] arrayString, String dato) {
		
		int inicio = 0;
		int fin = arrayString.length - 1;
		
		while (inicio <= fin) {
			
			int centro = (inicio + fin )/2;
			
			if (Integer.parseInt(arrayString[centro].substring(4)) < Integer.parseInt(dato.substring(4))) {//si el dato es menor teniendo en cuenta el n que le acompaña (Dato +n)
				
				inicio = centro + 1; //cogemos la mitad superior
				
			} else if (Integer.parseInt(arrayString[centro].substring(4)) > Integer.parseInt(dato.substring(4))) { //si el dato es mayor
				
				fin = centro - 1; //cogemos la mitad inferior
		
			} else { //si coinciden los datos
				
				return centro; //devolvemos la posicion en la que se encuentra
			}
		}
		
		return -1; //si no está en el array
	}
	


//19
/**Crea un array que contiene valores el tipo de dato Persona
 * Al crear el array, el nombre de cada Persona es generado con una letra mayuscula generada aleatoriamente 
 * (mirar tabla ASCII) seguido de un numero del 1 al 200 generados tambien aleatoriamente. 
 * La edad tambien se generará aleatoriamente del 1 al 120.
 * 
 * @param longitud longitud del array
 * @return array de tipo Persona
 */
	public static Persona[] crearArrayPersona (int longitud) {
		
		Persona[] arrayP = new Persona[longitud];//creo una matriz vacía de tipo Persona
		
		for (int i = 0; i < arrayP.length; i++) {//bucle para ir rellenando la matriz
			
			char char_nomb = (char)(Math.random()*26 + 65); //primer elemento del String nombre del constructor Persona
			int num_nomb = (int)(Math.random()*200 +1);//segundo elemento del String nombre del constructor Persona
			String nombre = String.valueOf(char_nomb) + num_nomb;//String que usa el constructor
			
			arrayP[i] = new Persona (nombre, (int)(Math.random()*120 +1));
			
			nombre = ""; //reseteo la variable
		}
		return arrayP;
	}
	
	
/*20*/
/**Muestra los valores de los atributos de las Personas de un Array. Aparecerá el nombre separado por | de la edad
 * 
 * @param arrayP un array de tipo Persona
 */
	public static void mostrarArrayPersona(Persona[] arrayP) {
			
		System.out.print("[ ");
		
		for (Persona contenido : arrayP) {
			
			System.out.print(contenido.toString()+ " ");
			
		}
		System.out.print("]\n");
				
	}
	

	
//21
/**Ordena el array de Personas segun su edad. Para poder comparar objetos, 
 * la clase Persona deberá implementar el interfaz Comparable y 
 * sobreescribir el método compareTo.
 * 
 * @param arrayP un array de tipo Persona
 */
	public static void ordenarArrayPersona(Persona[] arrayP) {
		
		Arrays.sort(arrayP);
			
		mostrarArrayPersona(arrayP);
	}
	
	
	
//22.
/**Crea una matriz de enteros aleatorios de n filas y m columnas que seran 
 * pasados por parametros. Los numeros aleatorios generados seran entre 20 y 120.
 * 
 * @param filas numero de filas
 * @param columnas numero de columnas
 * @return matriz bidimensional de enteros
 */
	public static int[][] crearMatrizInt(int filas, int columnas) {
		int[][] matriz = new int [filas][columnas];
		
		for (int i = 0; i < filas; i++) {//bucle que se va posicionando en las filas
			
			for (int k = 0; k < columnas; k++) {//bucle que se posiciona en las columnas
				
				matriz[i][k] = (int)(Math.random()*101 + 20);
			}
		}
		return matriz;
	}
	

//23
/**Crea una matriz de String de n filas y m columnas pasadas como parametros. 
 * El valor de cada String será formado por una letra mayusculas generada aleatoriamente seguido de 
 * un numero entre 1 y 101 generados tambien aleatoriamente.
 * 
 * @param filas numero de filas
 * @param columnas numero de columnas
 * @return matriz bidimensional de String
 */
	public static String[][] crearMatrizString (int filas, int columnas){
		
		String [][] matriz = new String[filas][columnas];
		
			for (int i = 0; i < filas; i++) {//bucle que se va posicionando en las filas
			
				for (int k = 0; k < columnas; k++) {//bucle que se posiciona en las columnas
				
					char char_String = (char)(Math.random()*26 + 65); //primer elemento del String 
					int num_String = (int)(Math.random()*101 +1);//segundo elemento del String 
					matriz[i][k] = String.valueOf(char_String) + num_String;;
			}
		}
			return matriz;
		
	}
	
	
	
	
//24.
/**Muestra una matriz de enteros pasada como parametro.
 * 
 * @param matriz matriz bidimensional de enteros
 */
	public static void mostrarMatrizInt (int[][] matriz) {
		
		int filas = matriz.length;
		
		
		for (int i = 0; i < filas; i++) {//bucle que se va posicionando en las filas
			System.out.print("[ ");
			for (int j = 0; j < matriz[i].length; j++) {//bucle que se posiciona en las columnas
				
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println("]");
		}
	}
	
	
	
//25.
/**Muestra una matriz de String pasada como parametro.
* 
* @param matriz matriz bidimensional de Strings
*/
	public static void mostrarMatrizString (String[][] matriz) {
			
		int filas = matriz.length;
			
			
		for (int i = 0; i < filas; i++) {//bucle que se va posicionando en las filas
			System.out.print("[ ");
			for (int j = 0; j < matriz[i].length; j++) {//bucle que se posiciona en las columnas
					
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println("]");
		}
	}
}

