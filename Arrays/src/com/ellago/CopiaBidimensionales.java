package com.ellago;

import java.util.Arrays;
public class CopiaBidimensionales {
	public class Ejercicio9 {

	    public static void main(String[] args) {
	        int[][] arrayOriginal = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Copiar el array bidimensional
	        int[][] copiaArray = new int[arrayOriginal.length][];
	        for (int i = 0; i < arrayOriginal.length; i++) {
	            copiaArray[i] = Arrays.copyOf(arrayOriginal[i], arrayOriginal[i].length);
	        }

	        // Mostrar ambos arrays
	        System.out.println("Array Original: " + Arrays.deepToString(arrayOriginal));
	        System.out.println("Copia del Array: " + Arrays.deepToString(copiaArray));
	    }
	}
}