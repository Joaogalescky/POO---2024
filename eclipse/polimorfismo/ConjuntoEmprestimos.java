package classeEmprestimo;

public class ConjuntoEmprestimos {

	Emprestimo vEmprestimo[];

	int corrente = -1;

	public ConjuntoEmprestimos(int qtd) {
		vEmprestimo = new Emprestimo[qtd];
	}

	boolean adicionaEmprestimo(Emprestimo emp) {
		boolean resultado = false;
		if (corrente + 1 < vEmprestimo.length) {
			corrente++;
			vEmprestimo[corrente] = emp;
			resultado = true;
		}
		return resultado;
	}

	boolean proximasParcelas() {
		boolean status = false;
		for (int e = 0; e < vEmprestimo.length; e++) {
			float p = vEmprestimo[e].proximaParcela();
			if (p > 0) {
				status = true;
				System.out.println("Emprestimo " + (e + 1) + ": " + p);
			}
		}
		return status;
	}
}
