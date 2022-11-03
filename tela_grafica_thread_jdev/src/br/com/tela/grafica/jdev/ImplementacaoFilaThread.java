package br.com.tela.grafica.jdev;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilhaThread) {
		pilha_filha.add(objetoFilhaThread);
	}

	@Override
	public void run() {
		

		while(true) {
		
			Iterator iteracao = pilha_filha.iterator();
		synchronized (iteracao) { /*Bloquear o acesso a esta lista por outros processos*/
			
			
			while (iteracao.hasNext())
				; /* Enquanto houver dados na lista irá processar */

			ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); /* Pega o objeto atual, faz o processo e remove */

			/* Processar 10.000 notas fiscais */
			/* Gerar uma lista enorme de pdf */
			/* Gerar um envio em massa de e-mail */


			System.out.println(processar.getEmail());
			System.out.println(processar.getNome());
			iteracao.remove();

			try {
				Thread.sleep(100); /* Dar um tempo para descarga de memória */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		try {
			Thread.sleep(1000); /* Após processar toda a lista, dar um tempo para limpeza de memória */
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	}

}
