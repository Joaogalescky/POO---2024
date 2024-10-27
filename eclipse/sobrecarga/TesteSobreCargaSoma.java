package sobrecarga;

public class TesteSobreCargaSoma {

	public static void main(String[] args) {
		SobreCargaSoma obj1 = new SobreCargaSoma();
		SobreCargaSoma obj2 = new SobreCargaSoma();
		SobreCargaSoma obj3 = new SobreCargaSoma();

		System.out.println("A soma de dois números é?: " + obj1.soma(1, 2));
		System.out.println("A soma de três números é?: " + obj2.soma(1, 2, 4));
		System.out.println("A soma de dois números é?: " + obj3.soma(1, 2, 4, 7));
	}
}
