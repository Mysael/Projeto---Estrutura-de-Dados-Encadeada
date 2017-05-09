package br.com.cesed.facisa.si.p3.testes;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;

import br.com.cesed.facisa.si.p3.classes.ArrayListSequencial;
import br.com.cesed.facisa.si.p3.classes.DeckSequencial;
import br.com.cesed.facisa.si.p3.classes.Pessoa;
public class DeckTest {

	
	
	@Test
	public void push(){
		DeckSequencial deckTeste = new DeckSequencial();
		deckTeste.push("Maicão", 12, "12345678900");
		deckTeste.push("george", 30, "98765432100");
		Assert.assertTrue(deckTeste.getInicial().getCpf() == "12345678900");
	}
	
	@Test
	public void pop(){
		DeckSequencial deckTeste = new DeckSequencial();
		deckTeste.push("Maicão", 12, "12345678900");
		deckTeste.push("george", 30, "98765432100");
		deckTeste.push("eu", 20, "12147065670");
		deckTeste.pop();
		Assert.assertTrue(deckTeste.getInicial().getNome() == null);
	}
	
	/*
	 * push adiciona
	 * pop remove
	 * top vê quem foi adicionado por ultimo
	 */
}
