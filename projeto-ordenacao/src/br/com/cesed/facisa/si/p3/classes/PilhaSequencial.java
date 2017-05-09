package br.com.cesed.facisa.si.p3.classes;

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
	
	public static void main(String[] args) {
		PilhaSequencial deckTeste = new PilhaSequencial();
		deckTeste.push("Maic�o", 12, "12345678900");
		deckTeste.push("george", 30, "98765432100");
		deckTeste.push("eu", 20, "12147065670");
		deckTeste.pop();
		System.out.println(deckTeste.inicial.getPessoa().getPessoa());
	}
	
	
}
