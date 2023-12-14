package com.ellago;

public class LibroCalificaciones {

	//atributos
	private String nombreCurso;
	private int[][] calificaciones;
	
	//constructor
	public LibroCalificaciones (String nombreCurso, int[][] calificaciones) {
		this.nombreCurso  = nombreCurso;
		this.calificaciones = calificaciones;
	}
	
	//métodos
	public int obtenerMinimo() {
		
		//creamos una variable que contenga la maxima nota para ir comparando e ir viendo cual es la nora minima
		int menor = 100;
		
		//buscamos el mínimo en la matriz
		for (int i = 0; i < this.calificaciones.length; i++) {
			
			for (int j = 0; j < this.calificaciones[i].length; j++) {
				
				if (this.calificaciones[i][j] < menor) { //si encontramos un menor, actualizamos
					
					menor = this.calificaciones[i][j];
				}
			}
		}
		
		return menor;
	}
	
	
	public int obtenerMáximo() {
		
		//creamos una variable que contenga la minima nota para ir comparando e ir viendo cual es la nota maxima
		int mayor = 0;
		
		//buscamos el maximo en la matriz
		for (int i = 0; i < this.calificaciones.length; i++) {
			
			for (int j = 0; j < this.calificaciones[i].length; j++) {
				
				if (this.calificaciones[i][j] > mayor) { //si encontramos un menor, actualizamos
					
					mayor = this.calificaciones[i][j];
				}
			}
		}
		
		return mayor;
	}
	
	
	public static double obtenerPromedio (int[] notasEstudiante) { //int[] notas estudiantes será calificaciones[i] en el main
		
		//creamos una variable que va a contener la suma de las notas
		double suma = 0;
		
		//creamos otra variable que va a contar el  número de notas que hay
		double contador = 0;
		
		//nos recorremos el array
		for (int i = 0; i < notasEstudiante.length; i++) {
			suma += notasEstudiante[i];
			contador++;
		}
		
		//creamos una variable para la media
		double media = suma / contador;
		
		return media;
	}
	
	
	public void mostrarCalificaciones () {
		
		System.out.println("Bienvenido al libro de calificaciones del curso " + this.nombreCurso);
		System.out.println("Las calificaciones son:");
		
		System.out.println("");
		System.out.print("\t\t");
		
		int columnas = this.calificaciones[0].length + 1; // ya que las cabeceras de las pruebas abarcan toda la longitud del matriz y además se va a añadir una nueva columna con el promedio
		int indice = 0; //posicion en la que va a empezar a poner las cabeceras
		
		while (indice < columnas) {
			
			if(indice < columnas - 1) {
			
				System.out.print("Prueba" + indice + " ");
			
			} else {
				
				System.out.print("Promedio");
			}
			indice++;
		}
		System.out.println("");
		
		//imprimimos ahora la matriz añadiendo la columna del promedio
		for (int i = 0; i < this.calificaciones.length; i++) {
			
			System.out.print("Estudiante" +i + " ");
			for(int j = 0; j < this.calificaciones[i].length; j++) {
		
				System.out.print("\t" + this.calificaciones[i][j]);

				if (j == calificaciones[i].length -1) { //tras pasar la última casilla, añadiremos el promedio
					System.out.printf("\t%.2f", obtenerPromedio(calificaciones[i]));
				}
			}
			System.out.println("");
		}
		
		System.out.println("La calificación máxima es: " + obtenerMáximo());
		System.out.println("La calificación mínima es: " + obtenerMinimo());
	}
}
