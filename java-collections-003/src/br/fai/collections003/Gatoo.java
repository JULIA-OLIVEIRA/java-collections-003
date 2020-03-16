package br.fai.collections003;

public class Gatoo extends Animall{
		
		public Gatoo() {
			setCor("branco");			
		}
		
		public Gatoo(String cor) {
			setCor(cor);
		}
		
		@Override
		public void som() {
			super.som();
			System.out.println("eu gosto de miar");
		}
		
		public void oQueFacoDuranteANoite() {
			System.out.println("gosto de pular a cerca toda noite");
		}
		
}
