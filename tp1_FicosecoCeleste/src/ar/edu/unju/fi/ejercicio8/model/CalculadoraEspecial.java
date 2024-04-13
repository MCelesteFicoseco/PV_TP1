package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;

	public CalculadoraEspecial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public float calcularSumatoria() {
		float resultado = 0;
		for (int i=1; i<=this.n; i++) {
			resultado = (float) (resultado+ Math.pow(((i*(i+1)))/2,2));
		}
		return resultado;
	}
	
	public float calcularProductoria() {
		float resultado = 1;
		for (int i=1; i<=this.n; i++) {
			resultado = (float) (resultado * i*(i+4));
		}
		return resultado;
	}
	
}
