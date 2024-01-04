/**@daniel
 * 
 * Declara un array de números e inicialízalo con algunos valores.
 *  Luego, crea una copia del array y muestra ambos arrays.
 */

package com.ellago;

import java.util.Arrays;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {1, 2, 3};
				
		
		int [] copia = Arrays.copyOf(numeros, numeros.length);
		
		System.out.println("original: " +Arrays.toString(numeros));
		System.out.println("copia: " +Arrays.toString(copia));
	}

}
