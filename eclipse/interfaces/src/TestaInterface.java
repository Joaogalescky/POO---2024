package interfaces.src;

public class TestaInterface {

	public static void main(String[] args) {
		Geometria g = new Retangulo(6, 10);
		
		System.out.println("Perimetro do Retângulo: " + g.getPerimetro());
		System.out.println("Área do Retângulo: " + g.getArea());
		
		g = new Circulo(8);
		
		System.out.println("Perimetro do Círculo: " + g.getPerimetro());
		System.out.println("Área do Círculo: " + g.getArea());
		
	}
}