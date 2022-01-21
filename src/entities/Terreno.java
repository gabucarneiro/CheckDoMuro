package entities;

import interfaces.Terrenos;

public class Terreno implements Terrenos{
	
	private double frente;
	private double ladoEsquerdo;
	private double fundo;
	private double ladoDireito;
	
	public Terreno() {
	}


	@Override
	public void setFrente(double frente) {
		this.frente = frente;
	}

	@Override
	public void setLadoEsquerdo(double ladoEsquerdo) {
		this.ladoEsquerdo = ladoEsquerdo;
	}

	@Override
	public void setFundo(double fundo) {
		this.fundo = fundo;
	}

	@Override
	public void setLadoDireito(double ladoDireito) {
		this.ladoDireito = ladoDireito;
	}
	

	public double getFrente() {
		return frente;
	}

	public double getLadoEsquerdo() {
		return ladoEsquerdo;
	}

	public double getFundo() {
		return fundo;
	}

	public double getLadoDireito() {
		return ladoDireito;
	}

	@Override
	public String toString() {
		return "Terreno >>> Frente: " + frente + ", Lado Esquerdo: " + ladoEsquerdo + ", Fundo: " + fundo + ", Lado Direito:"
				+ ladoDireito;
	}	
}
