package exercício0603;

import java.util.Scanner;

public class algoritimo {

	public static void main(String[] args) {

		//Variável
		double a, b, adiçao, subtraçao, multiplicaçao, divisao;

		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println ("Informe o valor 1:");
		a = ler.nextDouble ();

		System.out.println ("Informe o valor 2:");

		//Processamento

		adiçao = a+b;
		subtraçao = a-b;
		multiplicaçao = a*b;
		divisao = a/b;

		//Saída
		System.out.println ("O valor da adição é igual a: " + adiçao);
		System.out.println ("O valor da subtração é igual a: " + subtraçao);
		System.out.println ("O valor da multiplicação é igual a:" + multiplicaçao);
		System.out.println ("O valor da multiplicação é igual a: " + divisao);
		ler.close();

	}

}
