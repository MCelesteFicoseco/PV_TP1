package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private int dni;
	private String nombre;
	private LocalDate fecha_nac;
	private String provincia;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(int dni, String nombre, LocalDate fecha_nac, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha_nac = fecha_nac;
		this.provincia = provincia;
	}
	
	public Persona(int dni, String nombre, LocalDate fecha_nac) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha_nac = fecha_nac;
		this.provincia = "Jujuy";
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int edad(LocalDate f_nac) {
		Period periodo = Period.between(f_nac,LocalDate.now());
		return periodo.getYears();
	}
	public boolean mayor_edad() {
		if (this.fecha_nac == null) {
			return true;
		}else {
			int edad = this.edad(this.getFecha_nac());
			if (edad >= 18) {
				return true;
			}else {
				return false;
			}
			
		}
		
	}

	@Override
	public String toString() { //corregir la salida
		String mayor;
		if(this.mayor_edad()==true){
			mayor = "La persona es mayor de edad.";
		}else {
			mayor = "La persona no es mayor de edad";
		}
		return "--> Datos \ndni=" + dni + ",\nnombre=" + nombre + ",\nfecha_nac=" + fecha_nac + ",\nprovincia=" + provincia
				+"\n"+mayor+"\n--------------";
	}
	
	
	
}
