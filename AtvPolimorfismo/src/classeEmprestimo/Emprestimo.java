package classeEmprestimo;

public class Emprestimo {
	private int n;
	private float j;
	private int corrente;
	private float p;

	public Emprestimo(int n, float j, float s) {
		super();
		this.n = n;
		this.j = j;
		this.corrente = 1;
		this.p = s;
	}

	public float proximaParcela() {
		corrente++;
		if (corrente <= n) {
			p = p + (p * (j / 100));
		} else {
			p = 0;
		}
		float retorno = p;
		return retorno;
	}
}
