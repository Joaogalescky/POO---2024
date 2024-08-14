package hierarquia;

public class Main {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();

		funcionario.setNome("Moacir");
		funcionario.setRg("25.654.678-6");
		funcionario.setCartao("RH845");

		System.out.println("Funcionario: " + funcionario.getNome());
		System.out.println("RG: " + funcionario.getRg());
		System.out.println("Cartão: " + funcionario.getCartao());
	}
}
