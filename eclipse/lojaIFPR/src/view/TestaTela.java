package view;

import javax.swing.JFrame;

public class TestaTela {

	public static void main(String[] args) {
		TelaPrincipal testaTela = new TelaPrincipal();
		
		testaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testaTela.setSize(500,300);
		testaTela.setVisible(true);
	}
}

