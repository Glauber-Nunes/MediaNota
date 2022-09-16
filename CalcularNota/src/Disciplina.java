
public class Disciplina {

	private String nome;
	private double[] ArrayNotas = new double[4];

	public Disciplina() {

	}

	public Disciplina(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getArrayNotas() {
		return ArrayNotas;
	}

	public void setArrayNotas(double[] arrayNotas) {
		ArrayNotas = arrayNotas;
	}

	public double calculaMedia() {
		double somaNota = 0;
		for (int i = 0; i < ArrayNotas.length; i++) {
			somaNota = somaNota + ArrayNotas[i];
		}

		return somaNota / ArrayNotas.length;
	}

	public String situacaoAluno() {

		double media = calculaMedia();

		if (media >= 7) {
			return "ALUNO APROVADO";
		} else
			return "ALUNO REPROVADO";

	}
}
