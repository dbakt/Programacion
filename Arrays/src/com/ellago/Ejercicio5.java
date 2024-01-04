/**@author dabae
 * Declarar e inicializar una matriz de 3x3 e imprimir todos sus elementos.
 */
package com.ellago;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] numeros = {
				
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		for (int indiceFil = 0; indiceFil < numeros.length; indiceFil++) {
			
			for (int indiceCol = 0; indiceCol < numeros[indiceFil].length; indiceCol++) {//cada posicion del indiceFil es como si fuera un array de una dimenson por eso la length se pone en funcion de i porque estamos señalando que array individual estamos recorriendo
				
				System.out.print(numeros[indiceFil][indiceCol]+ " ");//tengo que poner los dos indices para que pueda imprimirme el numero exacto. como hundir la flota
			}
			System.out.println(" ");
		}
	}

}
