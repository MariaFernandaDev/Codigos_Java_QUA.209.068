package principal;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();

		System.out.println("O n�mero informado foi: " + numero);
		leia.close();
	}

}
