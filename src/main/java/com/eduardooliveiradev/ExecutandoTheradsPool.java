package com.eduardooliveiradev;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutandoTheradsPool {

	public static void main(String[] args) {
		Long tempoInicioExecucao = System.currentTimeMillis();

		try (ExecutorService executorService = Executors.newFixedThreadPool(1000)) {

			for (int i = 0; i < 50000; i++) {
				Runnable executar = new Processo().executar(i);
				executorService.submit(executar);
			}

		}

		System.out.println(
				Duration.ofMillis(System.currentTimeMillis() - tempoInicioExecucao).toSeconds() + " segundos ");
	}

}
