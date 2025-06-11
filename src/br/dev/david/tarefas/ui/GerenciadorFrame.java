package br.dev.david.tarefas.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GerenciadorFrame {

	private JLabel labelTitulo;
	
	private JButton btnFuncionarios;
	private JButton btnTarefas;
	
	public GerenciadorFrame() {
		criarTela();
	}
	
	private void criarTela() {
		JFrame tela = new JFrame();
		tela.setSize(600, 400);
		tela.setResizable(false);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		
		Container painel = tela.getContentPane();

		labelTitulo = new JLabel ("Gerenciamento de Tarefas");
		labelTitulo.setFont(new Font ("arial", Font.BOLD, 28));
		labelTitulo.setForeground(new Color(100, 0, 100));
		labelTitulo.setBounds(100, 10, 400, 40);	
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);

		btnFuncionarios = new JButton("Funcionários");
		btnFuncionarios.setBounds(10, 410, 150, 40);
		
		
		
		
		painel.add(labelTitulo);
		painel.add(btnFuncionarios);
		painel.add(btnTarefas);
		
		
		tela.setVisible(true);
	}

}
