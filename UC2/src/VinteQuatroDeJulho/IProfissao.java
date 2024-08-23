package VinteQuatroDeJulho;

public interface IProfissao {
	public double calcularSalario(
			double salarioBruto, 
			double impostos, 
			double gratificação
		);
	public double calcularHorasTrabalhadas(
			double dias, 
			double horas
		);
	public double calcularINSS(
			double salarioBruto, 
			double faixaImposto
		);

}
