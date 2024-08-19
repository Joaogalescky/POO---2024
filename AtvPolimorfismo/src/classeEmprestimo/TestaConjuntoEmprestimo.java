package classeEmprestimo;

public class TestaConjuntoEmprestimo {
	public static void main(String[] args) {
		ConjuntoEmprestimos ce = new ConjuntoEmprestimos(5);

		ce.adicionaEmprestimo(new Emprestimo(200, 3, 1));
		ce.adicionaEmprestimo(new EmprestimoTA(500, 4, 2, 15));
		ce.adicionaEmprestimo(new Emprestimo(300, 2, 1));
		ce.adicionaEmprestimo(new Emprestimo(450, 2, 1));
		ce.adicionaEmprestimo(new EmprestimoTA(700, 2, 3, 10));

		boolean status;

		do {
			status = ce.proximasParcelas();
		} while (status);
	}
}
