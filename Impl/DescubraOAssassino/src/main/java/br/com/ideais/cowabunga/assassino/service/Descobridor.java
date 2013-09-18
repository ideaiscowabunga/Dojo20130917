package br.com.ideais.cowabunga.assassino.service;

import java.util.ArrayList;
import java.util.List;

import br.com.ideais.cowabunga.assassino.enums.ArmaEnum;
import br.com.ideais.cowabunga.assassino.enums.LocalEnum;
import br.com.ideais.cowabunga.assassino.enums.SuspeitoEnum;

public class Descobridor {

	private SuspeitoEnum suspeito;
	private LocalEnum local;
	private ArmaEnum arma;
	
	public Descobridor(SuspeitoEnum suspeito, LocalEnum local, ArmaEnum arma) {
		this.suspeito = suspeito;
		this.local = local;
		this.arma = arma;
	}

	public Integer palpite(SuspeitoEnum suspeito, LocalEnum local, ArmaEnum arma) {
		List<Integer> erros = new ArrayList<Integer>();

		if (!this.suspeito.equals(suspeito)){
			erros.add(1);
		}
		
		if (!this.local.equals(local)){
			erros.add(2);
		}
		
		if (!this.arma.equals(arma)){
			erros.add(3);
		}
		
		if( erros.isEmpty() ) {
			return 0;
		}
		
		return erros.get( indiceRandomico( erros.size() ) );
	}

	private Integer indiceRandomico(Integer indiceMaximo) {
		return (int) (Math.random() * indiceMaximo);
	}

	
}
