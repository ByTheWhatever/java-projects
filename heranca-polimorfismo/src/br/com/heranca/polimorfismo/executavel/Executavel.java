package br.com.heranca.polimorfismo.executavel;

import br.com.heranca.polimorfismo.classe.Aluno;
import br.com.heranca.polimorfismo.classe.Diretor;
import br.com.heranca.polimorfismo.classe.Secretario;

public class Executavel {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("José");
		aluno.setDataNascimento("01/12/1998");
		aluno.setIdade(14);
		
		Diretor diretor = new Diretor();
		diretor.setNumeroRG("123");
		diretor.setTempoDirecao(5);
		diretor.setIdade(38);
		
		Secretario secretario = new Secretario();
		secretario.setIdade(18);
		secretario.setExperiencia("Pleno");

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		aluno.maiorIdade();
		diretor.maiorIdade();
		secretario.maiorIdade();
		
		System.out.println("Salário é: " + aluno.salario());
		System.out.println("Salário é: " + diretor.salario());
		System.out.println("Salário é: " + secretario.salario());
	}


}
