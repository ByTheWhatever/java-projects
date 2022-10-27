package br.com.livepoo.executavel;

import java.math.BigDecimal;

import br.com.livepoo.classes.Produto;
import br.com.livepoo.classes.Venda;

public class Executavel {

	public static void main(String[] args) {

		
		Produto produto1 = new Produto();
		produto1.setId(1);
		produto1.setNomeProduto("T�nis Mizuno");
		produto1.setValorProduto(200.00);
		
		Produto produto2 = new Produto();
		produto2.setId(2);
		produto2.setNomeProduto("Tenis Asics");
		produto2.setValorProduto(219.00);
		
		Venda venda = new Venda();
		venda.setId(1);
		venda.setDescricaoVenda("Promo��o de volta �s aulas");
		venda.setEnderecoEntrega("Rua Ab�lio, n�mero 450");
		venda.setNomeCliente("Marcos");
			
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		
		System.out.println(venda);
		
		System.out.println("Total da venda = " + venda.totalVenda());
		
	}

}
