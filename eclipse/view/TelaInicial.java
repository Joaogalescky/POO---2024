package view;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
// Importações
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import componente.grafico.Grafico;
import componente.sequencia.ProgressaoGeometrica;

public class TelaInicial extends JFrame {

	// Variáveis
	private static final long serialVersionUID = 1L;
	private JTextField txtCaracter, txtN, txtVi, txtRz;
	private JCheckBox chkPreenchido;
	private JTextArea areaGrafico;
	private JButton btnGrafico;

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
	
		// Painel de Entrada
		JPanel painelEntrada = new JPanel(new GridLayout(5,2));
		painelEntrada.add(new JLabel("Caractere:"));
		txtCaracter = new JTextField();
		painelEntrada.add(txtCaracter);
		
		painelEntrada.add(new JLabel("Número de Linhas (n):"));
		txtN = new JTextField();
		painelEntrada.add(txtVi);
		
		painelEntrada.add(new JLabel("Razão:"));
		txtRz = new JTextField();
		painelEntrada.add(txtRz);
		
		painelEntrada.add(new JLabel("Preenchido:"));
		chkPreenchido = new JCheckBox();
		chkPreenchido.setSelected(true);
		painelEntrada.add(chkPreenchido);
		
		// Botão para gerar o gráfico
		btnGrafico = new JButton("Gerar Gráfico");
		btnGrafico.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gerarGrafico();
			}
		});
		
		// Área de texto para exibir o gráfico
		areaGrafico = new JTextArea(10,30);
		areaGrafico.setFont(new Font("Monospaced", Font.PLAIN,12));
		areaGrafico.setEditable(false);
		
		// Painel Principal
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(txtCaracter.getText().charAt(0));
		painelPrincipal.
		
		// Limpar 
		areaGrafico.setText()
				
		// Gerar o gráfico e exibir na área de texto
		StringBuilder graficoText = new StringBuilder();
		int value = progressao.primeiro();
		
		}
		gra
		va
	}
		
		// Exibir o gráfico na interface
		areaGrafico.setText(graficoTexto.toString());
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {

			}
		});
	}
}