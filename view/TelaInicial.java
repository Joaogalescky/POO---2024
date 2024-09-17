package view;

import java.awt.GridLayout;

// Importações
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import componente.grafico.Grafico;
import componente.sequencia.ProgressaoGeometrica;

public class TelaInicial extends JFrame {

	// Variáveis
	private static final long serialVersionUID = 1634685751155077529L;
	private JTextField txtCaracter, txtN, txtVi, txtRz;
	private JCheckBox chkPreenchido;
	private JTextArea areaGrafica;

	private Grafico grafico;
	private ProgressaoGeometrica progressao;

	// Métodos
	public TelaInicial() {
		setTitle("Gerador de Gráfico");
		setSize(400, 400); // Pixel
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		grafico = new Grafico();
		progressao = new ProgressaoGeometrica();
		grafico.connect(progressao);

		JPanel painelEntrada = new JPanel(new GridLayout(5, 2));

		painelEntrada.add(new JLabel("Caracter"));
		txtCaracter = new JTextField();
		painelEntrada.add(txtCaracter);

		painelEntrada.add(new JLabel("Número de Linhas"));
		txtN = new JTextField();
		painelEntrada.add(txtN);

		painelEntrada.add(new JLabel("Valor inicial (vi):"));
		txtVi = new JTextField();
		painelEntrada.add(txtVi);

		painelEntrada.add(new JLabel("Razão (rz):"));
		txtRz = new JTextField();
		painelEntrada.add(txtRz);

		painelEntrada.add(new JLabel("Preenchido"));
		chkPreenchido = new JCheckBox();
		chkPreenchido.setSelected(true);
		painelEntrada.add(chkPreenchido);
	}
	
	// Iniciador
	public static void main(String[] args) {
		new TelaInicial().setVisible(true);
	}
}
