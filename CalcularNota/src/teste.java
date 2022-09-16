import java.util.Iterator;

import javax.swing.JOptionPane;

public class teste {

	public static void main(String[] args) {

		String nomeAluno = JOptionPane.showInputDialog("Seu Nome");
		Aluno aluno = new Aluno(nomeAluno);

		// FOR PARA PEDIR AS DISCIPLINAS DO ALUNO
		for (int i = 0; i < 2; i++) {
			String nome = JOptionPane.showInputDialog("Nome da disciplina " + (i + 1));
			Disciplina disciplina = new Disciplina(nome);
			aluno.getListaDisciplina().add(disciplina);

			// FOR PARA INFORMAR AS 4 NOTAS DE CADA DISCIPLINA
			for (int nota = 0; nota < disciplina.getArrayNotas().length; nota++) {
				double inserir = Double.valueOf(JOptionPane.showInputDialog("Insira a nota " + (nota + 1)));
				disciplina.getArrayNotas()[nota] = inserir;

			}

		}

		// IMPRIMINDO NOME DO ALUNO
		System.out.println("Aluno: " + nomeAluno);

		// FOR PARA PERCORRER E IMPRIMIR LISTA DE DISCIPLINA
		for (Disciplina d : aluno.getListaDisciplina()) {
			System.out.println("Disciplina: " + d.getNome());

			// FOR PARA IMPRIMIR AS 4 NOTAS DE CADA DISCIPLINA
			for (int n =0; n<d.getArrayNotas().length;n++) {
				System.out.println("Nota: " + (n+1) + ": " +d.getArrayNotas()[n] );

			}
			
			// MOSTRANDO SITUAÇAO DO ALUNO
			System.out.println("SITUAÇAO: " + d.situacaoAluno() + " Media " + d.calculaMedia());
			System.out.println("__________________________");
		}

	}
}
