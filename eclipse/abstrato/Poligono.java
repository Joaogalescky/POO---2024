package AulaAbstrata2208;

public class Poligono {
	private int largura;
	private int altura;
	private float area;

	public Poligono(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public float getArea() {
		return 0;
	}

	public void setArea(float area) {
		this.area = area;
	}
}