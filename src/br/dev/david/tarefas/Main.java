package br.dev.david.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.UUID;

import br.dev.david.tarefas.dao.FuncionarioDAO;
import br.dev.david.tarefas.model.Funcionario;
import br.dev.david.tarefas.model.Tarefa;
import br.dev.david.tarefas.ui.FuncionarioFrame;
import br.dev.david.tarefas.ui.FuncionariosListaFrame;
import br.dev.david.tarefas.ui.GerenciadorFrame;

public class Main {

	static String caminho = "/Users/25132827/tarefasDS1T-A/tarefas";
	
	public static void main(String[] args) {
		
//		FuncionarioDAO dao = new FuncionarioDAO(null);
//		dao.getFuncionarios();
		
		new GerenciadorFrame();		
//	new FuncionariosListaFrame();
		
//		UUID uuid = UUID.randomUUID();
//		System.out.println(uuid);
//		
//		String escola = "Senai Jandira";
//		String cidade = escola.substring(6, 13);
//		System.out.println(cidade);
//		
//		String uuid8 = uuid.toString().substring(0,8);
//		System.out.println(uuid8);
//		
//		
//		Funcionario f = new Funcionario("Pedro","Programador");
//		f.setSetor("TI");
//		
//		Funcionario f2 = new Funcionario();
//		f2.setNome("Carlos Augusto");
//		f2.setCargo("Analista de Sistemas");
//		f2.setSetor("TI");
//		
//		FuncionarioDAO dao = new FuncionarioDAO(f2);
//		dao.salvar();
		
		
		
		
	}

	private static void escreverArquivo(){
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(caminho, true);
			bw = new BufferedWriter(fw);
			
			//Adicionando coisas ao arquivo
			bw.append("XPTO\n");
			bw.append("Senai Jandira\n");
			bw.append("Programação de computadores\n");
			
			
			//Mandando pro arquivo
			bw.flush();
			
		} catch (Exception e) {
			
		}
		
	}
	
	
	private static void lerArquivo() {

		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			
			String retorno = br.readLine();
			
			while (retorno != null) {
				System.out.println(retorno);
				System.out.println(br.readLine());
			}
		}
		catch (FileNotFoundException erro){
			System.out.println("o arquivo não foi encontrado!");
		}
		catch (Exception erro) {
			System.out.println("Ocorreu um erro!");
		}
		
		System.out.println("Fim");
	}

}
