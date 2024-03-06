package exercício0603;

import java.util.Scanner;

public class conversão {

	public static void main(String[] args) {

		//Variável
		double dolar, real;

		// Instanciar classe Scanner 
		Scanner ler = new Scanner (System.in);

		// Entrada de dados
		System.out.println("Informe o valor em real: " );
		real = ler.nextDouble();

		//Processamento
		dolar = real * 0.20 ;

		//Saída
		System.out.println ("O total em dólar é equivalente a: " + dolar);
		ler.close();

	}

}
