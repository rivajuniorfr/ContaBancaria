package ProgramaBanco;

public class ContaJuridica extends ContaBancaria {
	
	// ----Atributos ----
	
	private String cnpj;
	
	// ---- M�todos Construtores ----
	
	public ContaJuridica() {
		
		super();
	}
	
	public ContaJuridica(String nomeBanco, int agencia, int numeroConta, String nomeCliente,String cnpj) {
		
	   	 super(nomeBanco,agencia,numeroConta,nomeCliente);
	   	 this.cnpj = cnpj;	   	    
	   	 
			
		}
	
	// ---- M�todos Get e Set ----

}
