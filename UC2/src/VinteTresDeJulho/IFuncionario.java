package VinteTresDeJulho;

public interface IFuncionario {

	double calcularSalario(double salario, double imposto, double grat);
	double verQuantidadeDeHorasTrabalhadas(int horaInicio, int horaFim);
	double verClassificacaoNivelDoProfissional(int anosExperiencia);

}
