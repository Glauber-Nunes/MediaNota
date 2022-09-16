import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome; 
	private List<Disciplina> listaDisciplina = new ArrayList<>();
	
	public Aluno() {
		
	}

	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Disciplina> getListaDisciplina() {
		return listaDisciplina;
	}

	public void setListaDisciplina(List<Disciplina> listaDisciplina) {
		this.listaDisciplina = listaDisciplina;
	}

	
}
