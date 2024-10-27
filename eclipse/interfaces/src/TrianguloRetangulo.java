package interfaces.src;

public class TrianguloRetangulo implements Retangular {
	private int altura;
	private int largura;

	public TrianguloRetangulo(int altura, int largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public float getArea() {
		return getAltura() * getLargura() / 2;
	}

	public int getLargura() {
		return largura;
	}

	public int getAltura() {
		return altura;
	}
	
	public boolean mesmaProporcao(Retangular comparar) {
		return (largura / altura == comparar.getLargura() / comparar.getAltura());
	}
}
