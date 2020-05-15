package application;

import java.util.Locale;
import java.util.Scanner;

class avaliacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qntCompra, atraso;
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
		
		sc.close();
	}

}
