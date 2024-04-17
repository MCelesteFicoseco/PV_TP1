package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fecha_nacimiento ;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, Calendar fecha_nacimiento) {
		super();
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	

	@Override
	public String toString() {
		return "Nombre:" + nombre + "\nFecha de nacimiento: " + fecha_nacimiento.getTime() + 
				"\nEdad: "+this.edad()+"\nSigno del zodíaco: "+this.signoZodiaco()+
				"\nEstacion del año: "+this.estacion();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Calendar fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public int edad() {
		Calendar hoy = Calendar.getInstance();
		int anio =  hoy.get(Calendar.YEAR);
		
		return hoy.get(Calendar.YEAR) - (int) this.fecha_nacimiento.get(Calendar.YEAR);
	}
	
	public String signoZodiaco() {
		String signo = null ;
			
		switch(this.fecha_nacimiento.get(Calendar.MONTH)+1) {
			case 1:
				 if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<= 19) {
					 signo = "Capricornio";
				 }else {
					 signo = "Acuario";
				 }
				 break;
			case 2:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<= 18) {
					 signo = "Acuario";
				 }else {
					 signo = "Piscis";
				 }
				 break;
			case 3:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<= 20) {
					 signo = "Piscis";
				 }else {
					 signo = "Aries";
				 }
				 break;
			case 4:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<= 19) {
					 signo = "Aries";
				 }else {
					 signo = "Tauro";
				 }
				 break;
			case 5:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<= 20) {
					 signo = "Tauro";
				 }else {
					 signo = "Géminis";
				 }
				 break;
			case 6:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<= 20) {
					 signo = "Géminis";
				 }else {
					 signo = "Cáncer";
				 }
				 break;
			case 7:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<= 22) {
					 signo = "Cáncer";
				 }else {
					 signo = "Leo";
				 }
				 break;
			case 8:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<= 22) {
					 signo = "Leo";
				 }else {
					 signo = "Virgo";
				 }
				 break;
			case 9:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<= 22) {
					 signo = "Virgo";
				 }else {
					 signo = "Libra";
				 }
				 break;
			case 10:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<= 22) {
					 signo = "Libra";
				 }else {
					 signo = "Escorpio";
				 }
				 break;
			case 11:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<= 21) {
					 signo = "Escorpio";
				 }else {
					 signo = "Sagitario";
				 }
				 break;
			case 12:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<= 21) {
					 signo = "Sagitario";
				 }else {
					 signo = "Capricornio";
				 }
				 break;
		}
		return signo;
			
	}
	
	public String estacion() {
		String estacion = "";
		int mes = this.fecha_nacimiento.get(Calendar.MONTH); 
		if( mes == 1 || mes ==2) {
			estacion  = "Verano";
		}else {
			if(mes == 3 && this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<21) {
				estacion = "Verano";
			}else {
				
				
			}
		}
		
		switch(mes) {
			case 1,2:
				estacion = "Verano";
				break;
			case 3:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<21) {
					estacion = "Verano";
				}else {
					estacion = "Otoño";
				}
				break;
			case 4, 5:
				estacion = "Otoño";
				break;
			case 6:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<21) {
					estacion = "Otoño";
				}else {
					estacion = "Invierno";
				}
				break;
			case 7,8:
				estacion = "Invierno";
				break;
			case 9:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<21) {
					estacion = "Invierno";
				}else {
					estacion = "Primavera";
				}
				break;
			case 10, 11:
				estacion = "Primavera";
				break;
			case 12:
				if(this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH)<21) {
					estacion = "Primavera";
				}else {
					estacion = "Verano";
				}
				break;
		}
		return estacion;
		
	}
	
}
