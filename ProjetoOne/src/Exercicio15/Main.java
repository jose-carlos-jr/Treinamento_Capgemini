package Exercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		
		Scanner leitorScanner = new Scanner(System.in);
		
		System.out.println("Digite o valor");
		numero = leitorScanner.nextInt();
		
		if(numero >= 100 && numero <= 200) {
			System.out.println("o numero esta no intervalo");
		} else {
			System.out.println("o numero não esta no intervalo");
		}

	}

}
