package br.fai.collections003;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}
	
	private void start() { // criação de um método privado, método visto apenas na classe atual
		
		Cachorroo primeiroCachorroo = new Cachorroo("tiburcio");
		Cachorroo segundoCachorroo = new Cachorroo("joão");
		
		primeiroCachorroo.setCor("azul");
					
		List<Cachorroo> listaDeCachorroos = new ArrayList <Cachorroo>(); 
		listaDeCachorroos.add(primeiroCachorroo);
		listaDeCachorroos.add(segundoCachorroo);
		
		for(Cachorroo cachorroo : listaDeCachorroos) {
			cachorroo.som();
			cachorroo.dizerMeuNome();
			cachorroo.oQueGostoDeFazer();
			
			System.out.println("cor do cachorro: ");
			cachorroo.getCor();
			
			System.out.println("------");
		}
		
		Gatoo primeiroGatoo = new Gatoo();
		primeiroGatoo.setNome("yoru");
		Gatoo segundoGatoo = new Gatoo("vermelho");
		segundoGatoo.setNome("xuxu");
		
		
		
		List<Gatoo> listaDeGatoos = new ArrayList<Gatoo>();
		listaDeGatoos.add(primeiroGatoo);
		listaDeGatoos.add(segundoGatoo);
		
		for(Gatoo gatoo : listaDeGatoos) {
			
			gatoo.som();
			gatoo.dizerMeuNome();
			gatoo.oQueFacoDuranteANoite();
			
			System.out.println("a cor do gato: " + gatoo.getCor());
			System.out.println("-------");
			
		}
		
		System.out.println(primeiroCachorroo.getNome());
		
	}

}
