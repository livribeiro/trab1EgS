package br.edu.univas.main;

import br.edu.univas.vo.Margarida;
import br.edu.univas.vo.Orquidea;
import br.edu.univas.vo.Rosa;

public class StartApp {

	public static void main(String[] args) {
		
		Margarida margarida = new Margarida();
		margarida.criarFlor("MARGARITA");
		
		Orquidea orquidea = new Orquidea();
		orquidea.criarFlor("ORQUIDEA");
		
		Rosa rosa = new Rosa();
		rosa.criarFlor("ROSA");
		
	}
}
