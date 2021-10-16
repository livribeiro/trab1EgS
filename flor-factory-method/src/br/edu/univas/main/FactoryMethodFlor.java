package br.edu.univas.main;

import br.edu.univas.vo.FlorFactory;
import br.edu.univas.vo.FlorIF;

public class FactoryMethodFlor {
	
	public static void main(String[] args) {
		
		FlorFactory tipoFlor = new FlorFactory();
		
		FlorIF minhaFlor = tipoFlor.gerarFlor("rosa");
		minhaFlor.criarFlor();
		
		minhaFlor = tipoFlor.gerarFlor("margarida");
		minhaFlor.criarFlor();
		
		minhaFlor = tipoFlor.gerarFlor("orquidea");
		minhaFlor.criarFlor();
	}
}
