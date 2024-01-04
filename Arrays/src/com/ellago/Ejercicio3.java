/**@author dabae
 * Declarar un array de 10 elementos e imprimir la suma de todos los elementos.
 */
package com.ellago;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {5,8,34,7,5,0,3,64,8,12};
		int suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {//bucle para que recorra la longitud
			suma += numeros[i];//vaya sumando los numeros
			
		}
		System.out.printf("%s%d", "La suma de todos los números es ", +suma);
	}

}
