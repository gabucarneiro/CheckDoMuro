package entities;

public class Muro extends Bloco{
	private double alturaMuro;
	protected Bloco bloco;
	protected Terreno terreno;
	
	public Muro() {
		super();
	}

	public Muro(double alturaMuro, Bloco bloco, Terreno terreno) {
		super(bloco.getNome(), bloco.getBase(), bloco.getAltura(), bloco.getLargura(), bloco.getValor());
		this.alturaMuro = alturaMuro;
		this.bloco = bloco;
		this.terreno = terreno;
	}
	
	public Muro(Bloco bloco, Terreno terreno) {
		this.bloco = bloco;
		this.terreno = terreno;
	}

	public double getAlturaMuro() {
		return alturaMuro;
	}

	public void setAlturaMuro(double altura) {
		this.alturaMuro = altura;
	}
	
	public int quantidadeBlocosPorLinha () {
		double qntFrente = Math.ceil(terreno.getFrente() / bloco.getLargura());
		//System.out.println(qntFrente);
		double qntEsquerdo = Math.ceil(terreno.getLadoEsquerdo() / bloco.getLargura());
		//System.out.println(qntEsquerdo);
		double qntFundo = Math.ceil(terreno.getFundo() / bloco.getLargura());
		//System.out.println(qntFundo);
		double qntDireito = Math.ceil(terreno.getLadoDireito() / bloco.getLargura());
		//System.out.println(qntDireito);
		return (int) (Math.round(qntFrente + qntEsquerdo + qntFundo + qntDireito));
	}
	
	public int quantidadeBlocosAltura (double altura) {
		double getQuantidadeDeLinhasDeBloco = Math.ceil(altura / bloco.getAltura()); 
		
		return (int) Math.ceil(quantidadeBlocosPorLinha() * getQuantidadeDeLinhasDeBloco);
	}
}
