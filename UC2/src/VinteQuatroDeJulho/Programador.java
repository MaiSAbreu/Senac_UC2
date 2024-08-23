package VinteQuatroDeJulho;

public class Programador implements IProfissao {

	@Override
	public double calcularSalario(double salarioBruto, double impostos, double gratificação) {
		double salarioFinal = (salarioBruto - impostos) + (gratificação*salarioBruto/100);
		System.out.println("O salário final é " + salarioFinal);
		return salarioFinal;
	}

	@Override
	public double calcularHorasTrabalhadas(double dias, double horas) {
		double horasTrabalhadas = (dias * horas) * dias/horas;
		System.out.println(horasTrabalhadas);
		return horasTrabalhadas;
	}

	@Override
	public double calcularINSS(double salarioBruto, double faixaImposto) {
		double inssFinal = salarioBruto - faixaImposto/100;
		System.out.println(inssFinal);
		return inssFinal;
	}

}
