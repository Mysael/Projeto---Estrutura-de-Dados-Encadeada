package br.com.cesed.facisa.si.p3.classes;
/**
 * implementando funcionamento de ArraLyst
 * @author Mysael
 */
public class ArrayListSequencial {
	
	private Pessoa inicial = null;
	private int elementos;
	
	public ArrayListSequencial(){
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
	 * m�todo que adiciona elemento ao ArrayList
	 * @param nome nome que ser� adicionado a nova pessoa
	 * @param idade idade que ser� adicionado a nova pessoa
	 * @param cpf cpf que ser� adicionado a nova pessoa
	 * 
	 */
	public void add(String nome,int idade, String cpf){
		//ArrayListSequencial arrayListM = new ArrayListSequencial();
		if(this.getInicial() == null){
			this.setInicial(nome, idade, cpf);
			elementos ++;
		}else {
			Pessoa proximaPessoa = this.getInicial();
			while(proximaPessoa.getPessoa() != null){
				proximaPessoa = proximaPessoa.getPessoa();
			}
			Pessoa proxima = new Pessoa (nome, idade, cpf);
			proximaPessoa.setPessoa(proxima);
			elementos ++;
		}
	}
	/**
	 * m�todo que ir� remover uma pessoa do ArrayList
	 * @param cpf par�metro unico de busca para remo��o de uma pessoa
	 */
	public void remove(String cpf){
		if (this.getInicial().getCpf() == cpf){
			this.inicial = inicial.getPessoa();
			elementos --;
		}else{ 
			Pessoa anterior = null;
			Pessoa p = this.inicial;
			//while (p != null && !(p.getCpf() == cpf)){
			//	anterior = p;
			//	p = p.getPessoa();
			//}
			while (p != null){
				if (p.getCpf() == cpf){
					anterior.setPessoa(p.getPessoa());
					p = null;
					elementos --;
					break;
				}
				anterior = p;
				p = p.getPessoa();
			}
		}
	}
	
	/**
	 * m�todo que ir� buscar uma pessoa pelo par�metro
	 * @param index par�metro indice que ser� passado para buscar a pessoa
	 * @return retorna o objeto Pessoa ao qual foi procurado pelo indice
	 */
	public Pessoa getByIndex(int index){
		if (index == 0){
			System.out.println(this.inicial);
		}if (elementos >= index){
			Pessoa anterior = null;
			Pessoa p = this.inicial;
			for (int i = 0; i<index; i++){
				anterior = p;
				p = p.getPessoa();
			}
			return p;
		}else{
			System.out.println("index inacess�vel...");
			return null;
		}
	}
	/**
	 * m�todo que acha o indice do objeto no ArrayList
	 * @param people par�metro que ser� passado na busca, para ser usado como comparativo
	 * @return retona o indice do Array
	 */
	public Integer findPosition (Pessoa people){
		if(people.getCpf() == this.inicial.getCpf()){
			return 0;
		}
		int i = 1;
		Pessoa anterior = null;
		Pessoa p = this.inicial;
		while(i < elementos){
			anterior = p;
			p = p.getPessoa();
			if(p.getCpf() == people.getCpf()){
				return i;
			}i++;	
		}return null;
	}
	
	public void printAllEments(){
		Pessoa anterior = null;
		Pessoa p = this.inicial;
		while(p.getPessoa() != null){
			System.out.println(p);
			anterior = p;
			p = p.getPessoa();
		}
	}
	
}
