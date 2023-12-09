/**@author Daniel Barbero Alarcón**/

 
 /**
10.- Diseña un programa Java para leer las longitudes de los lados de un triangulo (L1, L2, L3) y calcular el área del mismo de acuerdo con la siguiente fórmula: 

Fórmula de cácular el área de un triángulo
 */

package com.ellago;

import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Dame un lado del triángulo l1: ");
		int l1 = teclado.nextInt();
		
		System.out.print("Dame un lado del triángulo l2: ");
		int l2 = teclado.nextInt();
		
		System.out.print("Dame un lado del triángulo l3: ");
		int l3 = teclado.nextInt();
		
		teclado.close();
		
		float sp = (l1 + l2 + +l3)/2;
		
		float area = (float)(Math.sqrt (sp*(sp-l1)*(sp-l2)*(sp-l3))); 
		
		System.out.println("El área del triángulo es: " +area);
		
	}

}
