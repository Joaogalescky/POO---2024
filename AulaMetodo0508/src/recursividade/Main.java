package recursividade;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Recursao recursao = new Recursao();
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		System.out.println("O fatorial de: " + n + " é " + recursao.fatorial(n)); // fatorial de 4: 1 * 2 * 3 * 4 --> 24
	}
}
