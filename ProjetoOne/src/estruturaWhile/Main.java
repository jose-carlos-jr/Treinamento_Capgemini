package estruturaWhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalAlunos = 10;
		
		Scanner leitorScanner = new Scanner(System.in);
		
		while(totalAlunos > 0) {
			System.out.println("Digite o nome do aluno:");
			String nomeAluno = leitorScanner.nextLine();
			System.out.println("Digite a idade do aluno:");
			int idadeAluno = leitorScanner.nextInt();
			
			System.out.println("O nome do aluno é: " + nomeAluno + " e sua idade é: " + idadeAluno);
			
			totalAlunos = totalAlunos - 1;
			
		}
		

	}

}
