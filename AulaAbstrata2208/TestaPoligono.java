package classeAbstrata;

public class TestaPoligono {

	public static void main(String[] args) {
//		Poligono tr = new TrianguloRetangulo(6, 10);
//		Poligono rt = new Retangulo(6, 10);
//		Poligono po = new Poligono(6, 10);
//
//		System.out.println("Área do triângulo retângulo: " + tr.getArea());
//		System.out.println("Área do retângulo: " + rt.getArea());
//		System.out.println("Área do poligono: " + po.getArea());

		PoligonoAbstrato tr = new TrianguloRetanguloAbstrato(6, 10);
		PoligonoAbstrato rt = new RetanguloAbstrato(6, 10);

		System.out.println("Área do triângulo retângulo: " + tr.getArea());
		System.out.println("Área do retângulo: " + rt.getArea());
	}
}