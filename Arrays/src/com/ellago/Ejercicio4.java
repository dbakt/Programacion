/**@author dabae
 * Declarar dos arrays de 3 elementos cada uno e imprimir la suma de los elementos 
 * correspondientes (es decir, el primer elemento del primer array más el primer elemento
 * del segundo array, y así sucesivamente).
 */
package com.ellago;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {34,876,9};
		int[] array2 = {654,987,1234};
		int suma = 0;
		
		for (int i = 0; i < array1.length; i++) {//va recorriendo array1
			suma = array1[i] + array2[i];
			/*for (int k = 0; k < array2.length; k++) {//va recorriendo array 2 a la "par"
				
				if (i == k) {//para que se vayan sumando solo cuando esten en la misma posición
					suma = array1[i] + array2[k];
				}*/
			}
			
			System.out.print(suma+ " ");
			
		}
		
		/*forma sencilla;
		 
		 for (int i = 0; i < array.length; i++){
		 	
		 	suma = array1[i] + array2[i];
		 	syso (suma + " ");
		 }		 
		 */
	

}
