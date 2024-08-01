package metodo;

public class ExMetodoHora2 {

	private int hor, min, seg;

	public void setHoras(int hor) {
		if (hor >= 0 && hor < 24)
			this.hor = hor;
	}

	public void setMinutos(int min) {
		if (min >= 0 && hor < 60)
			this.min = min;
	}

	public void setSegundos(int seg) {
		if (seg >= 0 && seg < 60)
			this.seg = seg;
	}

	public int getHoras() {
		return hor;
	}

	public int getMinutos() {
		return min;
	}

	public int getSegundos() {
		return seg;
	}

	public void setHorario(int hor, int min, int seg) {
		setHoras(hor);
		setMinutos(min);
		setSegundos(seg);
	}

	public String exibir() {
		return String.format("%02d:%02d:%02d", getHoras(), getMinutos(), getSegundos());
	}
}
