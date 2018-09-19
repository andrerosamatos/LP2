package main;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import Main.Contato;

public class ContatoTest {
	private Contato contatos;

	
   @Before
    public void criaContato() throws Exception {
            contatos = new Contato("Andre", "Matos", "(83) 991333248");
    }

   // TESTES DE ENTRADA
   
	@Test(expected=NullPointerException.class)
	public void testContato() throws Exception {
		//assert
		try {
			Contato nomeVazio = new Contato("", "Rosa", "99913248");
			fail();
		} catch (Exception e) {
			assertEquals("Nome nulo ou vazio.", e.getMessage());
		}

		try {
			Contato nomeNull = new Contato(null, "Matos", "652768975");
			fail();
		} catch (Exception e) {
			assertEquals("Nome nulo ou vazio.", e.getMessage());
		}
		try {
			Contato sobrenomeVazio = new Contato("Andre", "", "762348507");
			fail();
		} catch (Exception e) {
			assertEquals("Sobrenome nulo ou vazio.", e.getMessage());
		}
		try {
			Contato sobrenomeNull = new Contato("Andre", null, "762348507");
			fail();
		} catch (Exception e) {
			assertEquals("Sobrenome nulo ou vazio.", e.getMessage());
		}
		try {
			Contato telefoneVazio = new Contato("Andre", "Matos", "");
			fail();
		} catch (Exception e) {
			assertEquals("Telefone nulo ou vazio.", e.getMessage());
		}
		try {
			Contato telefoneNull = new Contato("Andre", "Matos", null);
			fail();
		} catch (Exception e) {
			assertEquals("Telefone nulo ou vazio.", e.getMessage());
		}
	}

	@Test
	public void testToString() throws Exception {
		Contato nomeToString = new Contato("Andre" , "Matos", "652768975");
		assertEquals(nomeToString.toString(), "Andre Matos - 652768975");
	}

	@Test
	public void testGetNome() {
	assertEquals(contatos.getNome(), "Andre");
	}

	@Test
	public void testGetSobrenome() {
	assertEquals(contatos.getSobrenome(), "Matos");
	}

	@Test
	public void testGetTelefone() {
	assertEquals(contatos.getTelefone(), "(83) 991333248");
	}

}
