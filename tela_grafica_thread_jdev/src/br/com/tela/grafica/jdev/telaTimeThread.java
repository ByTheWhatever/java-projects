package br.com.tela.grafica.jdev;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

public class telaTimeThread extends JDialog {

	
	private JPanel jPanel = new JPanel(new GridBagLayout());
	private JLabel descricaoHora = new JLabel("Time Thread 1");	
	
	
	
	public telaTimeThread() {
		setTitle("Tela de Time com Thread");
		setSize(new DimensionUIResource(360, 360));
		setLocationRelativeTo(null);
		setResizable(false);

		/* Primeira parte configuração da tela concluída */

		//-----------------------------------------------------------------

		GridBagConstraints gridBagConstraints = new GridBagConstraints(); /*Controlador de posicionamento de componentes*/
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		descricaoHora.setPreferredSize(new DimensionUIResource(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		// ----------
		add(jPanel, BorderLayout); // erro aqui, sempre que preciso fazer um import preciso fazer manualmente 
								   // pra funcionar
		// ----------
		
		setVisible(true);
		/* Torna a tela visível para o usuário, sempre será o último comando a ser
		  executado */
		
		
	}

}
