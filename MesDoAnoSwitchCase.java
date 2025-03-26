package exercicios;

import java.util.Scanner;

public class MesDoAnoSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha um número: ");
		System.out.println("01");
		System.out.println("02");
		System.out.println("03");
		System.out.println("04");
		System.out.println("05");
		System.out.println("06");
		System.out.println("07");
		System.out.println("08");
		System.out.println("09");
		System.out.println("10");
		System.out.println("11");
		System.out.println("12");

		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Número 01 representa o mês de Janeiro.");
			break;
		case 2:
			System.out.println("Número 02 representa o mês de Fevereiro.");
			break;
		case 3:
			System.out.println("Número 03 representa o mês de Março.");
			break;
		case 4:
			System.out.println("Número 04 representa o mês de Abril.");
			break;
		case 5:
			System.out.println("Número 05 representa o mês de Janeiro.");
			break;
		case 6:
			System.out.println("Número 06 representa o mês de Janeiro.");
			break;
		case 7:
			System.out.println("Número 07 representa o mês de Janeiro.");
			break;
		case 8:
			System.out.println("Número 08 representa o mês de Janeiro.");
			break;
		case 9:
			System.out.println("Número 09 representa o mês de Janeiro.");
			break;
		case 10:
			System.out.println("Número 10 representa o mês de Janeiro.");
			break;
		case 11:
			System.out.println("Número 11 representa o mês de Janeiro.");
			break;
		case 12:
			System.out.println("Número 12 representa o mês de Janeiro.");
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		sc.close();
	}

}
