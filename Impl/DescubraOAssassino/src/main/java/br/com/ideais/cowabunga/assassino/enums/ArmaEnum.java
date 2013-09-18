package br.com.ideais.cowabunga.assassino.enums;

public enum ArmaEnum {
	
	/*
	 * Peixeira
DynaTAC 8000X (o primeiro aparelho celular do mundo)
Trezoitão
Trebuchet


	 * */
	
	PEIXEIRA("Peixeira", 1),
	DYNATAC("DynaTAC 8000X", 2),
	TREZOITAO("Trezoitão", 3),
	TREBUCHET("Trebuchet", 4),
	MACA("Maça", 5),
	GLADIO("Gládio", 6);

	private String nome;
	private Integer id;
	
	private ArmaEnum(String nome, Integer id) {
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
