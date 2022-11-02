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
	 * @param args inicia��o do m�todo
	 */
	
	public static void main(String[] args) {

		/**
		 * 
		 * @param ArrayList - Instancia��o das arraylists que ir�o receber os alunos
		 *                  aprovados, reprovados e em recupera��o.
		 * 
		 */

		ArrayList<String> alunosAprovados = new ArrayList<String>();
		ArrayList<String> alunosReprovados = new ArrayList<String>();
		ArrayList<String> alunosRecuperacao = new ArrayList<String>();

		/**
		 * @param While - Todo o corpo do c�digo est� envolvido em um m�todo while, esse
		 *              m�todo permite declarar uma condi��o para loop enquanto n�o for
		 *              atendida.
		 * 
		 */

		while (true) {

			/**
			 * @param nomeAluno - Declara��o das informa��es do aluno, no caso s�
			 *                  implementei o nome.
			 * @param nota1,    nota2, nota3 e nota4 - Notas dos bimestres, calculamos uma
			 *                  mat�ria por vez. Utilizei a classe Joption para receber a
			 *                  entrada de dados de forma din�mica, o m�todo me retorna uam
			 *                  String ent�o precisei usar um parseDouble para fazer a
			 *                  convers�o.
			 */

			String nomeAluno = JOptionPane.showInputDialog("Digite o nome do Aluno.");
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do 1� bimestre: "));
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do 2� bimestre: "));
			double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do 3� bimestre: "));
			double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do 4� bimestre: "));

			/**
			 * @param calcMedia - m�todo que recebe as notas em double.
			 * @return retorna a m�dia, soma as notas e divide por 4 para chegar � m�dia.
			 */

			double calcMedia = (nota1 + nota2 + nota3 + nota4) / 4;

			/**
			 * @param If - m�todos if que verificam se o aluno est� aprovado, reprovado ou
			 *           em recupera��o.
			 * @return retorna a resposta dependendo da m�dia total e insere o aluno em uma
			 *         lista conforme sua condi��o.
			 */

			if (calcMedia >= 60) {
				JOptionPane.showMessageDialog(null, "Aluno aprovado. Media: " + calcMedia);
				alunosAprovados.add(nomeAluno);
			} else if (calcMedia <= 59 && calcMedia >= 40) {
				JOptionPane.showMessageDialog(null, "Aluno de recupera��o. Media: " + calcMedia);
				alunosRecuperacao.add(nomeAluno);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno reprovado. Media: " + calcMedia);
				alunosReprovados.add(nomeAluno);
			}
			
			/**
			 * @param respostaAprovado - imprime a lista de aprovados
			 * @return caso o usu�rio escolha por "sim" na caixa de di�logo da classe JOption que aparecer
			 * a lista � exibida na tela.
			 */
			
			int respostaAprovado = JOptionPane.showConfirmDialog(null, "Gostaria de imprimir a lista de aprovados?");
			if (respostaAprovado == 0) {
				for (int a = 0; a < alunosAprovados.size(); a++) {
					JOptionPane.showMessageDialog(null, alunosAprovados.get(a));
				}
			}
			
			/**
			 * @param respostaRecuperacao - imprime a lista de recupera��o
			 * @return caso o usu�rio escolha por "sim" na caixa de di�logo da classe JOption que aparecer
			 * a lista � exibida na tela.
			 */
			
			int respostaRecuperacao = JOptionPane.showConfirmDialog(null,
					"Gostaria de imprimir a lista de recupera��o?");
			if (respostaRecuperacao == 0) {
				for (int r = 0; r < alunosRecuperacao.size(); r++) {
					JOptionPane.showMessageDialog(null, alunosRecuperacao.get(r));
				}
			}
			
			/**
			 * @param respostaRprovados - imprime a lista de reprovados
			 * @return caso o usu�rio escolha por "sim" na caixa de di�logo da classe JOption que aparecer
			 * a lista � exibida na tela.
			 */
			
			int respostaReprovado = JOptionPane.showConfirmDialog(null, "Gostaria de imprimir a lista de reprovados?");
			if (respostaReprovado == 0) {
				for (int re = 0; re < alunosReprovados.size(); re++) {
					JOptionPane.showMessageDialog(null, alunosReprovados.get(re));
				}
			}
			
			/**
			 *@param If - encerra a reprodu��o do c�digo caso o usu�rio tenha impresso as 3 listas
			 *@return fechamento do m�todo while junto com um if que encerra o programa, s� em caso de impress�o 
			 *das 3 listas, caso n�o haja impress�o das 3 listas, o m�todo continua em loop, tudo de novo. 
			 */
			
			if (respostaAprovado == 0 && respostaReprovado == 0 && respostaRecuperacao == 0) {
				break;
			}
		}
	}
}