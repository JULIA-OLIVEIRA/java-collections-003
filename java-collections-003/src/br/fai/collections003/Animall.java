package br.fai.collections003;

public class Animall {
	public void som() {
		System.out.println("este é o som" + "padrão de um animal: zzzz");
	}
	
	public void dizerMeuNome() {
		System.out.println("nome do animal: lll");
	}
	
	public void dizerMinhaIdade() {
		System.out.println("minha idade é: xxx");
	}
	
	private String  cor = "preto";
	private int idade = 5;
	private String nome = "não definido";
	
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
