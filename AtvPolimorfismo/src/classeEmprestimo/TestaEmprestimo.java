package classeEmprestimo;

public class TestaEmprestimo {
	public static void main(String[] args) {
		
		Emprestimo empSTA = new Emprestimo(10500f, 60, 15);
		EmprestimoTA empCTA = new EmprestimoTA(25800f, 48, 11, 50);

		int i = 1;

		float sta = empSTA.proximaParcela();
		float cta = empCTA.proximaParcela();

		while (sta > 0 || cta > 0) {
			if (sta > 0)
				System.out.println("Emprestimo sem taxa. \nParcela: " + i + " de: " + sta);
			if (cta > 0) {
				System.out.println("Emprestimo sem taxa. \nParcela: " + i + " de: " + cta);

				sta = empSTA.proximaParcela();
				cta = empCTA.proximaParcela();
				i++;
			}
		}
	}
}
