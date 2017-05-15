package br.com.cesed.facisa.si.p3.classes;

/**
 * implementando funcionamento de Fila
 * @author Mysael
 */
public class FilaSequencial {
	private Pessoa inicial = null;
	
	public FilaSequencial(){
		this.inicial = inicial;
	}
	/**
	 * 
	 * @return reotna a pessoa que está no inicio da fila
	 */
	public Pessoa getInicial(){
		return inicial;
	}
	
	/**
	 * método que adiciona uma pessoa na primeira posição da fila
	 * @param nome
	 * @param idade
	 * @param cpf
	 */
	public void setInicial(String nome, int idade, String cpf) {
		Pessoa p = new Pessoa (nome, idade, cpf);
		this.inicial = p;
	}
	
	/**
	 * insere uma nova pessoa na fila
	 * @param nome nome que será adicionado a nova pessoa
	 * @param idade idade que será adicionado a nova pessoa
	 * @param cpf cpf que será adicionado a nova pessoa
	 */
	public void insere(String nome, int idade, String cpf){
		Pessoa p = new Pessoa (nome, idade, cpf);
		if (this.inicial == null){
			this.inicial = p;
		}
		else{
			Pessoa proxima = this.inicial;
			while(proxima.getPessoa() != null){
				proxima = proxima.getPessoa();
			}proxima.setPessoa(p);
		}
	}
	/**
	 * remove pessoa que está no começo da fila
	 */
	public void remove(){
		if(this.inicial == null){
		}
		if (this.inicial.getPessoa() == null){
			this.inicial = null;
		}else{
		Pessoa p = this.inicial.getPessoa();
		this.inicial = p;
		}
	}
	
	
	
	
	
	
	
}
