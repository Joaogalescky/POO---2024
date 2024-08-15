package classeEmprestimo;

public class EmprestimoTA extends Emprestimo {
	private float ta;

	EmprestimoTA(int n, float j, float s, float ta) {
		super(n, j, s);
		this.ta = ta;
	}

	public float getTa() {
		return ta;
	}

	public float proximaParcela() {
		float pta = super.proximaParcela();
		if (pta > 0) {
			pta += ta;
		}
		return pta;
	}
}