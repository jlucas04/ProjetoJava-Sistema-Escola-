package principal;

import java.io.ObjectInputStream.GetField;
import java.util.Iterator;
import javax.swing.JOptionPane;
import aluno.Aluno;
import aluno.Disciplina;


public class ClassePrincipal{
	public static void main(String[] args) {
		
		Aluno Aluno1 = new Aluno();
	
		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno? ");
		String idade = JOptionPane.showInputDialog("Qual a sua idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual sua data de Nascimento?");
		String rg = JOptionPane.showInputDialog("Qual seu RG?");
		String cpf = JOptionPane.showInputDialog("Qual seu CPF?");
		String mae = JOptionPane.showInputDialog("Qual o nome da Mãe?");
		String pai = JOptionPane.showInputDialog("Qual o nome do Pai?");
		String matricula = JOptionPane.showInputDialog("Qual sua matricula?");
		String serie = JOptionPane.showInputDialog("Qual a sua série?");
		String escola = JOptionPane.showInputDialog("Qual o nome da sua escola?");

		Aluno1.setNome(nome);
		Aluno1.setIdade(Integer.valueOf(idade));
		Aluno1.setDataNascimento(dataNascimento);
		Aluno1.setRegistroGeral(rg);
		Aluno1.setCpf(cpf);
		Aluno1.setMae(mae);
		Aluno1.setPai(pai);
		Aluno1.setDataMatricula(matricula);
		Aluno1.setSerie(serie);
		
		for (int i = 1; i <= 4; i++) {
			String inf_Disciplina = JOptionPane.showInputDialog("Informe a disciplina " + i + ":");
			String inf_Nota = JOptionPane.showInputDialog("Informe a nota da disciplina "+ i + ":");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(inf_Disciplina);
			disciplina.setNota(Double.valueOf(inf_Nota));
			Aluno1.getDisciplinas().add(disciplina);
		}
		
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja removar alguma disciplina?");
		
		if (escolha == 0) {
			int continuarRemover = 0 ;
			int posicao = 1;
			while(continuarRemover == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1,2,3 ou 4?");
				Aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover Disciplinas?");
				
			}
		}
		
		System.out.println(Aluno1);
		System.out.println("Média do aluno : " + Aluno1.getMedia());
		System.out.println("Resultado : " + Aluno1.getResultado());
	
	}
}
