package com.ellago;

public class MultiArrays {

	public static void main(String[] args) {
		
		
		//primer ejercicio
		int fila, columna;
		int[][] n = {{20, 4}, {67, 33}, {0,7}};
				
		for(columna = 0; columna < n[0].length; columna++) { //longitud de las columnas
			System.out.print("Columna: " + columna); 
		
		
		for(fila = 0; fila < n.length; fila++) {
						
				System.out.printf("%10d ", n[fila][columna]);
			}
		
			System.out.println();
		}
		
		
		//segundo ejercicio:
		int [][] m = new int [n[0].length][n.length];
		
		System.out.println("\nNueva matriz: ");
		for (fila = 0; fila < m.length; fila++) {
			
			for (columna = 0; columna < m[fila].length; columna++) {
				
				m[fila][columna] = n[columna][fila];
				System.out.print(m[fila][columna] + " ");
			}
			System.out.println(" ");
		}
	}
	
}
