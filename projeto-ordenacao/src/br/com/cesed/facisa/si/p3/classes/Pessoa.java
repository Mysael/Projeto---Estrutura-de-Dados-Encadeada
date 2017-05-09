package br.com.cesed.facisa.si.p3.classes;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String cpf;
	private Pessoa proxPessoa;
	
	public Pessoa(String nome, int idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if (validaCPF(cpf) == true){
			this.cpf =formataCPF(cpf);
			}
		else System.out.println("não rola, mas vlw a tentativa ai...");
	}

	public Pessoa getPessoa() {
		return proxPessoa;
	}
	public void setPessoa(Pessoa proxima) {
		this.proxPessoa = proxima;
	}
	public boolean validaCPF(String cpf){
		/*if(cpf.length() >= 11){
			return true;
		}
		return false;*/
		return cpf.length()==11;
	}
	
	public String formataCPF(String cpf){
		cpf = cpf.charAt(0)+""+ cpf.charAt(1)+""+ cpf.charAt(2)+"."+ cpf.charAt(3)+""+
		cpf.charAt(4)+""+ cpf.charAt(5)+"."+ cpf.charAt(6)+""+
		cpf.charAt(7)+""+ cpf.charAt(8)+"-"+ cpf.charAt(9)+""+ cpf.charAt(10);
		return cpf;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + "]";
	}
	
	
	
}
