package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese nombre:");
		String nombre = scanner.next();
		System.out.println("Ingrese fecha de nacimiento (dd/mm/yyyy)");
		String fecha_nac = scanner.next();
		
		String[] partesFecha = fecha_nac.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1;
        int anio = Integer.parseInt(partesFecha[2]);
		
        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes, dia);
        
        
        Persona persona1 = new Persona(nombre, calendar);
        
        System.out.println(persona1.toString());
        
        scanner.close();
	}

}
