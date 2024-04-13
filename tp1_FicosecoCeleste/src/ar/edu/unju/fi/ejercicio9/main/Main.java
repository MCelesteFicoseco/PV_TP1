package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		Scanner scanner = new Scanner(System.in);
		while (n<=3) {
			System.out.println("\nProducto N° "+n);
			System.out.println("Ingrese nombre del producto:");
			String nombre = scanner.next();
			System.out.println("Ingrese código del producto:");
			int codigo = scanner.nextInt();
			System.out.println("Ingrese precio del producto:");
			float precio = scanner.nextFloat();
			int descuento;
			do {
				System.out.println("Ingrese descuento del producto:");
				descuento = scanner.nextInt();
			}while(descuento <0 && descuento>50);
			
			System.out.println("\nAlmacenando producto ...");
			Producto p1 = new Producto();
			p1.setNombre(nombre);
			p1.setCodigo(codigo);
			p1.setPrecio(precio);
			p1.setDescuento(descuento);
			System.out.println(p1.toString());
			
			System.out.println("\nCalcular descuento");
			System.out.println("Nuevo precio: "+p1.calcularDescuento());
			n++;
		}
		scanner.close();

	}
	 
}
