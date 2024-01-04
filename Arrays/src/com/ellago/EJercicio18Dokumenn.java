package com.ellago;

import java.util.Iterator;
import java.util.Arrays;

public class EJercicio18Dokumenn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] array = new int[2][10];
		
		//contadores de menores y mayores
		int menores = 0;
		int mayores = 0;
		
		//primer bucle para crear la matriz y saber cuantos mayores y menores hay
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 10; j++) {
				
				if (i < 1) {
					
					array[i][j] = j;
					
				} else {
					
					array[i][j] = (int)(Math.random()*201);
					if (array[i][j] < 100) {
						menores++;
					} else {
						mayores++;
					}
				}
			}
		}
		
		//foreach para imprimir la matriz
		for (int[] fila : array) {
			System.out.println(Arrays.toString(fila));
		}
		
		//segundo bucle (solo fijandonos en la segunda fila) para crear las matrices de menores y mayores
		int[]menor = new int[menores];
		int[]mayor = new int [mayores];
		int m = 0;
		int M = 0;
		
		for (int j = 0; j < 10; j++) {
			
			if (array[1][j] < 100) {
				while(m < menores) {
					menor[m] = array[1][j];
					m++;
					break;
				}
			} else {
				while(M < mayores) {
					mayor[M] = array[1][j];
					M++;
					break;
				}
			}
		}
		
		//tengo que formar la nueva matriz
		int [][] matriz = new int[2][10];
		//hay que tener en cuenta la diferecia de indices entre la matriz nueva y las matrices menores y mayores
		int difmen = -1; //por ocupar casillas impares
		int difMay = 0; //por ocupar casillas pares
		int contadorm = 0;
		int contadorM = 0;
		
		
		for (int i = 0; i < 2; i++) {
			
			for(int j = 0; j < 10; j++) {
				
				if(i < 1) {
					matriz[i][j] = j;
				}else if (i > 0 && j % 2 == 0) {
					if (contadorM < mayor.length) {
						matriz[i][j] = mayor[j + difMay];
						//tengo que contar cuantos se van poniendo para no pasarme de la longitud
						contadorM++;
						difMay--;
		
					} else {
						matriz[i][j] = menor[contadorm];
						contadorm++;
						difmen++; //ya que si se usa se resta 1, si no se usa, se sumará uno para mantener el equilibrio en la siguiente ronda;
					}
				} else {
					if(contadorm < menor.length) {
						matriz[i][j] = menor[j + difmen];
						contadorm++; //tiene que ir primero el if
						difmen--; // tiene que dejar de actuar en el momento que se salga del flujo normal
					} else {
						matriz[i][j] = mayor[contadorM];
						contadorM++;
						difMay++;
					}
				}
			}
		}
		System.out.println("\nNueva matriz\n");
		for (int[] fila : matriz) {
			System.out.println(Arrays.toString(fila));
		}
	}

}
