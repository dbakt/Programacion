/**@author Daniel Barbero Alarcón**/

 
 /**
  4.- Realiza las siguientes modificaciones en el programa anterior:

1. Añade comentarios, entre otros:

• Nombre de clase, descripción y autor
• Comentario para la clase main y para cada una de las llaves de cierre

2. Utiliza el operador de asignación para inicializar las variables a los valores que se indican en los mensajes.
3. Utiliza la secuencia de escape correspondiente para generar un tabulador al principio de cada línea salvo de la primera
4. Mostrar el siguiente resultado:
 */

package com.ellago;

public class Ejercicio4 { //es nuestra clase principal, que debe empezar por mayúscula y será el nombre de nuestro archivo.
	
	public enum Sexo {V,M};
	
    public static void main(String [] args) { //este es el método main que nos permitira el la correcta lectura y ejecución del código que contenga sus llaves
	  
	  
	    boolean casado = true;
	    final int MAXIMO = 999999;
	    byte diasem = 1;
	    short diaanual = 300;
	    long miliseg = 1298332800000l;
	    float totalfactura = 10350.678f;
	    long poblacion = 6775235741l;
	    Sexo sexo = Sexo.M;
	
	    System.out.println("----EJERCICIO DE VARIABLES Y TIPOS DE DATOS----");
	    System.out.println("\tEl valor de la variable casado es: " +casado);
	    System.out.println("\tEl valor de la variable MAXIMO es: " +MAXIMO);
	    System.out.println("\tEl valor de la variable diasem es: " +diasem);
	    System.out.println("\tEl valor de la variable diaanual es: " +diaanual);
	    System.out.println("\tEl valor de la variable miliseg es: " +miliseg);
	    System.out.println("\tEl valor de la variable totalfactura es: " +totalfactura);
	    System.out.println("\tEl valor de la variable poblacion es: " +poblacion);
	    System.out.println("\tEl valor de la variable sexo es: " +sexo);
	
	    System.out.println("");
	  
	    totalfactura = 10350.677734f;
	  
	    System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
	    System.out.printf("\t%s%s\n", "El valor de la variable casado es: ",casado);
	    System.out.printf("\t%s%d\n", "El valor de la variable MAXIMO es: ",MAXIMO);
	    System.out.printf("\t%s%d\n", "El valor de la variable diasem es: ",diasem);
	    System.out.printf("\t%s%d\n", "El valor de la variable diaanual es: ",diaanual);
	    System.out.printf("\t%s%s\n", "El valor de la variable miliseg es: ",miliseg);
	    System.out.printf("\t%s%E\n", "El valor de la variable totalfactura en notación científica es: ",totalfactura);
	    System.out.printf("\t%s%d\n", "El valor de la variable poblacion es: ",poblacion);
	    System.out.printf("\t%s%s\n", "El valor de la variable sexo es: ",sexo);
	
		
	}//llave que cierra el método main

}//llave que cierra nuestra clase principal
