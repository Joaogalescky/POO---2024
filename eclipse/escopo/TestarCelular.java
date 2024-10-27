package escopo;

public class TestarCelular {

	public static void main(String[] args) {
		Celular celular1 = new Celular();
		Celular celular2 = new Celular();
		Celular celular3 = new Celular();

		celular1.numero = "45 9999-0001";
		celular1.empresa = "Empresa teste";
		celular2.numero = "45 9999-0002";
		celular2.empresa = "Empresa teste 02";
		celular3.numero = "45 9999-0003";
		celular3.empresa = "Empresa teste 03";

		Celular.empresa = "IFPR - Campus Cascavel";

		System.out.println("Empresa " + celular1.empresa + "\nCelular1: " + celular1.numero + "\nEmpresa "
				+ celular1.empresa + "\nCelular2: " + celular2.numero + "\nEmpresa " + celular2.empresa + "\nCelular3: "
				+ celular3.numero);
	}
}
