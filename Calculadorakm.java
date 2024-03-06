package exercício0603;

import java.util.Scanner;

class Calculadorakm {

	public static void main(String[] args) {
		//Variáveis
		double valorgasolina, distânciapercorrida, consumomédio, litrosgastos, custototal;

		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados ;

		System.out.println ("Informe o valor pago no litro da gasolina: ");
		valorgasolina = ler.nextDouble() ;


		System.out.println ("Informe a distância percorrida pelo veículo:");
		distânciapercorrida = ler.nextDouble ();

		System.out.println ("Informe qual o consumo médio por Km:");
		consumomédio = ler.nextDouble();

		//Processamento
		litrosgastos = distânciapercorrida/ consumomédio;
		custototal = valorgasolina*distânciapercorrida;

		//Saída
		System.out.println ("A quantidade de litros gastos no trajeto é igual a: "+ litrosgastos);
		System.out.println ("O custo total com o combustível é igual a:" + custototal);
		ler.close();
	}

}
