package br.com.serratec.teste;

import java.time.LocalDate;

import br.com.serratec.exemplos.Pedido;

public class Teste {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(123, LocalDate.of(2025, 02, 03), 2000., 2);

		System.out.println("Nº pedido: " + pedido1.getNumero() + " Total: " + pedido1.getTotal());
	}

}
