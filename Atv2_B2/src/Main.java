import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void dadosTempo(String entrada) {
		int p1, p2, p3;

		switch (entrada.toLowerCase()) {
			case "tempo":
				Tempo tempo = new Tempo();
				System.out.println("Tempo formatado: " + tempo.toString());
				System.out.println("Tempo em segundos: " + tempo.quantidade());
				break;
			case "data":
				System.out.println("Digite o 1° parametro: ");
				if (!scanner.hasNextInt()) {
					System.out.println("Parâmetros insuficientes. Formato esperado: <tipo> <valor1> <valor2> <valor3>");
					return;
				}
				p1 = scanner.nextInt();
				System.out.println("Digite o 2° parametro: ");
				if (!scanner.hasNextInt()) {
					System.out.println("Parâmetros insuficientes. Formato esperado: <tipo> <valor1> <valor2> <valor3>");
					return;
				}
				p2 = scanner.nextInt();
				System.out.println("Digite o 3° parametro: ");
				if (!scanner.hasNextInt()) {
					System.out.println("Parâmetros insuficientes. Formato esperado: <tipo> <valor1> <valor2> <valor3>");
					return;
				}
				p3 = scanner.nextInt();
				Data data = new Data(p1, p2, p3);
				System.out.println("Data formatada: " + data.toString());
				System.out.println("Data em segundos: " + data.quantidade());
				break;
			case "horario":
				System.out.println("Digite o 1° parametro: ");
				if (!scanner.hasNextInt()) {
					System.out.println("Parâmetros insuficientes. Formato esperado: <tipo> <valor1> <valor2> <valor3>");
					return;
				}
				p1 = scanner.nextInt();
				System.out.println("Digite o 2° parametro: ");
				if (!scanner.hasNextInt()) {
					System.out.println("Parâmetros insuficientes. Formato esperado: <tipo> <valor1> <valor2> <valor3>");
					return;
				}
				p2 = scanner.nextInt();
				System.out.println("Digite o 3° parametro: ");
				if (!scanner.hasNextInt()) {
					System.out.println("Parâmetros insuficientes. Formato esperado: <tipo> <valor1> <valor2> <valor3>");
					return;
				}
				p3 = scanner.nextInt();
				Horario horario = new Horario(p1, p2, p3);
				System.out.println("Horário formatada: " + horario.toString());
				System.out.println("Horário em segundos: " + horario.quantidade());
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
		scanner.close();
	}
}
