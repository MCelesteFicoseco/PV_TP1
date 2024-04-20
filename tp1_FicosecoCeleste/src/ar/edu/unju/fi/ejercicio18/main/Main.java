package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		List<Pais> pais = new ArrayList<>();
		pais.add(new Pais("001","Argentina"));
		pais.add(new Pais("002","Chile"));
		pais.add(new Pais("003","Uruguay"));
		pais.add(new Pais("004","Bolivia"));
		
		List<DestinoTuristico> destinos = new ArrayList<>();
		
		do {
			n = menu();
			
			switch(n) {
			case 1:
				destinos = altaDestino(destinos, pais);
				break;
			case 2:
				mostrarDestinos(destinos);
				break;
			case 3:
				modificarDestinos(destinos, pais);
				break;
			case 4:
				limpiarDestinos(destinos);
				break;
			case 5:
				eliminarDestino(destinos);
				break;
			case 6:
				destinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
				mostrarDestinos(destinos);
				break;
			case 7:
				mostrarPaises(pais);
				break;
			case 8:
				mostrarSegunPais(destinos, pais);
				break;
				
			}
		}while (n != 9);
		
		System.out.println("Programa terminado....");
		
	}
	
	public static int menu() {
		Scanner scanner = new Scanner(System.in);
		int opc;
		
		System.out.println("------------------- MENU -------------------");
		System.out.println("1 - Alta de destino turistico");
		System.out.println("2 - Mostrar los destinos turisticos");
		System.out.println("3 - Modificar el pais de un destino turistico");
		System.out.println("4 - limpiar el ArrayList de destino turistico");
		System.out.println("5 - Eliminar un destino turistico");
		System.out.println("6 - Mostrar los destinos turisticos ordenados por nombre");
		System.out.println("7 - Mostrar todos los paises");
		System.out.println("8 - Mostrar los destinos turisticos que pertenezcan a un pais");
		System.out.println("9 - Salir");
		System.out.println("-------------------------------------------");
		do {
			System.out.println("Ingrese una opción");
			opc = scanner.nextInt();
		}while(opc<1 || opc>9);
		//scanner.close();
		return opc;
	}
	
	public static List<DestinoTuristico> altaDestino(List<DestinoTuristico> d, List<Pais> pais){
		Scanner scanner = new Scanner(System.in);
		int n;
		
		System.out.println("*************** ALTA DE DESTINO TURISTICO ****************");
		System.out.println("Ingrese el codigo:");
		String codigo = scanner.next();
		
		System.out.println("Ingrese el nombre:");
		String nombre = scanner.next();
		
		System.out.println("Ingrese el precio:");
		float precio = scanner.nextFloat();
		
		System.out.println("Ingrese cantidad de dias:");
		int dias = scanner.nextInt();
		
		System.out.println("Ingrese el codigo de pais:");
		String codigoPais = scanner.next();
		
		for(Pais p: pais) {
			if(p.getCodigo().equals(codigoPais)) {
				DestinoTuristico destino  = new DestinoTuristico(codigo, nombre, precio, p, dias);
				d.add(destino);
			}
		}
		
		return d;
	}
	
	public static void mostrarDestinos(List<DestinoTuristico> d) {
		for(DestinoTuristico c: d) {
			System.out.println(c);
		}
	}

	public static List<DestinoTuristico> modificarDestinos(List<DestinoTuristico>  destino,  List<Pais> pais){
		Scanner scanner = new Scanner(System.in);
		String codigo;
		int n;
		System.out.println("Ingresar codigo de destino:");
		codigo = scanner.next();

		for(DestinoTuristico c: destino) {
			if(c.getCodigo().equals(codigo)) { 
				System.out.println("----> MODIFICAR DATOS DE "+c.getNombre());
				System.out.println("Ingrese el nuevo código de pais:");
				String nuevo_cod = scanner.next();
				for(Pais p: pais) {
					if(p.getCodigo().equals(nuevo_cod)) {
						c.setPais(p);
					}
				}
				
			}
			
		}
		return destino;
	}
	
	public static List<DestinoTuristico> limpiarDestinos(List<DestinoTuristico> destino){
		destino.clear();
		System.out.println("No hay destinos para mostrar...");
		return destino;
	}
	
	public static List<DestinoTuristico> eliminarDestino(List<DestinoTuristico> destino){
		Scanner scanner = new Scanner(System.in);
		String codigo;
		
		System.out.println("Ingresar coodigo del destino:");
		codigo = scanner.next();
		Iterator iterator = destino.iterator();
		while(iterator.hasNext()) {
			DestinoTuristico c = (DestinoTuristico)iterator.next();
			if(c.getCodigo().equals(codigo)) { 
				destino.remove(c);
			}
		}
		return destino;
	}

	public static void mostrarPaises(List<Pais> p) {
		for(Pais c: p) {
			System.out.println(c);
		}
	}
	
	public static void mostrarSegunPais(List<DestinoTuristico>  destino, List<Pais> pais){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el codigo del pais:");
		String paisCod = scanner.next();
		for(DestinoTuristico c: destino) {
			if(c.getPais().getCodigo().equals(paisCod)) {
				System.out.println(c);
			}
		}
	}
}
