/**@author dabae
 * Declarar e inicializar un array de 7 elementos ordenados. 
 * Utilizar el método binarySearch de la clase Arrays para buscar 
 * un número en el array e imprimir el resultado.
 */
package com.ellago;

import java.util.Arrays;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {2,7,9,45,57,3,86};
		
		Arrays.sort(numeros);
		
		System.out.print(Arrays.binarySearch(numeros, 86));
	}

}
