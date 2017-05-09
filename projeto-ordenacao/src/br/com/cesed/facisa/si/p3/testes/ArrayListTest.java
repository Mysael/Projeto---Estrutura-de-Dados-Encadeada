package br.com.cesed.facisa.si.p3.testes;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;

import br.com.cesed.facisa.si.p3.classes.ArrayListSequencial;
import br.com.cesed.facisa.si.p3.classes.Pessoa;

import org.junit.Assert;


public class ArrayListTest {
	
	@Ignore
	@Test
	public void add(){
		ArrayListSequencial arrayTeste = new ArrayListSequencial();
		arrayTeste.add("Maicão", 12, "12345678900");
		arrayTeste.add("george", 30, "98765432100");
		Assert.assertTrue(arrayTeste.getInicial().getCpf() == "12345678900");
	}
	
	@Ignore
	@Test
	public void remove(){
		ArrayListSequencial arrayTeste = new ArrayListSequencial();
		arrayTeste.add("Maicão", 12, "12345678900");
		arrayTeste.add("george", 30, "98765432100");
		arrayTeste.add("eu", 20, "12147065670");
		arrayTeste.remove("12345678900");
		arrayTeste.remove("98765432100");
		Assert.assertTrue(arrayTeste.getInicial().getCpf() == "12147065670");
	}
	
	@Ignore
	@Test
	public void getByIndex(){
		ArrayListSequencial arrayTeste = new ArrayListSequencial();
		arrayTeste.add("Maicão", 12, "12345678900");//0
		arrayTeste.add("george", 30, "98765432100");//1
		arrayTeste.add("eu", 20, "12147065670");//2
		arrayTeste.add("tu", 50, "20147369850");//3
		Assert.assertEquals("eu", arrayTeste.getByIndex(2).getNome());
	}
	
	@Test
	public void findPosition(){
		ArrayListSequencial arrayTeste = new ArrayListSequencial();
		arrayTeste.add("Maicão", 12, "12345678900");//0
		arrayTeste.add("george", 30, "98765432100");//1
		arrayTeste.add("eu", 20, "12147065670");//2
		arrayTeste.add("tu", 50, "20147369850");//3
		Pessoa people = new Pessoa ("eu", 20, "12147065670");
		Assert.assertEquals(arrayTeste.findPosition(people).intValue(), 2);
	}
	
	/*
	
	Não coloquei test do printAllEments, pois como é apenas um método de impressão, não tenho conhecimento 
	de como fazer teste nele com o assert...
	*/
	
	
	
	
	
}
