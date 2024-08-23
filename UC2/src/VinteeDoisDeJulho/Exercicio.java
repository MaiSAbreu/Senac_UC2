package VinteeDoisDeJulho;

public class Exercicio {

	public int questao1(String string) {
		int tamanho = string.length();
		System.out.println("O tamanho da string é " + tamanho);
		return tamanho;
	}
	
	public int questao2(String nome, int i) {
		char letra =  nome.charAt(i);
		System.out.println("A letra na posição " + i + " é " + letra);
		return letra;
	}
	
	public String questao3(String frase, int i) {
		String nova = frase.substring(i);
		System.out.println(nova);
		return nova;
	}
	
	public String questao4(String frase, int i, int j) {
		String novaFrase = frase.substring(i, j);
		System.out.println(novaFrase);
		return novaFrase;
	}
	
	public int questao5(String nome, String letra) {
		int posicao = nome.indexOf(letra);
		System.out.println("Na primeira vez que a letra " + letra + " aparece, ela está na posição " + (posicao + 1));
		return posicao;
	}
	
	public int questao6(String nome, String letra) {
		int posicao = nome.lastIndexOf(letra);
		System.out.println("Na última vez que a letra " + letra + " aparece, ela está na posição " + (posicao + 1));
		return posicao;
	}
	
	public boolean questao7(String string, String substring) {
		boolean contem = string.contains(substring);
		System.out.println(string + " contém " + substring + "?: " + contem);
		return contem;
	}
	
	public boolean questao8(String nome1, String nome2) {
		if (nome1.equals(nome2)) {
			System.out.println("Os nomes são iguais.");
			return true;
		}
		System.out.println("Os nomes são diferentes.");
		return false;
	}	
	public boolean questao9(String string1, String string2) {
		if (string1.equalsIgnoreCase(string2)) {
			System.out.println("Os nomes são igais.");
			return true;
		}
		else {
			System.out.println("Os nomes são diferentes.");
			return false;
		}
	}
	
}
