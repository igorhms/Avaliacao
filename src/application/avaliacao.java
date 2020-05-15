package application;

import java.util.Locale;
import java.util.Scanner;

class avaliacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qntCompra;
		double ticketMedio;
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("-----------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println();
		
		System.out.print("Quantas compras o cliente fez no último ano? ");
		qntCompra = sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		ticketMedio = sc.nextDouble();
		
		sc.close();
	}

}
