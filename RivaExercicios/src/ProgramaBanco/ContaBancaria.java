package ProgramaBanco;

public class ContaBancaria {
	
	// ---- Atributos ----
	
	private String login;
	private int senha;
	private boolean validacao;
	private String nomeBanco;
	private int agencia;
	private int numeroConta;
	private String nomeCliente;
	private String cpf;
	private double limiteConta;	
	
	
	// ---- Métodos Construtores ----
	
	
	public ContaBancaria() {
				
	}
	
    public ContaBancaria(String n, int ag, int nCon, String nCli) {
		
		
		this.nomeBanco = n;
		this.agencia = ag;
		this.numeroConta = nCon;
		this.nomeCliente = nCli;
		
		
	} 
	
	public ContaBancaria(String n, int ag, int nCon, String nCli, String cp) {
		
		
		this.nomeBanco = n;
		this.agencia = ag;
		this.numeroConta = nCon;
		this.nomeCliente = nCli;
		this.cpf = cp;
		
	} 
	
	// ---- Métodos Get e Set ----
	
	public String getLogin() {
		return this.login;
		
	}	
	
	public void setLogin(String l ) {
		
		this.login = l;
	}
	public int getSenha() {
		return this.senha;
		
	}	
	
	public void setSenha(int s ) {
		
		this.senha = s;
	}
	
	public boolean getValidacao() {
		return this.validacao;
		
	}	
	
	public void setValidacao(boolean v ) {
		
		this.validacao = v;
	}
	public String getNomeBanco() {
		return this.nomeBanco;
		
	}	
	
	public void setNomeBanco(String nB ) {
		
		this.nomeBanco = nB;
	}
	
	public int getAgencia() {
		return this.agencia;
		
	}	
	
	public void setAgencia(int a ) {
		
		this.agencia = a;
		
	}
	public int getNumeroConta() {
		return this.numeroConta;
		
	}	
	
	public void setNumeroConta(int nC ) {
		
		this.numeroConta = nC;
	}
	public String getnomeCliente() {
		return this.nomeCliente;
		
	}	
	
	public void setNomeCliente(String nCli ) {
		
		this.nomeCliente = nCli;
	}
	
	public String getCpf() {
		return this.cpf;
		
	}	
	
	public void setCpf(String cpf ) {
		
		this.cpf = cpf;
	}
	
	public double getlimiteConta() {
		return this.limiteConta;
		
	}	
	
	public void setlogin(double lC ) {
		
		this.limiteConta = lC;
	}
	
	boolean login() {
	   
	  if (login.equals("rivajunior") && senha == 123456) {   
	   	   
		    
		    System.out.println("Banco:" + this.nomeBanco);
			System.out.println("Agência:" + this.agencia);
			System.out.println("Numero da conta: " +  this.numeroConta);
			System.out.println("Cliente:" + this.nomeCliente);
			System.out.println("cpf: " + this.cpf);
			return true;
			
	   } else {
		   
		   System.out.println("Login ou senha inválido");
		   return false;
	   }
   }
	 
	 
   
		
		
}
