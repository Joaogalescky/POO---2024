package classeEmprestimo;

public class EmprestimoTA extends Emprestimo {
	private float ta;

	EmprestimoTA(float s, int n, float j, float ta) {
		super(s, n, j);
		this.ta = ta;
	}

	public float getTa() {
		return ta;
	}

	public float proximaParcela() {
		float pp = super.proximaParcela();
		if (pp > 0) {
			pp += ta;
		}
		return pp;
	}
}