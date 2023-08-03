package principal;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//final double PI = 3.1415;
		// PI = 3.1613;
		String nome;
		int idade;
		double altura;
		char sexo;
		
		System.out.print("Digite o seu nome: ");
		// leitura de dados tipo String (conjunto de caracteres)
		nome = leia.nextLine();
		
		System.out.print("Digite a sua idade: ");
		// leitura de dados do tipo int (números inteiros)
		idade = leia.nextInt();
		
		System.out.print("Digite sua altura: ");
		// leitura de dados do tipo double (números decimais)
		altura = leia.nextDouble();
		
		System.out.print("Digite seu sexo (M/F): ");
		// leitura de dados do tipo char (caractere único).
		// leia o próximo dado que é do tipo char começando na posição 0. 
		sexo = leia.next().charAt(0);
		
		// Saída de dados para o usuário: 
		System.out.println("****************************");
		System.out.println("O nome digitado foi: " + nome);
		System.out.println("A idade digitada foi: " + idade);
		System.out.println("A altura digitada foi: " + altura);
		System.out.println("O sexo digitado foi: " + sexo);
		leia.close();
	}
}
