package interfaces.src;

public class Circulo implements Geometria {
	private int raio;

	public Circulo(int raio) {
		this.raio = raio;
	}

	public int getRaio() {
		return raio;
	}

	@Override
	public float getPerimetro() {
		return (float) (2 * Math.PI * raio);
	}

	@Override
	public float getArea() {
		return (float) (Math.PI * Math.pow(raio, 2));
	}
}
