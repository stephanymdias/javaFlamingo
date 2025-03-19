package exercicios;

public class TiposDados {

	public static void main(String[] args) {
		
		byte numero = -128; // numerico inteiro
		short valor = 32767; // numerico inteiro
		short valor1 = -32768;
		int numero01 = 12; // numerico inteiro
		float numero02 = 12.34f; // permite decimais
		double numero03 = 123.456d; // permite decimais
		long valor02 = 1111111111;
		String nome = "Stephany";
		char sexo = 'f';
		boolean maiorIdade = true;
		
		System.out.println("Número: " + numero);
		System.out.println("Valor: " + valor);
		System.out.println("Valor 1: " + valor1);
		System.out.println("Número 01: " + numero01);
		System.out.println("Número 02: " + numero02);
		System.out.println("Número 03: " + numero03);
		System.out.println("Valor 02: " + valor02);
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Maior idade: " + maiorIdade);
	}
}
