package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese unvalor entero mayor a 0 y menor a 10:");
			n = scanner.nextInt();
		}while (n < 1 && n >= 10);
		
		for (int i=0; i<=10; i++) {
			System.out.println(n+"x"+i+"="+(n*i));
		}
		
		scanner.close();
	}

}
