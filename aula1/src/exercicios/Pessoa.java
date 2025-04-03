package exercicios;

public class Pessoa {
	private int id;
	private String nome;
	private double peso, altura;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPeso() {

		return peso;

	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (peso >= 0) {
			this.altura = altura;

		} else {
			System.out.println("Você digitou um valor inválido!");
		}
	}

	private double calcularIMC() {
		return peso / (altura * altura);
	}

	public String resultado() {
		// Se o resultado for <18.5 - Abaixo do peso
		// entre 18.5 e 24.9 - peso ideal
		// Acima do peso
		if (calcularIMC() < 18.5) {
			return "Abaixo do Peso";
		} else if (calcularIMC() <= 24.9) {
			return "Peso ideal";
		} else {
			return "Acima do peso";
		}
	}
}
