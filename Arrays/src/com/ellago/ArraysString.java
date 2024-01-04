/**@author dabae
 * Crea un programa que declare un array de cadenas de texto
 *  y encuentre la cadena más larga en el array.
 */
package com.ellago;

import java.util.Scanner;
import java.util.Arrays;
public class ArraysString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String [] array1 = new String[3];
		
		//variable que almacene la longitud maxima
		int mayor_longitud = 0; 
		
		//variable que almacene la cadena de mayor longitud
		String cadena_max = "";
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Dime una cadena de caracteres: ");
			array1[i] = teclado.nextLine();
			
			if (array1[i].length() > mayor_longitud ) {
				mayor_longitud = array1[i].length(); //actualizamos la longitud maxima
				cadena_max = array1[i]; //que correspondera a esta cadena
			}
		}
		teclado.close();
		
		System.out.println("Tu array es: " +Arrays.toString(array1));
		System.out.println("La longitud mayor es de la cadena: " +cadena_max);
		System.out.println("Y tiene una longitud de: " +mayor_longitud);
	}

}
