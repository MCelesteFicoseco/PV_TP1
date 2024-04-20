package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		int n, cant=0;
		List<Jugador> jugadores = new ArrayList<>();
		
		do {
			n = menu();
			
			switch(n) {
			case 1:
				jugadores = altaJugador(jugadores, cant);
				cant++;
				break;
			case 2:
				mostrarJugador(jugadores, cant);
				break;
			case 3:
				jugadores.sort(Comparator.comparing(Jugador::getApellido));
				mostrarJugador(jugadores, cant);
				break;
			case 4:
				modificarJugador(jugadores);
				break;
			case 5:
				eliminarJugador(jugadores);
				break;
			case 6:
				System.out.println("Cantidad de jugadores: "+jugadores.size());
				break;
			case 7:
				mostrarSegunNacionalidad(jugadores);
				break;
				
			}
		}while (n != 8);
		
		System.out.println("Programa terminado....");
		

	}
	
	public static int menu() {
		Scanner scanner = new Scanner(System.in);
		int opc;
		
		System.out.println("------------------- MENU -------------------");
		System.out.println("1 - Alta de jugador");
		System.out.println("2 - Mostrar los datos del jugador");
		System.out.println("3 - Mostrar todos los jugadores por apellido");
		System.out.println("4 - Modificar los datos de un jugador");
		System.out.println("5 - Eliminar un jugador");
		System.out.println("6 - Mostrar la cantidad de jugadores");
		System.out.println("7 - Mostrar la cantidad de jugadores de una nacionalidad");
		System.out.println("8 - Salir");
		System.out.println("-------------------------------------------");
		do {
			System.out.println("Ingrese una opción");
			opc = scanner.nextInt();
		}while(opc<1 || opc>8);
		//scanner.close();
		return opc;
	}
	
	public static List<Jugador> altaJugador(List<Jugador>  j, int cant) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.println("*************** ALTA DE JUGADOR ****************");
		System.out.println("Ingrese el nombre:");
		String nombre = scanner.next();
		
		System.out.println("Ingrese el apellido:");
		String apellido = scanner.next();
		
		String nac_string;
		LocalDate fecha_nac;
		
		do {
			try {
				System.out.println("Ingrese la fecha de nacimiento: (yyy-mm-dd)");
				nac_string = scanner.next();
				fecha_nac = LocalDate.parse(nac_string);
			}catch (Exception ex){
				nac_string = "";
				fecha_nac = LocalDate.now();
				scanner.nextLine();
			}
		}while(fecha_nac.isEqual(LocalDate.now()) );
		
			
		System.out.println("Ingrese la nacionalidad:");
		String nacionalidad = scanner.next();
		
		float estatura;
		do {
			try {
				System.out.println("Ingrese la estatura en cm:");
				estatura = scanner.nextFloat();
			}catch(Exception ex) {
				estatura = (float)0.0;
				scanner.nextLine();
			}
		}while(estatura == 0.0 || estatura < (float)100);
		
		float peso;
		do {
			try {
				System.out.println("Ingrese el peso en kg:");
				peso = scanner.nextFloat();
			}catch(Exception ex) {
				peso = (float)0.0;
				scanner.nextLine();
			}
		}while(peso == 0.0 || peso < (float)30);
		
		String [] posicion = {"delantero", "medio", "defensa", "arquero"};
		do {
			System.out.println("Ingresar la posicion:");
			System.out.println("1.Delantero \n2.Medio \n3.Defensa \n4.Arquero");
			n = scanner.nextInt();
		}while(n<1 || n>4);
		Jugador jugador = new Jugador(nombre, apellido, fecha_nac, nacionalidad, estatura, peso, posicion[n-1]);
		if(cant == 0) {
			j.add(jugador); //CORREGIR
		}else {
			j.add(jugador);
		}
		
		return j;
	}
	
	public static void mostrarJugador(List<Jugador> jugadores, int cant) {
		for(Jugador c: jugadores) {
			System.out.println(c);
		}
	}

	public static List<Jugador> modificarJugador(List<Jugador>  j){
		Scanner scanner = new Scanner(System.in);
		String nombre, apellido;
		int n;
		System.out.println("Ingresar nombre:");
		nombre = scanner.next();
		System.out.println("Ingresar apellido:");
		apellido = scanner.next();
		for(Jugador c: j) {
			if(c.getNombre().equals(nombre) && c.getApellido().equals(apellido)) { 
				String salir;
				do {
					int e =0;
					do {
						System.out.println("----> MODIFICAR DATOS DE "+c.getApellido()+" "+c.getNombre());
						System.out.println("1) Fecha de nacimiento \n2)Nacionalidad \n3)Estatura \n4)Peso \n5)Posicion");
						System.out.println("Ingrese una opcion:");
						e = scanner.nextInt();
						
					}while(e<1 || e>8);
					switch(e) {
						case 1:
							String nac_string;
							LocalDate fecha_nac;
							do {
								try {
									System.out.println("Ingrese la fecha de nacimiento: (yyy-mm-dd)");
									nac_string = scanner.next();
									fecha_nac = LocalDate.parse(nac_string);
								}catch (Exception ex){
									nac_string = "";
									fecha_nac = LocalDate.now();
									scanner.nextLine();
								}
							}while(fecha_nac.isEqual(LocalDate.now()) );
							c.setFecha_nac(fecha_nac);
							break;
							
						case 2:
							System.out.println("Ingrese la nacionalidad:");
							String nacionalidad = scanner.next();
							c.setNacionalidad(nacionalidad);
							break;
							
						case 3:
							float estatura;
							do {
								try {
									System.out.println("Ingrese la estatura en cm:");
									estatura = scanner.nextFloat();
								}catch(Exception ex) {
									estatura = (float)0.0;
									scanner.nextLine();
								}
							}while(estatura == 0.0 || estatura < (float)100);
							c.setAltura(estatura);
							break;
						
						case 4:
							float peso;
							do {
								try {
									System.out.println("Ingrese el peso en kg:");
									peso = scanner.nextFloat();
								}catch(Exception ex) {
									peso = (float)0.0;
									scanner.nextLine();
								}
							}while(peso == 0.0 || peso < (float)30);
							c.setPeso(peso);
							break;
							
						case 5:
							String [] posicion = {"delantero", "medio", "defensa", "arquero"};
							do {
								System.out.println("Ingresar la posicion:");
								System.out.println("1.Delantero \n2.Medio \n3.Defensa \n4.Arquero");
								n = scanner.nextInt();
							}while(n<1 || n>4);
							c.setPosicion(posicion[n]);
							break;
					}
					System.out.println("Desea modificar otro campo del mismo jugador? si/no");
					salir = scanner.next();
				}while(salir == "si");
				
			}
			
		}
		return j;
	}

	public static List<Jugador> eliminarJugador(List<Jugador>  j){
		Scanner scanner = new Scanner(System.in);
		String nombre, apellido;
		System.out.println("Ingresar nombre:");
		nombre = scanner.next();
		System.out.println("Ingresar apellido:");
		apellido = scanner.next();
		Iterator iterator = j.iterator();
		while(iterator.hasNext()) {
			Jugador c = (Jugador)iterator.next();
			if(c.getNombre().equals(nombre) && c.getApellido().equals(apellido)) { 
				j.remove(c);
			}
		}
		return j;
	}

	public static void mostrarSegunNacionalidad(List<Jugador>  j){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la nacionalidad:");
		String nac = scanner.next();
		for(Jugador c: j) {
			if(c.getNacionalidad().equals(nac)) {
				System.out.println(c);
			}
		}
	}
}
