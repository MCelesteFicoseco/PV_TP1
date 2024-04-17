package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[8];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<array.length; i++ ) {
			System.out.println("Ingrese un numero entero:");
			array[i] = scanner.nextInt();
		}
		for(int i=0; i<array.length;i++) {
			System.out.println(i+" -> "+array[i]);
		}
		
		scanner.close();
	}

}
