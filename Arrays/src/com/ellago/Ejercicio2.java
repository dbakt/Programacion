/**@author dabae
 * Declarar un array de 5 números enteros e incrementar en 2 cada elemento. 
 * Imprimir el array resultante.
 */
package com.ellago;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {1,6,3,9,7};
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] += 2;
			System.out.println(numeros[i]);
		}
	}

}
