package banco;

import java.util.HashMap;

import cliente.Cliente;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import agencia.Agencia;

public class Banco {
	
	private String nome;
	private HashMap<Integer, Agencia> agencias = new HashMap<Integer, Agencia>();
	
	
	public Banco(String nome) {
		
		setNome(nome);
		
		Agencia agencia = new Agencia();
		getAgencias().put(agencia.getCodigo(), agencia);
		
	}


	public HashMap<Integer, Agencia> getAgencias() {
		return agencias;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addAgencia(){
		Agencia agencia = new Agencia();
		getAgencias().put(agencia.getCodigo(), agencia);
	}
	
	public ContaCorrente criarContaCorrente(Cliente cliente,Agencia agencia){
		
		return agencia.criarContaCorrente(cliente);
		
	}
	
	public ContaPoupanca criarContaPoupanca(Cliente cliente,Agencia agencia){
		
		return agencia.criarContaPoupanca(cliente);
		
	}
	
	public Conta buscarConta(int nConta,int nAgencia){		
		return this.getAgencias().get(nAgencia).buscaConta(nConta);
	}
	

}
