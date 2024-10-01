package AulaAbstrata2208;

public class RetanguloAbstrato extends PoligonoAbstrato {

	public RetanguloAbstrato(int altura, int largura) {
		super(altura, largura);
	}

	@Override
	public float getArea() {
		return getAltura() * getLargura();
	}
}