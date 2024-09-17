package AulaAbstrata2208;

public class TrianguloRetanguloAbstrato extends PoligonoAbstrato {

	public TrianguloRetanguloAbstrato(int altura, int largura) {
		super(altura, largura);
	}

	public float getArea() {
		return getAltura() * getLargura() / 2;
	}
}
