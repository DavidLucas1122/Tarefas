package br.dev.david.tarefas.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TarefasListaFrame {

	private JLabel labelTitulo;
	
	private JTable tabelaTarefas;
	private DefaultTableModel modelTarefas;
	private JScrollPane scrollTarefas;
	private JButton btnNovaTarefa;
	private JFrame tela;
	
	private String[] colunas = {"CÓDIGO", "NOME", "RESPONSÁVEL"};

	TarefasListaFrame() {
		criarTela();
	}

	private void criarTela() {

		JFrame tela = new JFrame("Lista de Tarefas");
		tela.setSize(600,500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		Container painel = tela.getContentPane();
		
		labelTitulo = new JLabel ("Cadastro de Tarefas");
		labelTitulo.setFont(new Font ("arial", Font.BOLD, 28));
		labelTitulo.setForeground(new Color(100, 0, 100));
		labelTitulo.setBounds(10, 10, 400, 40);
		
		modelTarefas = new DefaultTableModel(colunas, 1);
		tabelaTarefas = new JTable(modelTarefas);
		scrollTarefas = new JScrollPane(tabelaTarefas);
		scrollTarefas.setBounds(10, 60, 580, 340);
		
		btnNovaTarefa = new JButton("Nova Tarefa");
		btnNovaTarefa.setBounds(10, 410, 150, 40);
		
		btnNovaTarefa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TarefasFrame(tela);
				
				
			}
		});
		
		
		
		
		painel.add(labelTitulo);
		painel.add(scrollTarefas);
		painel.add(btnNovaTarefa);
		
		tela.setVisible(true);
		
	}
	

}
