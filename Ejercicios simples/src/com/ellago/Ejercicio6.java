/**@author Daniel Barbero Alarcón**/

 
 /**
6.- Diseña un programa Java que cree un tipo enumerado para los meses del año. El programa debe realizar las siguientes operaciones:

• Crear una variable m del tipo enumerado y asignarle el mes de marzo. Mostrar por pantalla su valor.
 */

package com.ellago;

public class Ejercicio6 {
	public enum Meses {Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meses m = Meses.Marzo;
		
		System.out.println("El mes elegido es: " +m);
	}

}
