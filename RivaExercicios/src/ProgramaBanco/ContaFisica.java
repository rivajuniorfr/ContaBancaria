package ProgramaBanco;

public class ContaFisica extends ContaBancaria {

	// ---- Atributos ----
	
	private String cnh;
	
	// ---- Métodos Construtores ----
	
	public ContaFisica() {
		
		super();
		
	}
	
     public ContaFisica(String nomeBanco, int agencia, int numeroConta, String nomeCliente, String cpf,String cnh) {
		
    	 super(nomeBanco,agencia,numeroConta,nomeCliente,cpf);
    	 this.cnh = cnh;
    	        	 
		
	}
     
  // ---- Métodos Get e Set ----
     
     public String getCnh() {
    	 
    	 return this.cnh;
     }
     
     public void setCnh(String c) {
    	 
    	 this.cnh = c;
     }
     
}
