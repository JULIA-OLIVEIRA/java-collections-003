package br.fai.collections003;

public class Cachorroo extends Animall {
	
	public Cachorroo(String nome) {
		setNome(nome);
	}
	
	@Override
	public void som() {
		System.out.println("eu gosto de latir");
	}
	
	public void oQueGostoDeFazer() {
		System.out.println("gosto de morder carteiros");
	}

}
