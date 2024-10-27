package sobreposicao;

public class Funcionario {
	private String nome;
	private double salarioBase;

	public Funcionario(String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public double calcularSalarioTotal() {
		return salarioBase;
	}
}
