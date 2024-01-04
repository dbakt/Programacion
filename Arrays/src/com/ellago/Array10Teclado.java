/**@author dabae
 * Crea un programa que declare un array de enteros y encuentre el valor máximo en el array.
 */
package com.ellago;

import java.util.Scanner;
import java.util.Arrays;
public class Array10Teclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
	
	//creo el array unidim vacío pero con la longitud deseada
		int [] numeros = new int[4];
	
	//variable que almacena el numero maximo
		int maximo = 0;
	
	//quiero que tenga 4 numeros
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Dame un número: ");
			numeros[i] = teclado.nextInt();
			
			//vamos comprobando si el numero introducido es el maximo
			if (numeros[i] > maximo) {
				maximo = numeros[i]; //se actualiza el valor del maximo en caso de encontrar un numero mayor
			}
	
		}
		
		System.out.println("Tu array es " +Arrays.toString(numeros));
		System.out.println("El número máximo presente en el array es " +maximo);
	
		teclado.close();
		
		
	}

}
