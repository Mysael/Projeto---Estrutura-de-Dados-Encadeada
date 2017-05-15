package br.com.cesed.facisa.si.p3.testes;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;

import br.com.cesed.facisa.si.p3.classes.ArrayListSequencial;
import br.com.cesed.facisa.si.p3.classes.PilhaSequencial;
import br.com.cesed.facisa.si.p3.classes.Pessoa;
public class PilhaTest {

	//@Ignore
	@Test
	public void push(){
		PilhaSequencial pilhaTeste = new PilhaSequencial();
		pilhaTeste.push("Maicão", 12, "12345678900");
		pilhaTeste.push("george", 30, "98765432100");
		Assert.assertTrue(pilhaTeste.getInicial().getPessoa().getCpf() == "98765432100");
	}
	
	@Test
	public void pop(){
		PilhaSequencial pilhaTeste = new PilhaSequencial();
		pilhaTeste.push("Maicão", 12, "12345678900");
		pilhaTeste.push("george", 30, "98765432100");
		pilhaTeste.push("eu", 20, "12147065670");
		pilhaTeste.pop();
		Assert.assertTrue(pilhaTeste.getInicial().getPessoa().getNome() == "george");
	}
	
	//@Ignore
	@Test
	public void top(){
		PilhaSequencial pilhaTeste = new PilhaSequencial();
		pilhaTeste.push("Maicão", 12, "12345678900");
		pilhaTeste.push("george", 30, "98765432100");
		pilhaTeste.push("eu", 20, "12147065670");
		pilhaTeste.push("tu", 45, "36521498700");
		Assert.assertEquals(pilhaTeste.top().getCpf(), "36521498700");
	}
	
	/*
	 * push adiciona
	 * pop remove
	 * top vê quem foi adicionado por ultimo
	 */
}
