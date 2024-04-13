package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor entero para N:");
		int n = scanner.nextInt();
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setN(n);
		System.out.println("Valor actual de n: "+calculadora.getN());
		
		System.out.println("\nCalcular Sumatoria");
		System.out.println(calculadora.calcularSumatoria());
		
		System.out.println("\nCalcular Productoria");
		System.out.println(calculadora.calcularProductoria());
		scanner.close();
		
	}

}
