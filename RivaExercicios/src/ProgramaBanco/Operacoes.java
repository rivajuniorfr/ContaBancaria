package ProgramaBanco;

public class Operacoes  {
	
	// ---- Atributos ----
	
		public double deposito;
		public double saldoConta;
		public double percentualBonus;
		public double saque1;
		public double saque2;
		public double saque3;
		
		
		
			// ---- Métodos ----
		
		public Operacoes (double dep, double sC, double pB) {
			
			this.deposito = dep;
			this.saldoConta = sC;
			this.percentualBonus = pB;
			
		}
		
		
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
				
				this.saldoConta -= this.saque1;	
				
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
