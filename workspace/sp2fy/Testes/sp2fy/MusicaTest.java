package sp2fy;

import static org.junit.Assert.*;

import org.junit.Test;

public class MusicaTest {

	@Test(expected=Exception.class)
	public void testTituloNull() throws Exception {
		Musica mus = new Musica (null, 3, "joao");
	}
	
	@Test(expected=Exception.class)
	public void testTituloVazio() throws Exception {
		Musica mus = new Musica ("", 3, "joao");
	}
	
	@Test(expected=Exception.class)
	public void testDuracaoNegativa() throws Exception {
		Musica mus = new Musica ("musica", -1, "joao");
	}
	
	@Test(expected=Exception.class)
	public void testDuracaoZero() throws Exception {
		Musica mus = new Musica ("musica", 0, "joao");
	}
}
