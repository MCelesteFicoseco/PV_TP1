package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, e;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese 5 numero enteros: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		e = scanner.nextInt();
		System.out.println("El promedio es: "+(a+b+c+d+e)/5);

	}
	

}
