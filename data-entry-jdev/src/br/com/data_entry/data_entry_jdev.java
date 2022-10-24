package br.com.data_entry;

import javax.swing.JOptionPane;

public class data_entry_jdev {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("INFORME A QUANTIDADE DE CARROS");
		String vendedor = JOptionPane.showInputDialog("INFORME A QUANTIDADE DE VENDEDORES");
	
		double carrosNumero = Double.parseDouble(carros);
		double vendedorNumero = Double.parseDouble(vendedor);
		
		int divisao = (int) carrosNumero / (int) vendedorNumero;
		
		double restoDivisao = carrosNumero % vendedorNumero;
		
		int respResultDivisao = JOptionPane.showConfirmDialog(null, "Deseja ver a divisão para cada vendedor?");
		if (respResultDivisao == 0) {
			JOptionPane.showMessageDialog(null, "Quantidade de carros para cada vendedor é: " + divisao);
		}
		
		respResultDivisao = JOptionPane.showConfirmDialog(null, "Deseja ver também quantos ficaram em estoque?");
		if (respResultDivisao == 0) {
			JOptionPane.showConfirmDialog(null,"Quantidade de carros em estoque é: " + restoDivisao);
		}
		
	}

}
