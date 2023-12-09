/**@author Daniel Barbero Alarcón**/

 
 /**
9.- Diseña un programa Java que solicite un número de 5 dígitos del teclado, separe el número en sus dígitos individuales y los muestre por pantalla. Por ejemplo, si el número es 53123 que muestre:

5 3 1 2 3
 */

package com.ellago;

import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Dame un número de 5 cifras: ");
		int num = teclado.nextInt();
		
		String cadena = String.valueOf(num);
		
		System.out.print(cadena.charAt(0)+ " " +cadena.charAt(1)+ " " +cadena.charAt(2)+ " " +cadena.charAt(3)+ " " +cadena.charAt(4)+ " ");
/*
		int nuevo = num/10000;
		int nuevo1 = (num%10000)/1000;
		int nuevo2 = (num%1000)/100;
		int nuevo3 = (num%100)/10;
		int nuevo4 = (num%10);
		
		System.out.print(nuevo+ " " +nuevo1+ " " +nuevo2+ " " +nuevo3+ " " +nuevo4+ " ");
		*/
		teclado.close();
	}

}
