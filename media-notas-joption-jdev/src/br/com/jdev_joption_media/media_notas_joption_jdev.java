package br.com.jdev_joption_media;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Gabriel
 * @version 1.0
 * @since 26/10/2022
 */

public class media_notas_joption_jdev {

	/**
	 * 
	 * @param args iniciação do método
	 */
	
	public static void main(String[] args) {

		/**
		 * 
		 * @param ArrayList - Instanciação das arraylists que irão receber os alunos
		 *                  aprovados, reprovados e em recuperação.
		 * 
		 */

		ArrayList<String> alunosAprovados = new ArrayList<String>();
		ArrayList<String> alunosReprovados = new ArrayList<String>();
		ArrayList<String> alunosRecuperacao = new ArrayList<String>();

		/**
		 * @param While - Todo o corpo do código está envolvido em um método while, esse
		 *              método permite declarar uma condição para loop enquanto não for
		 *              atendida.
		 * 
		 */

		while (true) {

			/**
			 * @param nomeAluno - Declaração das informações do aluno, no caso só
			 *                  implementei o nome.
			 * @param nota1,    nota2, nota3 e nota4 - Notas dos bimestres, calculamos uma
			 *                  matéria por vez. Utilizei a classe Joption para receber a
			 *                  entrada de dados de forma dinâmica, o método me retorna uam
			 *                  String então precisei usar um parseDouble para fazer a
			 *                  conversão.
			 */

			String nomeAluno = JOptionPane.showInputDialog("Digite o nome do Aluno.");
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do 1º bimestre: "));
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do 2º bimestre: "));
			double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do 3º bimestre: "));
			double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do 4º bimestre: "));

			/**
			 * @param calcMedia - método que recebe as notas em double.
			 * @return retorna a média, soma as notas e divide por 4 para chegar à média.
			 */

			double calcMedia = (nota1 + nota2 + nota3 + nota4) / 4;

			/**
			 * @param If - métodos if que verificam se o aluno está aprovado, reprovado ou
			 *           em recuperação.
			 * @return retorna a resposta dependendo da média total e insere o aluno em uma
			 *         lista conforme sua condição.
			 */

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
			
			/**
			 * @param respostaAprovado - imprime a lista de aprovados
			 * @return caso o usuário escolha por "sim" na caixa de diálogo da classe JOption que aparecer
			 * a lista é exibida na tela.
			 */
			
			int respostaAprovado = JOptionPane.showConfirmDialog(null, "Gostaria de imprimir a lista de aprovados?");
			if (respostaAprovado == 0) {
				for (int a = 0; a < alunosAprovados.size(); a++) {
					JOptionPane.showMessageDialog(null, alunosAprovados.get(a));
				}
			}
			
			/**
			 * @param respostaRecuperacao - imprime a lista de recuperação
			 * @return caso o usuário escolha por "sim" na caixa de diálogo da classe JOption que aparecer
			 * a lista é exibida na tela.
			 */
			
			int respostaRecuperacao = JOptionPane.showConfirmDialog(null,
					"Gostaria de imprimir a lista de recuperação?");
			if (respostaRecuperacao == 0) {
				for (int r = 0; r < alunosRecuperacao.size(); r++) {
					JOptionPane.showMessageDialog(null, alunosRecuperacao.get(r));
				}
			}
			
			/**
			 * @param respostaRprovados - imprime a lista de reprovados
			 * @return caso o usuário escolha por "sim" na caixa de diálogo da classe JOption que aparecer
			 * a lista é exibida na tela.
			 */
			
			int respostaReprovado = JOptionPane.showConfirmDialog(null, "Gostaria de imprimir a lista de reprovados?");
			if (respostaReprovado == 0) {
				for (int re = 0; re < alunosReprovados.size(); re++) {
					JOptionPane.showMessageDialog(null, alunosReprovados.get(re));
				}
			}
			
			/**
			 *@param If - encerra a reprodução do código caso o usuário tenha impresso as 3 listas
			 *@return fechamento do método while junto com um if que encerra o programa, só em caso de impressão 
			 *das 3 listas, caso não haja impressão das 3 listas, o método continua em loop, tudo de novo. 
			 */
			
			if (respostaAprovado == 0 && respostaReprovado == 0 && respostaRecuperacao == 0) {
				break;
			}
		}
	}
}