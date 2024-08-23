package dozeDeAgosto;

import java.util.Scanner;

public class tratamentoDeErro {

	public static void main(String[] args) {
		Scanner inteiro = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Digite seu e-mail: ");
				String texto = inteiro.nextLine().trim();
				if (texto.isEmpty() == false) {
					if (texto.matches("[a-z0-9._%+-]+@[A-Zxa-z0-9.-]+\\.[A-Za-z]{2,}")) {
						System.out.println(texto);
						break;
					} else {
						System.out.println("Digite somente letras!");
					}
				} else {
					System.out.println("Não pode ficar vazio!");
				}
			} catch (Exception e) {
				System.out.println("Digite uma informação válida!");
			}
		}
		while (true) {
			System.out.println("Digite seu telefone com DDD: ");
			String telefone = inteiro.nextLine().trim().toLowerCase();
			if (telefone.isEmpty() == false) {
				if (telefone.matches("[a-z0-9().-]+")) {
					if (telefone.length() == 14) {
						System.out.println(telefone);
						break;
					} else {
						System.out.println("Telefone tem 14 dígitos!");
					}
				} else {
					System.out.println("Digite um telefone válido!");
				}
			} else {
				System.out.println("Não pode ficar vazio!");
			}
		}
		while (true) {
			Scanner numero = new Scanner(System.in);
			int idade = numero.nextInt();
			if (idade >= 0 && idade <= 110) {
				System.out.println(idade);
			} else {
				System.out.println("Digite uma idade válida!");
			}
		}
	}
}
