package sobreposicao;

public class Gerente extends Funcionario {
	private double bonus;
	private String departamento;

	public Gerente(String nome, double salarioBase, double bonus, String departamento) {
		super(nome, salarioBase);
		this.bonus = bonus;
		this.departamento = departamento;
	}

	@Override
	public double calcularSalarioTotal() {
		return super.calcularSalarioTotal() + bonus;
	}
}
