package br.com.heranca.polimorfismo.classe;

public class Aluno extends Pessoa {

	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;

	
	
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", numeroRG=" + numeroRG + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai="
				+ nomePai + "]";
	}

	@Override
	public double salario() {
		return 400;
	}
	
}
