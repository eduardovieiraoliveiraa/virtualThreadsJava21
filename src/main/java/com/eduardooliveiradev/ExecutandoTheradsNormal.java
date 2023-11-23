package com.eduardooliveiradev;

import java.time.Duration;

public class ExecutandoTheradsNormal {
	
	public static void main(String[] args) {
		Long tempoInicioExecucao = System.currentTimeMillis();

		for (int i = 0; i < 10; i++) {
			new Processo().executar(i).run();
		}
		
		System.out.println(Duration.ofMillis(System.currentTimeMillis() - tempoInicioExecucao).toSeconds() + " segundos ");
	}

}
