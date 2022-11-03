package br.com.jdev.threads;

import javax.swing.JOptionPane;

public class teste_threads {

	public static void main(String[] args) throws InterruptedException {

		/* Thread processando em paralelo atividade 1 */

		Thread threadTarefa1 = new Thread(thread1);
		threadTarefa1.start(); /* Start liga a thread que fica processando paralelamente por tr�s */

//----------------------------------------------------------------------------------------------------------

		/* Thread processando em paralelo atividade 2 */

		Thread threadTarefa2 = new Thread(thread2);
		threadTarefa2.start(); /* Start liga a thread que fica processando paralelamente por tr�s */

		/* Fim do c�digo em paralelo */

		/* Fluxo do sistema */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");
	}

	private static Runnable thread1=new Runnable(){

	/* Run executa a rotina */
	@Override public void run(){

	/* C�digo da rotina que quero processar em paralelo */
	for(int i=0;i<10;i++){

	System.out.println("Executando algo 10 vezes");try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}}

	}

	};

	private static Runnable thread2 = new Runnable() {
		
		/* Run executa a rotina */
		@Override
		public void run() {
			/* C�digo da rotina que quero processar em paralelo */
			for (int i = 0; i < 10; i++) {

				System.out.println("Executando algo 10 vezes na segunda vez");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	};
	
};
}
