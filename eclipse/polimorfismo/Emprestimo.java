package classeEmprestimo;

public class Emprestimo {
	private int n;
	private float j;
	private int corrente;
	private float p;

	public Emprestimo(float s, int n, float j) {
		this.n = n;
		this.j = j;
		this.corrente = 1;
		this.p = s;
	}

	public float proximaParcela() {
		float retorno = p;
		corrente++;
		if (corrente <= n) {
			p = p + (p * (j / 100));
		} else {
			p = 0;
		}
		return retorno;
	}
}
