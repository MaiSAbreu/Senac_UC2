package QuatorzeDeAgosto;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import trezeDeAgosto.ValidaCpf;

public class Atividade {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		while (true) {
			System.out.println("Digite seu nome: ");
			String nome = dados.nextLine();
			if (nome.isEmpty() == false) {
				if (nome.matches(".*\\d.*")) {
					System.out.println("O nome não pode conter números!");
				} else {
					System.out.println(nome);
					break;
				}
			} else {
				System.out.println("O campo nome não pode estar vazio");
			}
		}
		while (true) {
			System.out.println("Digite seu CPF: ");
			String cpf = dados.nextLine();
			
			if (cpf.isEmpty()) {
				System.out.println("O campo cpf não pode estar vazio");
				continue;
			}
			
			if (!cpf.matches("(?:\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11})")) {
				System.out.println("O cpf deve possuir 11 dígitos");
				continue;
			}
			
			cpf = cpf.replaceAll("[.-]", "");
			
			if (!ValidaCpf.isCpf(cpf)) {
				System.out.println("O cpf informado não é um cpf válido");
				continue;
			}
			
			break;
			
		}
		while (true) {
			System.out.println("Digite seu RG: ");
			String rg = dados.nextLine();
			if(rg.isEmpty()) {
				System.out.println("O campo RG não pode estar vazio");
				continue;
			}
			
			if (!rg.matches("\\d{10}-\\d|\\d{11}")) {
				System.out.println("O padrão do RG no Ceará é XXXXXXXXXX-X (com 10 dígitos antes do traço)");
				continue;
			}
			break;
		}
		while (true) {
			System.out.println("Insira sua data de nascimento: ");
			String birth = dados.nextLine();
			if(birth.isEmpty()) {
				System.out.println("Este campo não pode estar vazio");
				continue;
			}
			if(!birth.matches("(?:\\d{2}/\\d{2}/\\d{4}|\\d{8}|\\d{6}|\\d{2}/\\d{2}/\\d{2})")) {
				System.out.println("Insira uma data válida");
				continue;
			}
			break;
		}
		while (true) {
			System.out.println("Digite seu endereço:");
			String endereco = dados.nextLine();
			if(endereco.isEmpty()) {
				System.out.println("Este campo não pode estar vazio");
				continue;
			}
			break;
		}
		while (true) {
			System.out.println("Digite o número da sua casa:");
			String numero = dados.nextLine();
			if(numero.isEmpty()) {
				System.out.println("Este campo não pode estar vazio");
				continue;
			}
			if (!numero.matches("\\d{1,5}")) {
				System.out.println("Esse número é muito grande, acho que você está mentindo!");
			continue;
			}	
			break;
		}
		
		while (true) {
			System.out.println("Insira seu bairro:");
			String bairro = dados.nextLine();
			if(bairro.isEmpty()) {
				System.out.println("Este campo não pode estar vazio");
				continue;
			}
			break;
		}
		while(true) {
			System.out.println("Informe sua cidade:");
			String cidade = dados.nextLine();
			if(cidade.isEmpty()) {
				System.out.println("Este campo não pode estar vazio");
				continue;
			}
			break;
		}
		while(true) {
		List<String> estados = Arrays.asList("AC","AL","AP","AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu estado(UF):");
		String uf =sc.nextLine().toUpperCase();
			if(!estados.contains(uf)) {
				System.out.println("Esse não é um  estado Brasileiro.");
				continue;
			}
			if(uf.isEmpty()) {
				System.out.println("Este campo não pode estar vazio");
				continue;
			}	
			break;
		}	
		
		while(true) {
			System.out.println("Nome do pai (Opcional):");
			String pai = dados.nextLine();
			break;
		}
		while(true) {
			System.out.println("Nome da mãe (Opcional):");
			String mae = dados.nextLine();
			break;
		}
		
		System.out.println("Tudo certo!");
	}
}