package program;

import java.util.ArrayList;
import java.util.List;

import entities.Bloco;
import entities.Muro;
import entities.Terreno;
import operations.ConstruirMuro;

public class ProgramConstruirMuro {

	public static void main(String[] args) {
		List<ConstruirMuro> listCMuro = new ArrayList<>();
		Bloco bloco = new Bloco();
		Terreno terreno = new Terreno();
		ConstruirMuro cm;
		
		double alturaDoMuro = 2.5;
		
		terreno.setFrente(16);
		terreno.setLadoEsquerdo(25);
		terreno.setFundo(16);
		terreno.setLadoDireito(25);
		System.out.println(terreno.toString());

		System.out.println();
		String nomeBloco = "Bloco baiano cerâmico 9 furos";
		System.out.println(" ----- " + nomeBloco + " ----- ");
		System.out.println();
		
		double valorBloco = 1.14;
		bloco = new Bloco(nomeBloco, 0.115, 0.14, 0.24, valorBloco);
		System.out.println(bloco.toString());
		System.out.println();
		
		Muro muro = new Muro(alturaDoMuro, bloco, terreno);

		cm = new ConstruirMuro(muro, muro.getValor(), alturaDoMuro);
		listCMuro.add(cm);
		System.out.println("-------------------");
		System.out.println(cm.toString());
		//cm.descricaoConstruirMuro(cm);
		System.out.println("-------------------");
		
		System.out.println();
		nomeBloco = "Bloco de Concreto";
		System.out.println(" ----- " + nomeBloco + " ----- ");
		System.out.println();
		
		valorBloco = 2;
		bloco = new Bloco(nomeBloco, 0.14, 0.19, 0.39, valorBloco);
		System.out.println(bloco.toString());
		System.out.println();

		muro = new Muro(alturaDoMuro, bloco, terreno);

		cm = new ConstruirMuro(muro, bloco.getValor(), alturaDoMuro);
		listCMuro.add(cm);
	
		
		System.out.println();
		nomeBloco = "Bloco cerâmico vedação";
		System.out.println(" ----- " + nomeBloco + " ----- ");
		System.out.println();
		
		valorBloco = 1.4;
		bloco = new Bloco(nomeBloco, 0.09, 0.19, 0.29, valorBloco);
		System.out.println(bloco.toString());
		System.out.println();
		
		muro = new Muro(alturaDoMuro, bloco, terreno);

		cm = new ConstruirMuro(muro, bloco.getValor(), alturaDoMuro);
		listCMuro.add(cm);
		
		System.out.println();
		//https://www.leroymerlin.com.br/bloco-de-concreto-vedacao-14x19x39cm-jcrb_89731754?region=grande_sao_paulo&gclid=EAIaIQobChMI8O_t6si29QIVDYiRCh1ehAtoEAYYBiABEgIAwvD_BwE
		nomeBloco = "Bloco de Concreto Vedação 14x19x39cm JCRB";
		System.out.println(" ----- " + nomeBloco + " ----- ");
		System.out.println();
		
		valorBloco = 3.59;
		bloco = new Bloco(nomeBloco, 0.14, 0.19, 0.39, valorBloco);
		System.out.println(bloco.toString());
		System.out.println();
		
		muro = new Muro(alturaDoMuro, bloco, terreno);

		cm = new ConstruirMuro(muro, bloco.getValor(), alturaDoMuro);
		listCMuro.add(cm);
		
		
		System.out.println();
		//https://www.leroymerlin.com.br/bloco-de-concreto-vedacao-vazado-9x19x39cm-jcrb_89249412?region=grande_sao_paulo&gclid=EAIaIQobChMI8O_t6si29QIVDYiRCh1ehAtoEAYYBCABEgLDYvD_BwE
		nomeBloco = "Bloco de Concreto Vedação Vazado 9x19x39cm JCRB";
		System.out.println(" ----- " + nomeBloco + " ----- ");
		System.out.println();
		
		valorBloco = 2.69;
		bloco = new Bloco(nomeBloco, 0.09, 0.19, 0.39, valorBloco);
		System.out.println(bloco.toString());
		System.out.println();
		
		muro = new Muro(alturaDoMuro, bloco, terreno);

		cm = new ConstruirMuro(muro, bloco.getValor(), alturaDoMuro);
		listCMuro.add(cm);
		
		System.out.println();
		System.out.println(" ---- LISTAR ----");
		System.out.println();
		
		for(ConstruirMuro cmuro : listCMuro) {
			System.out.println(cmuro.getNome() + " - " + cmuro.getValorMuro());
		}
		
	}

}
