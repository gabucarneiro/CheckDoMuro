package operations;

import entities.Muro;

public class ConstruirMuro extends Muro{
	Muro muro;
	private double valorLinha;
	private double valorMuro;
	private double alturaDoMuro;
	
	
	public ConstruirMuro() {
	}

	public ConstruirMuro(Muro muro, double valorBloco, double alturaDoMuro) {
		super();
		this.valorLinha = ((muro.quantidadeBlocosPorLinha() * valorBloco));
		this.valorMuro = ((muro.quantidadeBlocosAltura(alturaDoMuro) * muro.getValor()));
		
		System.out.printf("Blocos por linha: %d  - R$: %.2f %n", muro.quantidadeBlocosPorLinha(), (muro.quantidadeBlocosPorLinha() * valorBloco));
		System.out.printf("Blocos totais para o muro: %d - R$: %.2f %n", muro.quantidadeBlocosAltura(alturaDoMuro), (muro.quantidadeBlocosAltura(alturaDoMuro) * valorBloco));
	}
	
	public ConstruirMuro(Muro muro, double alturaDoMuro) {
		super();
		this.valorLinha = ((muro.quantidadeBlocosPorLinha() * muro.getValor()));
		this.valorMuro = ((muro.quantidadeBlocosAltura(alturaDoMuro) * muro.getValor()));
		
		System.out.printf("Blocos por linha: %d  - R$: %.2f %n", muro.quantidadeBlocosPorLinha(), (muro.quantidadeBlocosPorLinha() * muro.getValor()));
		System.out.printf("Blocos totais para o muro: %d - R$: %.2f %n", muro.quantidadeBlocosAltura(alturaDoMuro), (muro.quantidadeBlocosAltura(alturaDoMuro) * muro.getValor()));
	}
	
	public void descricaoConstruirMuro(ConstruirMuro cm) {
		System.out.printf("Blocos por linha: %d  - R$: %.2f %n", muro.quantidadeBlocosPorLinha(), getValorLinha());
		System.out.printf("Blocos totais para o muro: %d - R$: %.2f %n", muro.quantidadeBlocosAltura(alturaDoMuro), (muro.quantidadeBlocosAltura(alturaDoMuro) * muro.getValor()));
	}

	public double getValorMuro() {
		return valorMuro;
	}
	
	public double getValorLinha() {
		return valorLinha;
	}

	@Override
	public String toString() {
		return "ConstruirMuro [muro=" + muro + ", valorLinha=" + valorLinha + ", valorMuro=" + valorMuro
				+ ", alturaDoMuro=" + alturaDoMuro + ", bloco=" + bloco + ", terreno=" + terreno + ", getValorMuro()="
				+ getValorMuro() + ", getValorLinha()=" + getValorLinha() + ", getAlturaMuro()=" + getAlturaMuro()
				+ ", getBase()=" + getBase()
				+ ", getAltura()=" + getAltura() + ", getLargura()=" + getLargura() + ", getNome()=" + getNome()
				+ ", getValor()=" + getValor() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
}
