package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * MainGUI
 */
public class MainGUI extends JFrame {
    private static final long serialVersionUID = 7352018073986710489L;

    // Construtor
    public MainGUI() {
        setTitle("Exemplo de Eventos em Swing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurando o layout
        setLayout(new FlowLayout());

        // Componentes
        JButton button = new JButton("Clique em mim");
        JLabel label = new JLabel("Texto inicial");
        JTextField textField = new JTextField(10);
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);

        // Componentes no painel
        add(button);
        add(label);
        add(textField);
        add(comboBox);

        // Eventos
        // Clique no botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Botão clicado!");
            }
        });

        // Alteração no campo de texto
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("Texto: " + textField.getText());
            }
        });

        // Seleção na comboBox
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                label.setText("Selecionado: " + selected);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }
    
}