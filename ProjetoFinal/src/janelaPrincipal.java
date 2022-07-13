import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class janelaPrincipal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaPrincipal window = new janelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public janelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(tabbedPane);
		
		JPanel painelVendaIngressos = new JPanel();
		painelVendaIngressos.setBackground(Color.WHITE);
		tabbedPane.addTab("Venda de Ingressos", null, painelVendaIngressos, null);
		painelVendaIngressos.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 244, 511);
		painelVendaIngressos.add(scrollPane);
		
		JPanel painelGerenciarCatalogo = new JPanel();
		painelGerenciarCatalogo.setBackground(Color.WHITE);
		tabbedPane.addTab("Gerenciar Cat\u00E1logo", null, painelGerenciarCatalogo, null);
		painelGerenciarCatalogo.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 244, 511);
		painelGerenciarCatalogo.add(scrollPane_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(264, 11, 505, 511);
		painelGerenciarCatalogo.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 200, 247);
		panel.add(panel_1);
		
		JLabel labelAno = new JLabel("Ano:");
		labelAno.setBounds(220, 61, 52, 14);
		panel.add(labelAno);
		
		JLabel labelTitulo = new JLabel("T\u00EDtulo:");
		labelTitulo.setBounds(220, 11, 52, 14);
		panel.add(labelTitulo);
		
		JLabel labelDiretor = new JLabel("Diretor:");
		labelDiretor.setBounds(220, 36, 52, 14);
		panel.add(labelDiretor);
		
		JLabel labelDuracao = new JLabel("Dura\u00E7\u00E3o:");
		labelDuracao.setBounds(220, 86, 52, 14);
		panel.add(labelDuracao);
		
		textField = new JTextField();
		textField.setBounds(282, 11, 213, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(282, 36, 213, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(282, 61, 213, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(282, 86, 213, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel painelGerenciarSessoes = new JPanel();
		painelGerenciarSessoes.setBackground(Color.WHITE);
		tabbedPane.addTab("Gerenciar Sess\u00F5es", null, painelGerenciarSessoes, null);
		painelGerenciarSessoes.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 11, 244, 511);
		painelGerenciarSessoes.add(scrollPane_2);
	}
}
