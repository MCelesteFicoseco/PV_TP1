package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private float precio;
	private float area;
	private boolean ingredientesEspeciales;
	private final float ADICIONAL_20 = (float) 500;
	private final float ADICIONAL_30 = (float) 750;
	private final float ADICIONAL_40 = (float) 1000;
	
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	
	public void calcularPrecio() {
		
		if(this.diametro == 20) {
			if(this.ingredientesEspeciales == false) {
				this.precio = (float)4500;
			}else {
				this.precio = (float)4500 + this.ADICIONAL_20;
			}
		}else {
			if(this.diametro == 30) {
				if(this.ingredientesEspeciales == false) {
					this.precio = (float)4800;
				}else {
					this.precio = (float)4800 + this.ADICIONAL_30;
				}
			}else {
				if(this.ingredientesEspeciales == false) {
					this.precio = (float)5500;
				}else {
					this.precio = (float)5500 + this.ADICIONAL_40;
				}
			}
		}
		
	}
	
	public void calcularArea() {
		this.area = (float) (Math.PI * Math.pow(this.diametro/2, 2));
	}

	@Override
	public String toString() {
		return "---> Pizza \nDiametro=" + diametro + "\nIngredientesEspeciales="+ ingredientesEspeciales+
				"\nPrecio pizza = "+precio+"\nArea de pizza = "+area;
	}
	
	
}
