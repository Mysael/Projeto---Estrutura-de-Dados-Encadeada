package br.com.cesed.facisa.si.p3.testes;



import org.junit.Assert;
import org.junit.Test;

import br.com.cesed.facisa.si.p3.classes.Pessoa;


public class PessoaTest {
	
	@Test
	public void testValidaCPF(){
		Pessoa p = new Pessoa("eu", 20, "12547896300");
		Assert.assertTrue(p.validaCPF("12345678910"));
	}
	
	
	@Test
	public void testFormataCPF(){
		Pessoa p = new Pessoa("tu", 50, "54631297800");
		String cpf = "12345678900";
		Assert.assertEquals("123.456.789-00", p.formataCPF(cpf));
	}

}
