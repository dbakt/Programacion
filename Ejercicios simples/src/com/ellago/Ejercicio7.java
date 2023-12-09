/**@author Daniel Barbero Alarcón**/

 
 /**
7.- Diseña un programa Java para resolver una ecuación de primer grado con una incógnita (x), suponiendo que los coeficientes de la ecuación (C1 y C2) se introducen desde teclado.

C1x + C2 = 0
 */

package com.ellago;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		float C1 = 0f, C2 = 0f, x = 0f;
		
		System.out.println("La ecuación a resolver es C1x - C2 = 0");
		
		System.out.print("Dame un valor para C1 = ");
		C1 = in.nextInt();
		
		System.out.print("Dame un valor para C2 = ");
		C2 = in.nextInt();
		
		in.close();
		
		x = -C2/C1;
		
		System.out.println("El resultado de la ecuación es: x = " +x);
		
	}

}
