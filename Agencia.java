package agencia;

import java.util.HashMap;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;
import cliente.*;

public class Agencia {

	//sempre que uma agencia for criada ela recebera um codigo referente a esta variavel
	private static int AgenciasCriadas = 0;
	
	//sempre q uma conta for criada na agencia ela recebera um codigo referente a esta variavel
	private int geradorCodContas=0;
	
	//codigo da agencia
	private int codigo;
	
	// contas pertencentes a agencia
	private HashMap<Integer, Conta> contas = new HashMap<Integer, Conta>();

	public Agencia() {
		AgenciasCriadas++;
		this.setCodigo(AgenciasCriadas);
	}
	
//	Gets AND Sets

	public static int getAgenciasCriadas() {
		return AgenciasCriadas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public HashMap<Integer, Conta> getContas() {
		return contas;
	}

	public ContaCorrente criarContaCorrente(Cliente cliente){
		
		//criar conta do cliente
		ContaCorrente c = new ContaCorrente();
		c.setCliente(cliente);
		//setar codigo da conta criada com o numero da agencia e o gerador
		//ex.:  agencia 10 gerador = 1
		//      conta.codigo = 100001
		c.setNumero(this.getCodigo()*1000+this.getGeradorContas());
		
		//adicionar conta na agencia
		this.contas.put(c.getNumero(), c);
		
		this.geradorCodContas++;
		
		return c;
	}
	
	public ContaPoupanca criarContaPoupanca(Cliente cliente){
		
		//criar conta do cliente
		ContaPoupanca c = new ContaPoupanca();
		c.setCliente(cliente);
		
		//setar codigo da conta criada com o numero da agencia e o gerador
		//ex.:  agencia 10 gerador = 1
		//      conta.codigo = 100001
		c.setNumero(this.getCodigo()*1000+this.getGeradorContas());
		
		//adicionar conta na agencia
		this.contas.put(c.getNumero(), c);		
		this.geradorCodContas++;
		
		return c;
	}
	
	public Conta buscaConta(int numero){
		
		return	this.getContas().get(numero);
		
	}
	

	public int getGeradorContas(){
		return this.geradorCodContas;
	}
	
}
