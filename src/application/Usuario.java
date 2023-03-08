package application;

import entities.SmartTv;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		System.out.println("Volume Atual: " + smartTv.volume);
		
		System.out.println("Canal Atual: " + smartTv.canal);
		
		smartTv.mudarCanal(13);
		System.out.println("Canal Atual: " + smartTv.canal);
		
		System.out.println("TV está ligada? " + smartTv.ligada);
		System.out.println("Qual canal? " + smartTv.canal);
		System.out.println("Qual volume? " + smartTv.volume);

		smartTv.ligar();
		System.out.println("Novo Status - TV está ligada? " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo Status - TV está ligada? " + smartTv.ligada);
		
		
	}

}
