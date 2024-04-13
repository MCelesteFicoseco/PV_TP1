package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese legajo:");
		int legajo = scanner.nextInt();
		System.out.println("Ingrese nombre:");
		String nombre = scanner.next();
		System.out.println("Ingrese salario:");
		float salario = scanner.nextFloat();
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		scanner.close();
		
		System.out.println(empleado.toString());
		System.out.println("\nSolicitando un aumento de sueldo ...");
		empleado.aumento();
		System.out.println(empleado.toString());
	}

}
