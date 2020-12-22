package ProgramaBanco;

public class ContaCorrente extends Operacoes {
	
	// ---- Atributos ----
	
	private double chequeEspecial;
	double taxa;
	
	// ---- Métodos Construtores ----
	
	public ContaCorrente(double deposito, double saldoConta,double percentualBonus,double chequeEspecial) {
		
		super(deposito,saldoConta,percentualBonus);
		this.chequeEspecial = chequeEspecial;	
		
	}
	
	
	
	// ---- Métodos Get e Set ----
	
	
			
			void saldoDeposito() {
				
				System.out.println("Saldo da Conta: " + this.saldoConta + " Reais"); 
			}
			
			
			void deposita(double deposito) {
				
			    this.saldoConta +=  this.deposito;
				
					
			}
			
			void deposita (double valor, double percentual) {
				
				double bonus = (percentual / 100) * valor;
				this.saldoConta += ( valor + bonus );
				
			}
			
			void bonus() {
				
						
				if (deposito > 200) {
					
					 deposita ( this.deposito, this.percentualBonus);
				}
				else {
					
					 deposita (deposito);
				}
				
				System.out.println("Saldo atualizado: " + this.saldoConta + " Reais");
			
			
			}
			
			
			   		
		         void sacar (double saque1, double saque2, double saque3) {
				
				 if (this.saldoConta >= this.saque1) {
					
					 double taxa = 0.1;
					 this.saldoConta -= (this.saque1*taxa);	
					
					    if ( this.saldoConta >= this.saque2) {
						
						 this.saldoConta -= this.saque2;
					    }
					    
					       if ( this.saldoConta >= this.saque3) {
						 
						       this.saldoConta -= this.saque3;
						 
						        System.out.println("Saldo atualizado: " + this.saldoConta + " Reais");
					       }
					       
					           else {
						 
						             System.out.println("Saldo Insuficiente");
					           }
					
				}
				 

		        }

}
