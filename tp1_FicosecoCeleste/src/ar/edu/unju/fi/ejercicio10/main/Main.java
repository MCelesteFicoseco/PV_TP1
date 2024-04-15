package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		int n = 1;
		int diametro;
		boolean ing_especiales;
		Scanner scanner = new Scanner(System.in);
		while (n<=3) {
			System.out.println("\nPizza N° "+n);
			do {
				System.out.println("Ingrese diametro:");
				diametro = scanner.nextInt();
			}while (!(diametro == 20 || diametro == 30 || diametro == 40));
			
			
			do {
				System.out.println("Desea que contenga ingredientes especiales?[true/false]");
				ing_especiales = scanner.nextBoolean();
			}while (!(ing_especiales == true && ing_especiales == false ));
			
			
			System.out.println("\nAlmacenando producto ...");
			Pizza pizza = new Pizza();
			pizza.setDiametro(diametro);
			pizza.setIngredientesEspeciales(ing_especiales);
			pizza.calcularPrecio();
			pizza.calcularArea();
			
			
			System.out.println(pizza.toString());
		
			n++;
		}
		scanner.close();
	}

}
