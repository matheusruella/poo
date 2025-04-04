package br.com.serratec.heranca;

public class Gerente extends Empregado {
	private Integer numEmrepadoGerenciados;

	public Gerente(String nome, String email, String telefone, Integer numEmrepadoGerenciados, Double salario) {
		super(nome, email, telefone, salario);
		this.numEmrepadoGerenciados = numEmrepadoGerenciados;
	}

	public Integer getNumEmrepadoGerenciados() {
		return numEmrepadoGerenciados;
	}
	
	public Double aumentarSalDouble(Double valor) {
		return salario = super.aumentarSalario(valor) + 1000;
	}
	@Override
	public String toString() {
		return super.toString() + "Nº emp:"+ numEmrepadoGerenciados;
	}

}
