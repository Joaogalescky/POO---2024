package classeAbstrata;

public class Retangulo extends Poligono {

	public Retangulo(int altura, int largura) {
		super(altura, largura);
	}

	public float getArea() {
		return getAltura() * getLargura();
	}
}
