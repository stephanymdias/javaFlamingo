package exercicios;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		
		int idade = sc.nextInt();
		
		if (idade < 18) {
			System.out.println("Não pode consumir bebida alcoólica!");
		}
sc.close();
	}

}
