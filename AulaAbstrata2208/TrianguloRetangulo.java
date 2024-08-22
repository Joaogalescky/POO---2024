package classeAbstrata;

public class TrianguloRetangulo extends Poligono {

	public TrianguloRetangulo(int altura, int largura) {
		super(altura, largura);
	}

	public float getArea() {
		return getAltura() * getLargura() / 2;
	}
}
