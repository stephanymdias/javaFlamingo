package exercicios;

public class ExemplosVidaReal {

	public static void main(String[] args) {
		
		int itens = 50;
		float custoPorItem = 9.99f;
		float custoTotal = itens * custoPorItem;
		char moeda = '$';
		
		System.out.println("Número de itens: " + itens);
		System.out.println("Custo por item: " + custoPorItem + moeda);
		System.out.println("Custo total: " + custoTotal + moeda);
	}

}
