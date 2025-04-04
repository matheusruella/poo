package br.com.serratec.heranca;

public class TesteEmpregado {

	public static void main(String[] args) {
			Empregado gerente = new Gerente("Carla", "c@gmail.com", "2222", 10, 5500.);
			Diretor diretor = new Diretor("Carlos","ca@gmail.com", "233","adm",9000.);
			
			gerente.aumentarSalario(10.);
			diretor.aumentarSalario(10.);
			System.out.println(gerente.getNome() +"-"+ gerente.getEmail());
			System.out.println("Novo salario: "+ diretor.getSalario());
			System.out.println("Novo salario: "+ gerente.getSalario());
			
			System.out.println(diretor.toString());
			System.out.println(gerente.toString());
	}

}
