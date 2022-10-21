package br.com.medianotasteste;

public class Teste_medias_if_else {

	public static void main(String[] args) {

		double nota1 = 30;
		double nota2 = 90;
		double nota3 = 20;
		double nota4 = 0;
		double mediaFinal = 0;

		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

		if (mediaFinal >= 60) {
			System.out.println("Prabéns você foi aprovado. Média final - " + mediaFinal);
		} else if (mediaFinal >= 40 & mediaFinal <= 59) {
			System.out.println("Você está de recuperação. Média final - " + mediaFinal);
		} else {
			System.out.println("Você foi reprovado. Média final - " + mediaFinal);
		}

	}

}
