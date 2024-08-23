package VinteQuatroDeJulho;

public class Professor implements IProfissao {

	@Override
	public double calcularSalario(double salarioBruto, double impostos, double gratificação) {
		double salarioFinal = (salarioBruto - 1.5*impostos) + gratificação;
		System.out.println("O salário final é: " + salarioFinal);
		return salarioFinal;
	}

	@Override
	public double calcularHorasTrabalhadas(double dias, double horas) {
		double horasTrabalhadas = (5.25*horas) * dias;
		System.out.println("A quantidade de horas trabalhadas é: " + horasTrabalhadas);
		return horasTrabalhadas;
	}

	@Override
	public double calcularINSS(double salarioBruto, double faixaImposto) {
		double inssFinal = salarioBruto - (salarioBruto * faixaImposto);
		System.out.println("O INSS final é: " + inssFinal);
		return inssFinal;
	}

}
