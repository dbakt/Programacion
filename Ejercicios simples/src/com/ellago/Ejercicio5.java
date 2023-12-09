/**@author Daniel Barbero Alarcón**/

 
 /**
5.- Diseña un programa Java que pida dos números por teclado, determine si el primero es múltiplo del segundo y muestre el resultado.
 */

package com.ellago;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numUno = 0, numDos = 0;
		
		System.out.print("Dame un primer número: ");
		numUno = teclado.nextInt();
		
		System.out.print("Dame un segundo número: ");
		numDos = teclado.nextInt();
		
		teclado.close();
		
		
		String caso1 = "El primer número sí es múltiplo del segundo";
		String caso2 = "El primer número no es múltiplo del segundo";
		String resultado = (numUno % numDos == 0) ?caso1:caso2;
		
		System.out.println(resultado);
		
	
	}

}
