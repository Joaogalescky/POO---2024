package construtor;

public class Televisor {
	private int volume, canal;

	public Televisor() {
	}

	public Televisor(int volume) {
		this.volume = volume;
	}

	public Televisor(int volume, int canal) {
		this.volume = volume;
		this.canal = canal;
	}

//	public int getVolume() {
//		return volume;
//	}
//
//	public void setVolume(int volume) {
//		this.volume = volume;
//	}
//
//	public int getCanal() {
//		return canal;
//	}
//
//	public void setCanal(int canal) {
//		this.canal = canal;
//	}

	public void mostrar() {
		System.out.println("Volume: " + volume + "\nCanal: " + canal);
	}
}
