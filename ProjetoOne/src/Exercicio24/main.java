package Exercicio24;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitorScanner = new Scanner(System.in);
		
		char desejaContinuar = 'S';
		
		while (desejaContinuar == 'S' || desejaContinuar == 's') {
			System.out.println("Digite um número:");
			int numero = leitorScanner.nextInt();
			
			if (numero == 0) {
				System.out.println("o número é zero");
			} else {
				if (numero > 0) {
					System.out.println("o número é maior que zero");
				} else {
					System.out.println("o número é menor que zero");
				}
			}
			
			System.out.println("Deseja continuar? S - Sim / N - Não");
			desejaContinuar = leitorScanner.next().charAt(0);
		}
		

	}

}
