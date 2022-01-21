package program;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Bloco;

public class BlocoTest {

	@Test
	public void test() {
		Bloco bloco = new Bloco(0.115, 0.14, 0.24);
		assertNotNull(bloco);
	}

}
