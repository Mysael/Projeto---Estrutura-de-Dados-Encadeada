package br.com.cesed.facisa.si.p3.testes;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import br.com.cesed.facisa.si.p3.classes.FilaSequencial;


public class FilaTest {
	

	@Test
	public void insere(){
		FilaSequencial filaTeste = new FilaSequencial();
		filaTeste.insere("João", 23, "12345678900");
		filaTeste.insere("Maria", 20, "00987654321");
		Assert.assertEquals(filaTeste.getInicial().getNome(), "João");
	}
	

	@Test
	public void remove(){
		FilaSequencial filaTeste = new FilaSequencial();
		filaTeste.insere("João Pedro", 23, "12345678900");
		filaTeste.insere("Maria", 20, "00987654321");
		filaTeste.insere("Ronaldo", 30, "00321654987");
		filaTeste.remove();
		Assert.assertTrue(filaTeste.getInicial().getNome() == "Maria");
	}

}