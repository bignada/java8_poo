package com.ychar.practica_poo.Objetos;

public class Revolver {
	private boolean [] balas = new boolean[6];
	private boolean isCargada = false;
	
	public boolean [] getBalas() {
		return balas;
	}
	public void setBalas(boolean [] balas) {
		this.balas = balas;
	}
	public boolean isCargada() {
		return isCargada;
	}
	public void setCargada(boolean isCargada) {
		this.isCargada = isCargada;
	}
	
	
	public String toString() {
		return "Este es un objeto de tipo Revolver";
	}
}
