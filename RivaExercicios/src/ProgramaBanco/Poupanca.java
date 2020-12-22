package ProgramaBanco;

public class Poupanca extends ContaBancaria {

	// ---- Atributos ----
	
	private double rendimento;
	
	// ---- M�todos Construtores ----
	
	public Poupanca () {
		
		super();
		
	}
	
	public Poupanca(String nomeBanco, int agencia, int numeroConta, String nomeCliente, String cpf,double rendimento) {
		
   	 super(nomeBanco,agencia,numeroConta,nomeCliente,cpf);
   	 this.rendimento = rendimento;  	 
		
	}
	
	// ---- M�todos Get e Set ----
	
	public double getRendimento() {
		
		return this.rendimento;
	}
	
	public void setRendimento(double r) {
		
		this.rendimento = r;
	}
	
}
