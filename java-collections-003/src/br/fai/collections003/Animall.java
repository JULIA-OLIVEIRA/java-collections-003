package br.fai.collections003;

public class Animall {
	public void som() {
		System.out.println("este � o som" + "padr�o de um animal: zzzz");
	}
	
	public void dizerMeuNome() {
		System.out.println("nome do animal: lll");
	}
	
	public void dizerMinhaIdade() {
		System.out.println("minha idade �: xxx");
	}
	
	private String  cor = "preto";
	private int idade = 5;
	private String nome = "n�o definido";
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
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
	
	
}
