package br.com.livepoo.classes;

import java.math.BigDecimal;

public class Produto {

	// Atributos da classe Produto
	
	private int id;
	
	private String nomeProduto;
	
	private double valorProduto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	@Override
	public String toString() {
		return "id = " + id + " " + nomeProduto + " Valor do item " + valorProduto + "]";
	}

	
	
	
	
}
