package br.com.cesed.facisa.si.p3.classes;
/**
 * implementando funcionamento de Pilha
 * @author Mysael
 */
public class PilhaSequencial {
	private Pessoa inicial = null;
	
	
	public PilhaSequencial(){
		this.inicial = null;
	}
	
	public Pessoa getInicial() {
		return inicial;
	}

	public void setInicial(String nome, int idade, String cpf) {
		Pessoa p = new Pessoa (nome, idade, cpf);
		this.inicial = p;
	}

	/**
	 * Esse metodo adiciona uma pessoa na pilha (ordem primeiro que entra é o ultimo que sai, Firt in Left out)
	 * 
	 * @param nome nome que será adicionado a nova pessoa
	 * @param idade idade que será adicionado a nova pessoa
	 * @param cpf cpf que será adicionado a nova pessoa
	 */
	public void push(String nome, int idade, String cpf){
		Pessoa p = new Pessoa (nome, idade, cpf);
		 if(this.inicial == null){
			 this.inicial = p;
		 }else{
			 //Pessoa proxima = null;
			 Pessoa people = this.inicial;
			 while (people.getPessoa() != null){
				 people = people.getPessoa();
			 }people.setPessoa(p);
		 } 
	}
	
	/**
	 * Esse metodo remove a ultima pessoa que foi adicionada na pilha
	 * 
	 */
	
	public void pop(){
		if (this.getInicial().getPessoa() == null){
			this.inicial = null;
		}else{ 
			Pessoa anterior = null;
			Pessoa p = this.inicial;
			while (p != null){
				if (p.getPessoa() == null){
					anterior.setPessoa(p.getPessoa());
					p = null;
					break;
				}
				anterior = p;
				p = p.getPessoa();
			}
		}
	}
	/**
	 * Esse metodo retorna a Pessoa que foi adicionada por ultimo na pilha
	 * @return
	 */
	public Pessoa top(){
		if (this.inicial == null){
			return null;
		}
		if(this.inicial.getPessoa() == null){
			return this.inicial;
		}else{
			Pessoa anterior = null;
			Pessoa proxima = this.inicial;
			while(proxima != null){
				anterior = proxima;
				proxima = proxima.getPessoa();
			}return anterior;		
		}
	}
	
}
