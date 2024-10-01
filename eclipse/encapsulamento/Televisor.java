package eletrodomesticos;

public class Televisor {
	public int volume;
	public int canal;

	public void aumentarVolume() {
		volume++;
	}

	public void reduzirVolume() {
		volume--;
	}

	public void trocarCanal(int canal) {
		this.canal = canal;
	}

	public void mostrar() {
		System.out.println("Volume: " + volume + "\nCanal: " + canal);
	}
}