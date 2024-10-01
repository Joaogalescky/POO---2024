package interfaces.src;

public class Retangulo implements Geometria {

	private int altura;
	private int largura;

	public Retangulo(int altura, int largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public int getLargura() {
		return largura;
	}

	@Override
	public float getPerimetro() {
		return 2 * (altura + largura);
	}

	@Override
	public float getArea() {
		return altura * largura;
	}
	
	public boolean mesmaProporcao(Retangular comparar) {
		return (largura / altura == comparar.getLargura() / comparar.getAltura());
	}
}