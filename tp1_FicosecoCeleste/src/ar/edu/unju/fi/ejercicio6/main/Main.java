package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {

		System.out.println("Constructor por defecto");
		Persona persona1 = crearPersona(1);
		System.out.println(persona1.toString());
		System.out.println("Constructor parametrizado");
		Persona persona2 = crearPersona(1);
		System.out.println(persona2.toString());
		System.out.println("Constructor con dni, nombre y fecha");
		Persona persona3 = crearPersona(1);
		System.out.println(persona3.toString());
		

	}
	
	public static Persona crearPersona(int opcion) {
		Scanner scanner = new Scanner(System.in);
		Persona p1;
		int dni;
		String nombre;
		LocalDate fecha_nac;
		String provincia;
		
		System.out.println("Ingrese el DNI:");
		dni = scanner.nextInt();
		System.out.println("Ingrese nombre:");
		nombre = scanner.next();
		System.out.println("Ingrese fecha de nacimiento:");
		String dateString = scanner.next();
		fecha_nac = LocalDate.parse(dateString);
		
		if (opcion==1 || opcion == 2) {
			System.out.println("Ingrese provincia:");
			provincia = scanner.next();
			if(opcion == 1) {
				p1 = new Persona();
				p1.setDni(dni);
				p1.setNombre(nombre);
				p1.setFecha_nac(fecha_nac);
				p1.setProvincia(provincia);
			}else {
				p1 = new Persona(dni, nombre, fecha_nac,provincia);
			}
		}else {
			p1 = new Persona();
			p1.setDni(dni);
			p1.setNombre(nombre);
			p1.setFecha_nac(fecha_nac);
		}
		
		scanner.close();
		return p1;
		
	}

}
