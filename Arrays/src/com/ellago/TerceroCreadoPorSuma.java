/**@author dabae
 * Crea un programa que declare dos arrays de enteros del mismo tamaño y 
 * calcule la suma de los elementos correspondientes de ambos arrays, 
 * almacenando el resultado en un tercer array.
 */
package com.ellago;

import java.util.Scanner;
import java.util.Arrays;
public class TerceroCreadoPorSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int [] array1 = new int[5];
		int [] array2 = new int[5];
		int [] array3 = new int[5];
		
		for(int i = 0; i < array1.length; i++) {
			System.out.print("Dame un número para el primer array: ");
			array1[i] = teclado.nextInt();
			
			System.out.print("Dame un número para el segundo array: ");
			array2[i] = teclado.nextInt();
			
			array3[i] = array1[i] + array2[i];  
			
		}
		teclado.close();
		
		System.out.println("Tu array 1 es: " +Arrays.toString(array1));
		System.out.println("Tu array 2 es: " +Arrays.toString(array2));
		System.out.println("Tu array 3 es: " +Arrays.toString(array3));
	}

}
