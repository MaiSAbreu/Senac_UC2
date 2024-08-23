package UmDeAgosto;
import java.util.Scanner;

public class tratamentoDeErro {

    public static void main(String[] args) {
        Scanner inteiro = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Digite um nome: ");
                String texto = inteiro.nextLine().trim();
                if (!texto.isEmpty()) {
                    if (texto.matches("^[A-Za-z ]+$")) {
                        System.out.println(texto +" é gay");
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
        inteiro.close();
    }
}
