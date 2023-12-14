package com.ellago;

public class PruebaLibroCalificaciones {
	
	 public static int[][] crearCalificaciones (int filas, int columnas){
		
		 int [][] calificaciones = new int [filas][columnas]; 
		 
		 for (int i = 0; i < filas; i++) {
			 
			 for (int j = 0; j < columnas; j++) {
				 
				 calificaciones[i][j] = (int)(Math.random()*101);
			 }
			 System.out.println("");
		 }
		 
		 return calificaciones;
	 }
	 
	 public static void main (String[] args) {
		
		 int[][] calif = crearCalificaciones(5,7);

		 LibroCalificaciones lc=new LibroCalificaciones("Introducción a Java",calif);

		 lc.mostrarCalificaciones();
	 }
}
