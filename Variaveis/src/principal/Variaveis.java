package principal;

public class Variaveis {

	public static void main(String[] args) {
		int numero;
		numero = 10;
		// ou int numero =10;
		double decimal = 10.50;
		// com (int) ele converte o n�mero excluindo a parte decimal
		int testeNumero = (int) 50.25;
		// aparece na tela 10.0 com a parte decimal
		double testeNovoNumero = 10;
		// aspas duplas para strings
		String nome = "Maria Fernanda";
		// aspas simples para char
		char sexo = 'F';
		// booleanos: para verdadeiro ou falso
		boolean verdadeiro = true;
		boolean falso = false;
		double peso = 53.90;
		int idade = 20;
		double altura = 1.65;

		System.out.println(numero);
		System.out.println(decimal);
		System.out.println(testeNumero);
		System.out.println(testeNovoNumero);
		System.out.println(nome);
		System.out.println(sexo);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.print("Nome:");
		System.out.println(" Maria Fernanda");
		// concatena��o de dados 
		System.out.println("*********************");
		System.out.print("Meu nome �: " + nome + ". Tenho: " + idade + " anos.");
		System.out.print("Eu peso " + peso + " kg e minha altura � " + altura + " metros.");
	}

}
