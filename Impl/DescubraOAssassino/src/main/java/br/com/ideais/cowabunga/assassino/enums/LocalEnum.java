package br.com.ideais.cowabunga.assassino.enums;

public enum LocalEnum {
	
	REDMOND("Redmond", 1),
	PALO_ALTO("Palo Alto", 2), 
	SAN_FRANCISCO("San Francisco", 3), 
	TOKIO("Tokio", 4), 
	MILLIWAYS("Restaurante no Fim do Universo", 5), 
	SAMPA("S‹o Paulo", 6), 
	CUPERTINO("Cupertino", 7), 
	HELSINKI("Helsinki", 8), 
	MAIDA_VALE("Maida Vale", 9), 
	TORONTO("Toronto", 10);
	
	private String nome;
	private Integer id;
	
	private LocalEnum(String nome, Integer id) {
		this.nome = nome;
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
}
