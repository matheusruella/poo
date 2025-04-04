package br.com.serratec.heranca;

public class Diretor extends Empregado {
	private String area;

	public Diretor(String nome, String email, String telefone, String area, Double salario) {
		super(nome, email, telefone, salario);
		this.area = area;
	}

	public String getArea() {
		return area;
	}
	
	
}
