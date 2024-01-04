package com.ellago;

public class Tridimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][][] cubo = {
				{{1, 2, 3}, {4, 5, 6}},
				{{7, 8, 9}, {10, 11, 12}}
		};

	
	for (int i = 0; i < cubo.length; i++) {
		for (int j = 0; j < cubo[i].length; j++) {
			for (int k = 0; k < cubo[i][j].length; k++) {
				System.out.print(cubo[i][j][k]+ " ");
			}
		}
		System.out.println("");
	}
	
}
}
