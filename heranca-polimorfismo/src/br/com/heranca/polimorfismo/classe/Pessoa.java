package br.com.heranca.polimorfismo.classe;

public abstract class Pessoa {

	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String numeroRG;
	protected String numeroCPF;
	protected String nomeMae;
	protected String nomePai;

	public abstract double salario();
	
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNumeroRG() {
		return numeroRG;
	}

	public void setNumeroRG(String numeroRG) {
		this.numeroRG = numeroRG;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	
	public boolean maiorIdade() {
		if (idade >= 18) {
			System.out.println("Maior de 18 anos");
		}else {
			System.out.println("Menor de 18 anos");
		}
		return true;
	} 
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", numeroRG="
				+ numeroRG + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}

}
