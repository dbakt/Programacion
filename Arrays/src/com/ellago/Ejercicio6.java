/**@author dabae
 * Declarar e inicializar un array de 5 elementos desordenados. 
 * Utilizar el método sort de la clase Arrays para ordenar el array e imprimir el resultado.
 */
package com.ellago;

import java.util.Arrays;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {4,8,23,6,1};
		Arrays.sort(numeros);
		
		/*for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+ " ");*/
		
		System.out.print(Arrays.toString(numeros));
		
		}

	}

