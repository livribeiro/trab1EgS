package br.edu.univas.vo;

public class FlorFactory {
	public FlorIF gerarFlor(String flor) {
		
		if(flor == 	""  || flor == null) {
		return null;
		}
		if(flor.toUpperCase().equals("ROSA")) {
			return new Rosa();
		}if(flor.toUpperCase().equals("MARGARIDA")) {
			return new Margarida();
		}if(flor.toUpperCase().equals("ORQUIDEA")) {
			return new Orquidea();
		}
		return null;
		}
	}

