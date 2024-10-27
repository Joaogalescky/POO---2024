package metodo;

public class MetodoHora {

	public int hor, min, seg;

	public void setHorario(int h, int m, int s) {
		hor = h;
		min = m;
		seg = s;
	}

	public String teste() {
		String hora = hor + ":" + min + ":" + seg;
		return hora;
	}
}
