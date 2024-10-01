package metodo;

public class TesteExMetodoHora2 {

	public static void main(String[] args) {
		ExMetodoHora2 obj1 = new ExMetodoHora2();

//		obj1.setHoras(20);
//		obj1.setMinutos(32);
//		obj1.setSegundos(12);

		obj1.setHorario(20, 32, 12);

		System.out.println(obj1.exibir());
	}
}
