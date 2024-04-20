package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nombres = new String[5];
		int b;
		
		for(int j=0; j<nombres.length; j++) {
			System.out.println("Ingrese un nombre:");
			nombres[j] = scanner.next();
		}
		
		mostrarArray(nombres);
		
		System.out.println("\nTamaño del array de nombres: "+nombres.length);
		
		do {
			System.out.println("Ingrese un numero entero entre 1 y 5");
			b = scanner.nextByte()-1;
		}while(b<0 || b>nombres.length-1);
		

		eliminarElemento(nombres, b);
		mostrarArray(nombres);
		
		scanner.close();
		

	}
	
	public static void mostrarArray(String[] a) {
		int i =0;
		while(i < a.length){
			System.out.print(a[i]+" ");
			i++;
		}
	}
	
	public static String[] eliminarElemento(String[] a, int b) {
		if(b == a.length-1) {
			a[b] = "";
		}else {
			int k = b;
			while(k<a.length-1) {
				a[k] = a[k+1];
				k++;
			}
			a[k] = "";
		}
		
		return a;
	}

}
