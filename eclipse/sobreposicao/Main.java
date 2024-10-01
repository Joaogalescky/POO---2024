package sobreposicao;

public class Main {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Moacir", 5000, 1000, "TI");
		Funcionario funcionario = new Funcionario("Roberto", 2500);

		System.out.println("Salario total do gerente:" + gerente.calcularSalarioTotal()); //
		System.out.println("Salario total do funcionario:" + funcionario.calcularSalarioTotal()); //
	}
}
