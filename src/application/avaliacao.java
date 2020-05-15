package application;

import java.util.Locale;
import java.util.Scanner;

class avaliacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qntCompra, atraso, pontCompra, inadimp, pontPag;
		double ticketMedio;
		char pagamento;
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("-----------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println();
		
		System.out.print("Quantas compras o cliente fez no último ano? ");
		qntCompra = sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		ticketMedio = sc.nextDouble();
		
		System.out.println();
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		atraso = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		pagamento = sc.next().charAt(0);
		
		if (ticketMedio > 3000.00){
			pontCompra = 60;
		}
		else if (ticketMedio < 3000.00 & qntCompra > 2){
			pontCompra = 40;
		}
		else if (ticketMedio < 3000.00){
			pontCompra = 20;
		}
		else {
			pontCompra = 0;
		}	
		System.out.println();
		System.out.printf("Score de volume de compras = %d%n", pontCompra);
		
		if (atraso == 0){
			inadimp = 0;
		}
		else if (atraso == 1){
			inadimp = 15;
		}
		else {
			inadimp = 30;
		}
		
		if (pagamento == 'b' || pagamento == 'B' || pagamento == 'C' || pagamento == 'c'){
			pontPag = 10;
		}
		else {
			pontPag = 5;
		}	
		System.out.println();
		System.out.printf("Score de inadimplência = %d%n", inadimp);
		System.out.printf("Score de forma de pagamento = %d%n", pontPag);
		
		sc.close();
	}

}
