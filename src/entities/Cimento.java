package entities;

public class Cimento {
	/*Os cálculos de cimento não possuem medidas exatas, por tanto,
	 * procurei colocar o menor valor encontrado.
	 * Segundo o vídeo no link abaixo, é possível colocar de 100 à 150 blocos
	 * de cerâmica por saco de cimento - logo, assumi que 100 blocos de cerâmica
	 * serão colocados - Blocos: 9x14x29 - Ele estima 24 blocos por metro quadrado
	 * https://www.youtube.com/watch?v=iY0VfMqKfuE
	 * 
	 * Valor estimado: R$30,00
	 * https://www.leroymerlin.com.br/cimento-cp-ii-f-32-todas-as-obras-50kg-votoran_89368944
	 * */
	private final double valorPorSaco = 30.0;
	
	public double qntSacosDeCimento(int quantidadeBlocosPorLinha) {
		//retorna a quantidade de sacos de 50kg de cimento para cada 100 blocos
		//Blocos: 9x14x29
		return quantidadeBlocosPorLinha / 100;
	}
	
	public double valorSacosDeCimento(double qntSacosDeCimento) {
		return qntSacosDeCimento * valorPorSaco;
	}
}
