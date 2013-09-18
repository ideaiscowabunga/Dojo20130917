package br.com.ideais.cowabunga.assassino.enums;

public enum SuspeitoEnum {
	
	CHARLES("Charles B. Abbage", 1),
	DONALD("Donald Duck Knuth", 2),
	ADA("Ada L. Ovelace", 3),
	ALAN("Alan T. Uring", 4),
	IVAR("Ivar J. Acobson", 5),
	RAS("Ras Mus Ler Dorf", 6);

	private String nome;
	private Integer id;
	
	private SuspeitoEnum(String nome, Integer id) {
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
