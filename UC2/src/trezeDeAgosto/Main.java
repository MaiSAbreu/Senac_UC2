package trezeDeAgosto;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		List<String> estados = Arrays.asList("AC","AL","AP","AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu estado(UF):");
		String uf =sc.nextLine().toUpperCase();
		if(estados.contains(uf)) {
			System.out.println("Tudo certo!");
		}else {
			System.out.println("Esse não é um  estado Brasileiro.");
		}	
		System.out.println("Digite seu cpf: ");
		String cpf = sc.nextLine();
		ValidaCpf val = new ValidaCpf();
		if(val.isCpf(cpf)==true) {
			System.out.println("Tudo certo!");
		}else {
			System.out.println("CPF inválido");
		}
	}
}
