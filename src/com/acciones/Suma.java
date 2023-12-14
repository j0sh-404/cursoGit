package com.acciones;

public class Suma {
	
	private int numeroA;
	
	private int numeroB;
	
	private int muneroC;
	
	

	public Suma(int numeroA, int numeroB) {
		super();
		this.numeroA = numeroA;
		this.numeroB = numeroB;
	}
	
	
	

	public Suma(int numeroA, int numeroB, int muneroC) {
		super();
		this.numeroA = numeroA;
		this.numeroB = numeroB;
		this.muneroC = muneroC;
	}




	   
	public int sumar() {
      return this.numeroA + this.numeroB;
	}
	
	
	public int sumarTresNumeros() {
		return this.numeroA+this.numeroB+ this.muneroC;
	}
	

}
