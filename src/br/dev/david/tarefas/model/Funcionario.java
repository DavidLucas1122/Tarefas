package br.dev.david.tarefas.model;

import java.util.UUID;

import br.dev.david.tarefas.utils.Utils;

public class Funcionario {

	private String nome;
	private String setor;
	private String matricula;
	private String cargo;

	//O método construtor deve ter o nome da classe e não deve declarar nenhum tipo de retorno, como void e etc.

	public Funcionario(String nome) {
		this.nome = nome;
		UUID uuid = UUID.randomUUID();
		String uuid8 = uuid.toString().substring(0,8);
		this.matricula = Utils.gerarUUID8();
	}
	
	public Funcionario(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
		UUID uuid = UUID.randomUUID();
		String uuid8 = uuid.toString().substring(0,8);
		this.matricula = Utils.gerarUUID8();
	}
	
	public Funcionario() {
		UUID uuid = UUID.randomUUID();
		String uuid8 = uuid.toString().substring(0,8);
		this.matricula = Utils.gerarUUID8();
	}
	
	
	
	
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return matricula + "," + nome + "," + cargo +  "," + setor + "\n";
	}
	
	
	
}
