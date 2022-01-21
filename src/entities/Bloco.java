package entities;

import interfaces.Blocos;

public class Bloco implements Blocos{
	
	private String nome;
	private double base;
	private double altura;
	private double largura;
	private Double valor;
		
	public Bloco() {
	}
	
	public Bloco(double base, double altura, double largura) {
		this.base = base;
		this.altura = altura;
		this.largura = largura;
	}
	
	public Bloco(String nome, double base, double altura, double largura) {
		this.nome = nome;
		this.base = base;
		this.altura = altura;
		this.largura = largura;
	}
	
	public Bloco(String nome, double base, double altura, double largura, Double valor) {
		this.nome = nome;
		this.base = base;
		this.altura = altura;
		this.largura = largura;
		this.valor = valor;
	}

	
	@Override
	public void setBase(double base) {
		this.base = base;		
	}

	@Override
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public void setLargura(double largura) {
		this.largura = largura;		
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public double getLargura() {
		return largura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		String retornar;
		if (this.valor != null) {
			retornar = "Bloco >>> Nome: " + nome + "\nBase: " + base + ", Altura: " + altura + ", Largura: " + largura + ", Valor: R$" + valor; 
		}
		else {
			retornar = "Bloco >>> Base: " + base + ", Altura: " + altura + ", Largura: " + largura;
		}
		return retornar;
	}

	
}
