package br.dev.david.tarefas.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	public void criarTela() {
		
		JFrame tela = new JFrame("Gerenciador de Tarefas");
		tela.setSize(600, 400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		
		Container painel = tela.getContentPane();

		labelTitulo = new JLabel ("Gerenciamento de Tarefas");
		labelTitulo.setFont(new Font ("arial", Font.BOLD, 28));
		labelTitulo.setForeground(new Color(100, 0, 100));
		labelTitulo.setBounds(100, 20, 400, 20);	
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);

		btnFuncionarios = new JButton("Funcionários");
		btnFuncionarios.setBounds(80, 100, 200, 40);
		
		btnFuncionarios.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new FuncionariosListaFrame();
				
			}
		});
		
		btnTarefas = new JButton("Tarefas");
		btnTarefas.setBounds(305, 100, 200, 40);
		
		btnTarefas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new TarefasListaFrame();
				
			}
		});
		
		
		
		painel.add(labelTitulo);
		painel.add(btnFuncionarios);
		painel.add(btnTarefas);
		
		
		tela.setVisible(true);
	}

}
