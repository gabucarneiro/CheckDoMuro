package program;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeNotNull;

import org.junit.Test;

import entities.Bloco;
import entities.Muro;
import entities.Terreno;

public class MuroTest {

	Terreno terreno = new Terreno();
	Bloco bloco = new Bloco();

	@Test
	public void test() {
		assumeNotNull(terreno);
		assumeNotNull(bloco);
		Muro muro = new Muro(2, bloco, terreno);
		assertNotNull(muro);
	}

}
