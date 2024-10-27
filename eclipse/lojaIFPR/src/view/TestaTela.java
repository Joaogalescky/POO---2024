package eclipse.lojaIFPR.src.view;

import javax.swing.JFrame;

public class TestaTela {

	public static void main(String[] args) {
		TelaPrincipal testeTela = new TelaPrincipal();
		
		testeTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testeTela.setSize(500, 300);
		testeTela.setVisible(true);
	}

}
