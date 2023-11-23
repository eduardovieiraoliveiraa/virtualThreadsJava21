package com.eduardooliveiradev;

public class Processo {
	
	public Runnable executar(int processoId) {
		return () ->{
			System.out.println(Thread.currentThread() + " executando processo " + processoId);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			} 
			
			System.out.println(Thread.currentThread() + " finalizando processo " + processoId);
		};
	}

}
