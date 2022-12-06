package aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	String nome;
	int idade;
	String cpf, RegistroGeral, mae, pai, serie, escola, dataNascimento, DataMatricula;
	private double media;
	private String resultado;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public String getRegistroGeral() {
		return RegistroGeral;
	}

	public void setRegistroGeral(String RegistroGeral) {
		this.RegistroGeral = RegistroGeral;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return DataMatricula;
	}

	public void setDataMatricula(String DataMatricula) {
		this.DataMatricula = DataMatricula;
	}

	public double getMedia() {
		
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas = somaNotas + disciplina.getNota();
/*Pode ser usado tbm desta forma >>>>>  somaNotas += disciplina.getNota();*/
		}
		return somaNotas / disciplinas.size();
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", RegistroGeral=" + RegistroGeral
				+ ", mae=" + mae + ", pai=" + pai + ", serie=" + serie + ", escola=" + escola + ", dataNascimento="
				+ dataNascimento + ", DataMatricula=" + DataMatricula + ", media=" + media + ", disciplinas="
				+ disciplinas + "]";
	}
	
	
	public String getResultado() {

		double media = this.getMedia();
		if(media >= 5.0) {
			if(media >= 7.0) {
				return "Aluno Aprovado";
			}else {
				return "Aluno em Recuperação";
			}
		}else {
			return "Aluno Reprovado!";
		}		
	}
	
	
	
	
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
	
	public String getDataMatricula() {
		return DataMatricula;
	}



	
	
}
