package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese unvalor entero mayor a 0 y menot a 10:");
			n = scanner.nextInt();
		}while (n < 0 && n > 10);
		
		int f = 1;
		int c = 1;
		
		while (c <= n) {
			f *= c;
			c++;
		}
		
		System.out.println("Resultado: "+n+"! = "+f);
		
		scanner.close();
	}

}
