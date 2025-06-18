package br.dev.david.tarefas.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import br.dev.david.tarefas.model.Tarefa;

public class TarefasDAO {
	
	private Tarefa tarefa;
	
	private final String arquivo = "/Users/25132827/tarefasDS1T-A/tarefas.csv";
	
	public TarefasDAO (Tarefa tarefa) {
		
		this.tarefa = tarefa;
	}
	
	public void salvar() {
		try (FileWriter fw = new FileWriter(arquivo, true)){
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
}
