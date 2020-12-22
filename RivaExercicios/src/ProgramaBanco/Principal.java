package ProgramaBanco;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Operacoes depositos = new Operacoes(0,1000,10);
		ContaCorrente sacar = new ContaCorrente(0,1000,10,0);
		ContaBancaria conta1 = new ContaBancaria("Bradesco",3202,9683,"Rivadavia Junior","051.791.944-31");
		ContaBancaria conta2 = new ContaBancaria("Itau",3202,9683,"Rivadavia Junior","051.791.944-31");
		ContaBancaria conta3 = new ContaBancaria("Nubank",3202,9683,"Rivadavia Junior","051.791.944-31");
		ContaBancaria conta4 = new ContaBancaria("Inter",3202,9683,"Rivadavia Junior","051.791.944-31");
		ContaBancaria conta5 = new ContaBancaria("Santander",3202,9683,"Rivadavia Junior","051.791.944-31");
		
		// for(conta conta: listaContas){}            Foreach - varrer a lista inteira
		// System.out.println(conta.getdono());
           		
	   
		
		// Login e senha
		System.out.println("Digite seu Login: ");
		System.out.println("Senha: ");
		String login =  entrada.nextLine();
		int senha =  entrada.nextInt();
		
		conta1.setLogin(login) ;
		conta1.setSenha(senha) ;		    	
				
		System.out.println("");
				  
		// Depositos e Bonus
		
		if (conta1.login()) {
			
			sacar.saldoDeposito();
			System.out.print("Digite o valor do Deposito: ");
			sacar.deposito = entrada.nextDouble();
			sacar.bonus();
			
			System.out.println("");
			
			//Saques
			System.out.println("Digite o valor do primeiro saque");
			System.out.println("Digite o valor do segundo saque");
			System.out.println("Digite o valor do terceiro saque");
			sacar.saque1 = entrada.nextDouble();
			sacar.saque2 = entrada.nextDouble();
			sacar.saque3 = entrada.nextDouble();
			sacar.sacar(sacar.saque1,sacar.saque2,sacar.saque3);
			
		}
				
		
		 
		
		
	}
}
