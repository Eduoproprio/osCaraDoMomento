package basic;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Swing_test implements ActionListener {

	private TextField campoFucionario;
	private TextField campoVendas;
	private TextField campoComissao;
	private TextField campoSalario;
	private TextField campoSalarioComissao;

	public static void main(String[] args) {
		new Swing_test();
	}

	public Swing_test() {

		// Criando o Frame
		JFrame frame = new JFrame("Swing Test");
		frame.setSize(400, 400);

		// AMT -> JavaFX
		JPanel panel = new JPanel();
		// 4 limhas, 2 colubnnas, tamnho, tamanho
		panel.setLayout(new GridLayout(9, 2, 10, 10));

		// <Label>
		JLabel labelNome = new JLabel("Nome do Funcionário:");
		campoFucionario = new TextField();

		JLabel labelVendas = new JLabel("Total de Vendas:");
		campoVendas = new TextField();

		JLabel labelComissaoPonto = new JLabel("Comissão:");

		JRadioButton opcao1 = new JRadioButton("1%");
		JRadioButton opcao2 = new JRadioButton("2%");
		JRadioButton opcao3 = new JRadioButton("3%");
		JRadioButton opcao4 = new JRadioButton("4%");

		JLabel labelComissao = new JLabel("Valor da Comis5são:");
		campoComissao = new TextField();

		JLabel labelSalario = new JLabel("Salário:");
		campoSalario = new TextField();

		JLabel labelSalarioComissao = new JLabel("Salário + Comissão:");
		campoSalarioComissao = new TextField();

		// Botão de calcular
		JButton calcular = new JButton("Calcular");
		calcular.addActionListener(this);

		panel.add(labelNome);
		panel.add(campoFucionario);

		panel.add(new JLabel(" "));

		panel.add(labelVendas);
		panel.add(campoVendas);
		panel.add(new JLabel(" "));

		panel.add(labelComissaoPonto);

		panel.add(new JLabel(" "));
		panel.add(new JLabel(" "));
		panel.add(opcao1);
		panel.add(opcao2);

		panel.add(new JLabel(" "));

		panel.add(opcao3);
		panel.add(opcao4);
		panel.add(new JLabel(" "));

		panel.add(labelComissao);
		panel.add(campoComissao);
		panel.add(new JLabel(" "));

		panel.add(labelSalario);
		panel.add(campoSalario);
		panel.add(new JLabel(" "));

		panel.add(labelSalarioComissao);
		panel.add(campoSalarioComissao);
		panel.add(new JLabel(" "));

		panel.add(calcular);

		frame.add(panel);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
