package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	
	private String nombre;
	private int legajo;
	private float salario;
	private final float SALARIO_MINIMO = (float) 210000.0;
	private final float AUMENTO_MERITO = (float) 20000.0;
	
	public Empleado(String nombre, int legajo, float salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario >= this.SALARIO_MINIMO) {
			this.salario = salario;
		}else{
			this.salario = this.SALARIO_MINIMO;
		}
	}

	@Override
	public String toString() {
		return "Empleado\nNombre del empleado: " + nombre + "\nlegajo: " + legajo + "\nsalario: " + salario;
	}
	
	public void aumento() {
		this.salario = this.salario + this.AUMENTO_MERITO;
		System.out.println("Aumento exitoso, nuevo salario:"+this.salario+"\n");
	}
	
	
	
	

}
