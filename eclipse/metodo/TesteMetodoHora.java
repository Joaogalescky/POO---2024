package metodo;

public class TesteMetodoHora {

	public static void main(String[] args) {
		// ExMetodoHora.setHorario(21, 50, 00);
		// String horario = ExMetodoHora.teste();

		// Criando objeto e instanciando
		ExMetodoHora obj1 = new ExMetodoHora();
		obj1.setHorario(22, 06, 0);
		
		String horario = obj1.teste();
		System.out.println("A hora atual é: " + horario);

		ExMetodoHora obj2 = new ExMetodoHora();
		obj2.setHorario(23, 35, 12);

		String horario2 = obj2.teste();
		System.out.println("A hora atual é: " + horario2);
	}
}
