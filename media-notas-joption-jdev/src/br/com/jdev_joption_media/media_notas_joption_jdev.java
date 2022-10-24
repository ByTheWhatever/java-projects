package br.com.jdev_joption_media;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class media_notas_joption_jdev {

	public static void main(String[] args) {

		ArrayList<String> alunosAprovados = new ArrayList<String>();
		ArrayList<String> alunosReprovados = new ArrayList<String>();
		ArrayList<String> alunosRecuperacao = new ArrayList<String>();

		while (true) {
			String nomeAluno = JOptionPane.showInputDialog("Digite o nome do Aluno.");
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do 1º bimestre: "));
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do 2º bimestre: "));
			double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do 3º bimestre: "));
			double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do 4º bimestre: "));

			double calcMedia = (nota1 + nota2 + nota3 + nota4) / 4;

			if (calcMedia >= 60) {
				JOptionPane.showMessageDialog(null, "Aluno aprovado. Media: " + calcMedia);
				alunosAprovados.add(nomeAluno);
			} else if (calcMedia <= 59 && calcMedia >= 40) {
				JOptionPane.showMessageDialog(null, "Aluno de recuperação. Media: " + calcMedia);
				alunosRecuperacao.add(nomeAluno);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno reprovado. Media: " + calcMedia);
				alunosReprovados.add(nomeAluno);
			}
			int respostaAprovado = JOptionPane.showConfirmDialog(null, "Gostaria de imprimir a lista de aprovados?");
			if (respostaAprovado == 0) {
				for (int a = 0; a < alunosAprovados.size(); a++) {
					JOptionPane.showMessageDialog(null, alunosAprovados.get(a));
				}
			}
			int respostaRecuperacao = JOptionPane.showConfirmDialog(null,
					"Gostaria de imprimir a lista de recuperação?");
			if (respostaRecuperacao == 0) {
				for (int r = 0; r < alunosRecuperacao.size(); r++) {
					JOptionPane.showMessageDialog(null, alunosRecuperacao.get(r));
				}
			}
			int respostaReprovado = JOptionPane.showConfirmDialog(null, "Gostaria de imprimir a lista de reprovados?");
			if (respostaReprovado == 0) {
				for (int re = 0; re < alunosReprovados.size(); re++) {
					JOptionPane.showMessageDialog(null, alunosReprovados.get(re));
				}
			}
			if (respostaAprovado == 0 && respostaReprovado == 0 && respostaRecuperacao == 0) {
				break;
			}
		}
	}
}