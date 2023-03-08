package entities;

public class SmartTv {

	public boolean ligada = false;
	public int canal = 1;
	public int volume = 25;
	
	public void mudarCanal (int novoCanal) {
		canal = novoCanal;
	}
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando o volume para: " + volume);
	}
	
	public void diminuirVolume() {
		volume--;
		System.out.println("Dimimuindo o volume para: " + volume);
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	
}
