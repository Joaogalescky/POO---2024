package eletrodomesticos;

public class UsaTelevisor {

	public static void main(String[] args) {
		Televisor tv1 = new Televisor();
		
		tv1.canal = 10;
		tv1.volume = 15;
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		tv1.trocarCanal(7);
		tv1.mostrar();
	}
}
