/**@author dabae
 * Crea un programa que declare un array bidimensional y transponga sus filas y columnas.
 */

//PENDIENTE
package com.ellago;

import java.util.Scanner;
import java.util.Arrays;
public class MatrizTranspuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("¿Cuántas filas va a tener la matriz?");
		int filas = teclado.nextInt();
		
		System.out.print("\n¿Cuántas columnas va a tener la matriz?");
		int columnas = teclado.nextInt();
		
		int [][] matriz = new int[filas][columnas];
		
		int i = 0;
		int k = 0;
		
		
		for (i = 0; i < filas; i++) {
			for (k = 0; k < columnas; k++) {
				System.out.print("\n Dime el número que quieres colocar en la fila " +i+ " y en la columna " +k);
				matriz[i][k] = teclado.nextInt();
				
				
				
				}
			}
			
		}

	
private static boolean verificarSimetria(int[][] matriz) {
    int dimension = matriz.length;

    // Verificar simetría comparando la matriz original con su traspuesta
    for (int i = 0; i < dimension; i++) {
        for (int j = 0; j < dimension; j++) {
            // Comparar elemento original con su correspondiente en la traspuesta
            if (matriz[i][j] != matriz[j][i]) {
                return false;  // Si hay alguna diferencia, la matriz no es simétrica
            }
        }
    }

    // Si el bucle termina sin retornar false, la matriz es simétrica
    return true;
	
}
}
