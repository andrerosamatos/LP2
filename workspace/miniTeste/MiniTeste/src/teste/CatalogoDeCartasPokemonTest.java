package teste;

import main.CartaPokemon;
import main.CatalogoDeCartasPokemon;

import org.junit.Assert;
import org.junit.Test;

public class CatalogoDeCartasPokemonTest {

	@Test
	public void testPegarCarta() {
		
		CatalogoDeCartasPokemon CDCP = new CatalogoDeCartasPokemon();
		
		CartaPokemon carta1 = new CartaPokemon("Decomon");
		CartaPokemon carta2 = new CartaPokemon("Paulomon");
		CartaPokemon carta3 = new CartaPokemon("Edimon");
		CartaPokemon carta4 = new CartaPokemon("Amimon");
		
		CDCP.adicionarCarta(carta1);
		CDCP.adicionarCarta(carta2);
		CDCP.adicionarCarta(carta3);		
		CDCP.adicionarCarta(carta4);
		CDCP.adicionarCarta(carta2);


		Assert.assertEquals("Decomon", CDCP.pegarCarta(0));
		Assert.assertEquals("Paulomon", CDCP.pegarCarta(1));
		Assert.assertEquals("Paulomon", CDCP.pegarCarta(4));
		
		
		
	}

}
