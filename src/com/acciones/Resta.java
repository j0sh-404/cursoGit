package com.acciones;

public class Resta {
	
	private int numeroA;
	
	private int numeroB;
	
	

	public Resta(int numeroA, int numeroB) {
		super();
		this.numeroA = numeroA;
		this.numeroB = numeroB;
	}

	public int getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(int numeroA) {
		this.numeroA = numeroA;
	}

	public int getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(int numeroB) {
		this.numeroB = numeroB;
	}
	
	public int restar() {
		return this.numeroA + this.numeroB;
	}
	
	

}
