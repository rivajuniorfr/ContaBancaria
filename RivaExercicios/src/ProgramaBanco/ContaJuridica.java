package ProgramaBanco;

public class ContaJuridica extends ContaBancaria {
	
	// ----Atributos ----
	
	private String cnpj;
	
	// ---- Métodos Construtores ----
	
	public ContaJuridica() {
		
		super();
	}
	
	public ContaJuridica(String nomeBanco, int agencia, int numeroConta, String nomeCliente,String cnpj) {
		
	   	 super(nomeBanco,agencia,numeroConta,nomeCliente);
	   	 this.cnpj = cnpj;	   	    
	   	 
			
		}
	
	// ---- Métodos Get e Set ----

}
