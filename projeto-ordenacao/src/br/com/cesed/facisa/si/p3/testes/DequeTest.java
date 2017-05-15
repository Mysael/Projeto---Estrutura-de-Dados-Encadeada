package br.com.cesed.facisa.si.p3.testes;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import br.com.cesed.facisa.si.p3.classes.DequeSequencial;

public class DequeTest {
	
	
	@Test
	public void adicionaNoComeco(){
		DequeSequencial dequeTeste = new DequeSequencial();
		dequeTeste.adicionaNoComeco("Eu", 20,"12345678900");
		dequeTeste.adicionaNoComeco("Tu", 40,"24681012140");
		dequeTeste.adicionaNoComeco("Nos", 80,"98765432100");
		dequeTeste.adicionaNoComeco("Eles", 120,"36985214700");
		Assert.assertTrue(dequeTeste.getInicial().getNome() == "Eles");
	}
	
	@Test
	public void adicionaNoFinal(){
		DequeSequencial dequeTeste = new DequeSequencial();
		dequeTeste.adicionaNoFinal("Eu", 20,"12345678900");
		dequeTeste.adicionaNoFinal("Tu", 40,"24681012140");
		dequeTeste.adicionaNoFinal("Nos", 80,"98765432100");
		Assert.assertTrue(dequeTeste.getInicial().getPessoa().getPessoa().getNome() == "Nos");
	}
	
	@Test
	public void removeNoComeco(){
		DequeSequencial dequeTeste = new DequeSequencial();
		dequeTeste.adicionaNoComeco("Eu", 20,"12345678900");
		dequeTeste.adicionaNoFinal("Tu", 40,"24681012140");
		dequeTeste.adicionaNoFinal("Nos", 80,"98765432100");
		dequeTeste.removeNoComeco();
		dequeTeste.removeNoComeco();
		Assert.assertTrue(dequeTeste.getInicial().getNome() == "Nos");
		
	}
	
	@Test
	public void removeNoFinal(){
		DequeSequencial dequeTeste = new DequeSequencial();
		dequeTeste.adicionaNoComeco("Juneron", 20,"12345678900");
		dequeTeste.adicionaNoFinal("Ellen", 40,"24681012140");
		dequeTeste.adicionaNoFinal("Kongzilla", 80,"98765432100");
		dequeTeste.removeNoFinal();
		Assert.assertTrue(dequeTeste.getInicial().getPessoa().getPessoa()== null);
		
	}
	
	
	
	
	
	
	

}
