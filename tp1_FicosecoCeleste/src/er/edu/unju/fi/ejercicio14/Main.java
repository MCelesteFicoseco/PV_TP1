package er.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n, suma=0 ;
		
		
		do {
			System.out.println("Ingresa un valor entero entre 3 y 10:");
			n = scanner.nextInt();
		}while(n<3 || n>10);
		
		int[] enteros = new int[n];
		
		for(int i=0; i<enteros.length; i++) {
			System.out.println("Ingrese un valor entero:");
			enteros[i] = scanner.nextInt();
		}
		
		for(int i=0; i<enteros.length; i++) {
			System.out.println(i+" -> "+enteros[i]);
			suma = suma+enteros[i];
		}
		
		System.out.println("La suma de los valores ingresados es: "+suma);
		
	}

}
