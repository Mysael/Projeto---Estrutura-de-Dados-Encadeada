package br.com.cesed.facisa.si.p3.classes;
/**
 * implementando funcionamento de Deque
 * @author Mysael
 */
public class DequeSequencial {
	private Pessoa inicial = null;
	
	public DequeSequencial(){
		this.inicial = null;
	}

	public Pessoa getInicial() {
		return inicial;
	}

	public void setInicial(Pessoa inicial) {
		this.inicial = inicial;
	}
	
	/**
	 * Esse metodo adiciona uma pessoa no comeco do deque
	 * 
	 * @param nome nome para ser adicionado no começo do deque
	 * @param idade idade para ser adicionado no começo do deque
	 * @param cpf cpf para ser adicionado no começo do deque
	 */
	public void adicionaNoComeco(String nome, int idade, String cpf){
		Pessoa p = new Pessoa(nome, idade, cpf);
		if(this.getInicial() == null){
			this.inicial = p;
		}else{
			Pessoa anterior = this.inicial;
			this.inicial = p;
			inicial.setPessoa(anterior);
		}
	}
	/**
	 * Esse metodo adiciona uma pessoa no final do deque
	 * @param nome nome para ser adicionado no final do deque
	 * @param idade idade para ser adicionado no final do deque
	 * @param cpf cpf para ser adicionado no final do deque
	 */
	public void adicionaNoFinal(String nome, int idade, String cpf){
		Pessoa p = new Pessoa (nome, idade, cpf);
		if(this.inicial == null){
			this.inicial = p;
		}else{
			Pessoa anterior = this.inicial;
			while(anterior.getPessoa() != null){
				anterior = anterior.getPessoa();
			}anterior.setPessoa(p);
		}
		
	}
	
	/**
	 * Esse metodo remove uma pessoa que está no começo do deque
	 */
	public void removeNoComeco(){
		Pessoa nova = this.inicial.getPessoa();
		this.inicial = null;
		this.inicial = nova;
	}
	
	/**
	 * Esse metodo remove uma pessoa que está no final do deque
	 */
	public void removeNoFinal(){
		if(this.inicial == null){
		}
		if(this.inicial.getPessoa() == null){
			this.inicial = null;
		}else{
			Pessoa anterior = null;
			Pessoa proxima = this.inicial;
			while(proxima.getPessoa() != null){
				anterior = proxima;
				proxima = proxima.getPessoa();
			}anterior.setPessoa(null);
		}
		
	}
	
}
