package construtor;

public class Main {

	public static void main(String[] args) {
		Televisor obj1 = new Televisor(1, 3);
		Televisor obj2 = new Televisor(5, 6);
		Televisor obj3 = new Televisor(2, 12);

		System.out.println("== Televisão 1 ===");
		obj1.mostrar();
		System.out.println();
		System.out.println("== Televisão 2 ===");
		obj2.mostrar();
		System.out.println();
		System.out.println("== Televisão 3 ===");
		obj3.mostrar();

//		obj1.setVolume(15);
//		obj1.setCanal(10);
//		obj1.mostrar();
	}
}
