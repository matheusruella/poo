package ExerciciosAula01;
import java.text.DecimalFormat;

public class TestePessoa {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00"); // Duas casas decimais
		Pessoa p1 = new Pessoa("Lucas", 79, 1.98);
		Pessoa p2 = new Pessoa("Marcos", 95, 1.72);
		Pessoa p3 = new Pessoa("Pedro", 52, 1.60);
		Pessoa p4 = new Pessoa("Julia", 81, 1.83);
		double mediaPeso = (p1.getPeso() + p2.getPeso() + p3.getPeso() + p4.getPeso()) / 4;
		double mediaAltura = (p1.getAltura() + p2.getAltura() + p3.getAltura() + p4.getAltura()) / 4;

		double peso = 0;
		String nome = "";
		if (p1.getPeso() > peso) {
			peso = p1.getPeso();
			nome = p1.getNome();
			if (p2.getPeso() > peso) {
				peso = p2.getPeso();
				nome = p2.getNome();
				if (p3.getPeso() > peso) {
					peso = p3.getPeso();
					nome = p3.getNome();
				}
				if (p4.getPeso() > peso) {
					peso = p4.getPeso();
					nome = p4.getNome();
				}
			}
		}

		System.out.println(nome + " é o mais pesado " + peso);

		double altura = 0;

		if (p1.getPeso() > altura) {
			altura = p1.getAltura();
			nome = p1.getNome();
			if (p2.getPeso() > altura) {
				altura = p2.getAltura();
				nome = p2.getNome();
				if (p3.getPeso() > altura) {
					altura = p3.getAltura();
					nome = p3.getNome();
				}
				if (p4.getPeso() > altura) {
					altura = p4.getAltura();
					nome = p4.getNome();
				}
			}
		}
		System.out.println(nome + " é o mais alto " + altura);

		System.out.println(" A media de peso é " + mediaPeso + "e a media de altura é " + df.format(altura));
	}

}
