
package com.ellago;
/**@author Daniel Barbero Alarcón
 * 
 */
public class Persona implements Comparable <Persona> {
	
	//atributos
	private String nombre;
	private int edad;
	
	//constructor
	public Persona (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	//métodos
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//sobreescribo el metodo toString aplicándolo a la clase Persona
	@Override
	public String toString () {
		return this.nombre + "|" + this.edad;
	}
	
	@Override
	//metodo compareTo para comparar dos objetos de la misma clase. Devuelve - si el objeto actual es menor; 0 si son iguales; y + si es mayor
	public int compareTo(Persona objeto2) {//solo le pasamos un parámetro porque el objeto actual es sobre el que usamos el método
		return this.edad - objeto2.getEdad(); //Al ser enteros, se pueden restar directamente. Se puede usar también Integer.compare porque vamos comparar edades que es el criterio que usaremos para ordenar el array
	}
}
