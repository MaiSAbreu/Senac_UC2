package VinteeDoisDeJulho;

public class Main {

	public static void main(String[] args) {
		
		FuncoesString funcoesString = new FuncoesString();		
//		funcoesString.iniciarStringManeiraUm("Juju");
//		funcoesString.iniciarStringManeiraDois("Xuxu");
//		funcoesString.retornarTamanhoString("Fortaleza no G4");
//		funcoesString.retornarCaractereNaPosicao("Ceará", 0);
//		funcoesString.retornarStringaPartirDoIndice("Senac Ceará", 5);
//		funcoesString.retornarStringaPartirDoIndice("Senac Ceará", 0, 5);
//		funcoesString.retornarPrimeiroIndice("Eduardo", "d");
//		funcoesString.retornarUltimoIndice("Eduardo", "d");
//		funcoesString.isContem("Leonardo", "Leo");
		funcoesString.isIgual("Leonardo", "leonardo");
		funcoesString.isIgual2("Leonardo", "leonardo");		
		
		Exercicio exercicio = new Exercicio();
		exercicio.questao1("Eduardo");
		exercicio.questao2("Mayla", 2);
		exercicio.questao3("Totalmente demais", 5);
		exercicio.questao4("Sinto muito coolpa-lo", 6, 16);
		exercicio.questao5("Calafrios", "f");
		exercicio.questao6("El Dourado", "d");
		exercicio.questao7("Caracoles", "Caracol");
		exercicio.questao8("Carlos", "carlos");
		exercicio.questao9("Carlos", "carlos");
		
		}
}
