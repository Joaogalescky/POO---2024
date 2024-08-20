import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void dadosTempo(String entrada) {
		int p1, p2, p3;

		switch (entrada) {
		case "tempo":
			Tempo tempo = new Tempo();
			tempo.toString();
			break;
		case "data":
			System.out.println("Digite o 1° parametro: ");
			p1 = scanner.nextInt();
			System.out.println("Digite o 2° parametro: ");
			p2 = scanner.nextInt();
			System.out.println("Digite o 3° parametro: ");
			p3 = scanner.nextInt();
			Data data = new Data(p1, p2, p3);
			data.toString();
			break;
		case "horario":
			System.out.println("Digite o 1° parametro: ");
			p1 = scanner.nextInt();
			System.out.println("Digite o 2° parametro: ");
			p2 = scanner.nextInt();
			System.out.println("Digite o 3° parametro: ");
			p3 = scanner.nextInt();
			Horario horario = new Horario(p1, p2, p3);
			horario.toString();
			break;
		default:
			System.out.println("Tipo inexistente");
		}
		scanner.close();
	}

	public static void main(String[] args) {

		System.out.println("Digite um tipo: 'tempo', 'data' ou 'horario'");

		String entrada = scanner.next();

		dadosTempo(entrada);
	}

}
