package com.ellago;

import java.util.Arrays;
public class Ejercicio18Dokumen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filas = 2;
		int columnas = 11;
		String [][] matriz = new String[filas][columnas];
		int contador = 0; //para poner los numeros del 0-9 en la primera fila. le pongo -1 para que empiece en 0
		
		//para contar la cantidad de numeros que hay de cada uno
		int contadorMenor = 0;
		int contadorMayor = 0;
		
		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				
				if (i == 0 && j == 0) {
					matriz[i][j] = "Índice:";
				
				} else if (i == 1 && j == 0) {
					matriz[i][j] = "Valor:";
				
				} else if (i == 0 && j > 0) {
					matriz[i][j] = String.valueOf(contador++);
					
				} else if (i == 1 && j > 0) {
					matriz[i][j] = String.valueOf((int)(Math.random()*201));
					
					if (Integer.parseInt(matriz[i][j]) < 100) {//si el numero es menor a 100
						contadorMenor++; //contamos para crear un array
						
					}else {
						contadorMayor++;
				}
				
			}
			
		}
		}
		
		for (String[] fila : matriz) { //es la unica manera de separar las filas
            System.out.println(Arrays.toString(fila));
            System.out.println("");
        }
		
		//BUSCAMOS MENORES Y MAYORES PARA PODER ORDENAR
		/*int menor = 200; //limite superior
		int mayor = 0; //limite inferior
		
		for (int veces = 1; veces <= columnas/2; veces++) {//como va tomando de dos en dos numeros, se tendrá que recorrer el array un máximo de la mitas de su longitud
			for (int j = 1; j < columnas; j++) {
				
				if (Integer.parseInt(matriz[1][j]) < menor &&  ) {
					menor = Integer.parseInt(matriz[i][j]); //actualizamos el menor
					matriz[1][j] = String.valueOf(0); // transformamos los números obtenidos a 0 en la matriz para no tenerlos en cuenta en las siguientes vueltas				
				}
				
				if (Integer.parseInt(matriz[1][j]) > mayor) {
					mayor = Integer.parseInt(matriz[1][j]);
				}
			}
		} ESTO SERÍA PARA IR COLOCANDO MENOR-MAYOR EN GENERAL*/
		
		//BUSCAMOS MENORES Y MAYORES PARA PODER ORDENAR
		
		//CREAMOS LA NUEVA MATRIZ
		contador = 0; //reseteo la variable para el nuevo array
		String[][] matrizNueva = new String[filas][columnas];
		
		//variables que almacenarán los menores y mayores de 100
		String menor = "0";
		String mayor = "0";
		
		//para la relacion entre casillas impares-menores y casillas pares-mayores
		int diferenciaMenor = -1;
		int diferenciaMayor = -2;
		
		//para poder guardar todos sus valores. Son String porque el array original tambien lo es
		String[] menores = new String [contadorMenor];
		String[] mayores = new String [contadorMayor];
		
		//contadores de los for de matrices mayores y menores 
		int m = 0;
		int M = 0;
		
		
		for (int k = 0; k < filas; k++) { //bucle para recorrer la matriz e ir separando mayores y menores
			
			for (int l = 0; l < columnas; l++) {
				
				if(k == 1 && l > 0) {
					
					if (Integer.parseInt(matriz[k][l]) < 100) {//si el numero es menor a 100
						menor = matriz[k][l]; //almacenamos el numero (String) en esta variable 
						
						//bucle para crear array con menores
						while(m < contadorMenor) {
							menores[m] = String.valueOf(menor);
							break;
						}
						m++;
					}else {
						mayor = matriz[k][l];
						//bucle para crear array con mayores
						while(M < contadorMayor) {
							mayores[M] = String.valueOf(mayor);
							break;
						}
						M++;
					}
					
				}	
				}
			}
		
		
		
			//reseteamos el contador a 0 para que nos muestre los índices
			contador = 0;
			//contadores nuevos que irán aumentando a medida que se vayan usando los números. también lo usaremos para saber cuando hemos llegado al final de la longitud de los arrays
			int contadorMenNuevo = 0; //van a la par con los índices
			int contadorMayNuevo = 0;
			//bucle para construir la nueva matriz
			for (int mNf = 0; mNf < filas; mNf++) { //bucle para recorrer la matriz e ir separando menores y mayores
				
				for (int mNc = 0; mNc < columnas; mNc++) {
					
					if (mNf == 0 && mNc == 0 ) {
						matrizNueva[mNf][mNc] = "Índice:";
					
					} else if (mNf == 1 && mNc == 0) {
						matrizNueva[mNf][mNc] = "Valor:";
					
					} else if (mNf == 0 && mNc > 0) {
						matrizNueva[mNf][mNc] = String.valueOf(contador++);
						
					} else if (mNf == 1 && mNc > 0) {
						
						if (contadorMenNuevo >= menores.length) {//significa que ya ha llegado al final de la matriz
							matrizNueva[mNf][mNc] = mayores [contadorMayNuevo]; //seguirá rellenando con la otra
							break;
						}
						
						if (contadorMayNuevo >= mayores.length) {//significa que ya ha llegado al final de la matriz
							matrizNueva[mNf][mNc] = menores [contadorMenNuevo];
							break;
						}
						
						
						if (mNc % 2 != 0) {//si nos fijamos, los menores de 100 ocupan las casillas impares
							matrizNueva[mNf][mNc] = menores[mNc + diferenciaMenor];
							diferenciaMenor--;//por cómo es la relación entre ellos
							contadorMenNuevo++;
									
						} else {
							matrizNueva[mNf][mNc] = mayores[mNc + diferenciaMayor];
							diferenciaMayor--;
							contadorMayNuevo++;
						}
					}
			
		}
		}
		for (String[] fila : matrizNueva) { //es la unica manera de separar las filas
            System.out.println(Arrays.toString(fila));
            System.out.println("");
        }
	}
	}




