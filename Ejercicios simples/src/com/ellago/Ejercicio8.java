/**@author Daniel Barbero Alarcón**/

 
 /**
8.- Diseña un programa Java que calcule la suma, resta, multiplicación y división de dos números introducidos por teclado. Incorpora también las funciones que permitan realizar la potencia de un número y la raíz cuadrada del otro.

Ejemplo de salida del programa para x=9, y=3:

Introducir primer numero: 9
Introducir segundo numero: 3
x = 9.0 y = 3.0
x + y = 12.0
x - y = 6.0
x * y = 27.0
x / y = 3.0
x ^ 2 = 81.0
√ x = 3.0
 */

package com.ellago;

import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		System.out.print("Dame un primer número: ");
		float x = in.nextFloat();
		
		System.out.print("Dame un segundo número: ");
		float y = in.nextFloat();
		
		float suma = x+y;
		float resta = x-y;
		float multiplicación = x*y;
		float división = x/y;
		
		System.out.print("Dame un exponente: ");
		int exponente = in.nextInt();
		in.close();
		
		float potencia = (float)Math.pow(x, exponente);
		float raíz = (float)Math.sqrt(y);
		
		System.out.println("El resultado de la suma es: " +suma);
		System.out.printf("%s%f\n","El resultado de la resta es: ",resta);
		System.out.println("El resultado de la multiplicación es: " +multiplicación);
		System.out.printf("%s%f\n","El resultado de la división es: ",división);
		System.out.println("El resultado de la potencia es: " +potencia);
		System.out.printf("%s%f\n","El resultado de la raíz es: ",raíz);
	}
}
