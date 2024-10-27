package sobrecarga;

public class SobreCargaSoma {

	public int soma(int w, int x) {
		return w + x;
	}

	public int soma(int w, int x, int z) {
		return w + x + z;
	}

	public int soma(int w, int x, int z, int v) {
		return w + x + z + v;
	}
}
