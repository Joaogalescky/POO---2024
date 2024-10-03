package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Importações
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TelaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;

	// Variáveis
	private JMenuBar barMenu;
	private JMenu menuCadastro;
	private JMenu menuCompra;
	private JMenu menuAjuda;
	private JMenuItem itemMenuCliente;
	private JMenuItem itemMenuFornecedor;
	private JMenuItem itemMenuProduto;
	private JMenuItem itemMenuSobre;
	private JMenuItem itemMenuSair;

	public TelaPrincipal() {
		super("Loja IFPR"); // chamando super construtor

		// Instânciando
		barMenu = new JMenuBar();
		menuCadastro = new JMenu("Cadastro");
		menuCompra = new JMenu("Compra");
		menuAjuda = new JMenu("Ajuda");

		itemMenuCliente = new JMenuItem("Cliente");
		itemMenuFornecedor = new JMenuItem("Fornecedor");
		itemMenuProduto = new JMenuItem("Produto");
		itemMenuSobre = new JMenuItem("Sobre");
		itemMenuSair = new JMenuItem("Sair");

		// Adicionando botões
		setJMenuBar(barMenu);
		barMenu.add(menuCadastro);
		barMenu.add(menuCompra);
		barMenu.add(menuAjuda);

		menuCadastro.add(itemMenuCliente);
		menuCadastro.add(itemMenuFornecedor);
		menuCadastro.add(itemMenuProduto);
		menuAjuda.add(itemMenuSobre);
		menuAjuda.add(itemMenuSair);

		// Ações
		itemMenuSobre.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent sobre) {
				JOptionPane.showMessageDialog(TelaPrincipal.this, "Este é um exemplo\n" + " de uso de menus.");
			}
		});
		
		itemMenuSobre.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent sair) {
				System.exit(0);
			}
		});
		
		itemMenuSobre.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent cliente) {
				TelaCadCli cadClientes = new TelaCadCli();
			}
		});
	}
}