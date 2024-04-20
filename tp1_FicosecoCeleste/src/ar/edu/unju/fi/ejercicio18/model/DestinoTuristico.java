package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	private String codigo;
	private String nombre;
	private float precio;
	private Pais pais;
	private int cDias;
	
	public DestinoTuristico() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DestinoTuristico(String codigo, String nombre, float precio, Pais pais, int cDias) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.cDias = cDias;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getcDias() {
		return cDias;
	}
	public void setcDias(int cDias) {
		this.cDias = cDias;
	}
	@Override
	public String toString() { //MODIFICAR
		return "--> DestinoTuristico \nCodigo=" + codigo + "\nNombre=" + nombre + "\nPrecio=" + precio + "\nPais=" + pais.getNombre()
				+ "\nCantidad de dias=" + cDias + "\n";
	}
	
	
}
