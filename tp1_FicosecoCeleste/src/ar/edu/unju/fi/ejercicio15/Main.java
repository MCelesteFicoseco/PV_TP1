package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Ingresa un valor entero entre 5 y 10:");
			n = scanner.nextInt();
		}while(n<5 || n>10);
		
		String[] nombres = new String[n];
		
		for(int i=0; i<nombres.length; i++) {
			System.out.println("Ingrese un nombre:");
			nombres[i] = scanner.next();
		}
		
		System.out.println("Desde la posición cero:");
		for(int i=0; i<nombres.length ;i++) {
			System.out.println(i+" -> "+nombres[i]);
		}
		
		System.out.println("Desde la ultima posición:");
		for(int i=nombres.length-1; i>=0 ;i--) {
			System.out.println(i+" -> "+nombres[i]);
		}
	}

}
