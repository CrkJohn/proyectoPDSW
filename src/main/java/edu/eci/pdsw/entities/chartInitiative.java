package edu.eci.pdsw.entities;

public class chartInitiative {

	private int cantidad;
	private String area;
	
	public chartInitiative() {}
	
	public chartInitiative(int cantidad, String area) {
		this.cantidad = cantidad;
		this.area = area;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public String toString() {
		return "[Area: "+area+", Cantidad: "+cantidad+"]";
	}
}
