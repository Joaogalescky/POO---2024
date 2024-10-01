package AulaAbstrata2208;

public abstract class PoligonoAbstrato {
	private int largura;
	private int altura;
	private float area;

	public PoligonoAbstrato(int largura, int altura) {
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

	public abstract float getArea();

	public void setArea(float area) {
		this.area = area;
	}

}
