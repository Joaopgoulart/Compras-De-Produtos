package Compra;

import java.util.Scanner;

public class TestaCompras {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	
		UsuarioCompras usuario = new UsuarioCompras();
		int i;
		
		// fiz um do while para fornecer ao usuario quantas compras ele quiser fazer, até ele clicar 0 para finalizar compra.
		do {
		double somaProduto=0;
		String nomeProduto = usuario.nomeProduto();
		double salario = usuario.leituraValorProduto();
		double somaProdutos = usuario.valorTotal(salario);	
		usuario.mostrarProdutos(nomeProduto, salario, somaProdutos);
		
		System.out.println("----------------");
		System.out.println("Digite 0 - para finalizar compra");
		System.out.println("Digite 1 - para continuar compra");
		System.out.println("-----------------");
		i = leitor.nextInt();
		} while (i!=0);
	}

}
