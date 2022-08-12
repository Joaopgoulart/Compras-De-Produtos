package Compra;

import java.util.Scanner;
	
public class UsuarioCompras {
	double somaProdutos;
	Scanner leitor = new Scanner(System.in);
	// metodo que realizara leitura do nome do produto;
	
	public String nomeProduto() {
		Produto produto = new Produto();
		String nomeProduto = produto.nome;
		System.out.println("Digite nome do Produto");
		nomeProduto = leitor.next();
		return nomeProduto;
	}
	// metodo que realiza leitura do valor de produto;
	public double leituraValorProduto() {
		Produto produto = new Produto();
		double valorProduto = produto.valorProduto;
			System.out.println("Digite Valor do produto:");
			valorProduto = leitor.nextDouble();
				return valorProduto;
	}
	//metodo que realiza o valor total de cada compra feita;
	public double valorTotal(double valorProduto) {
		somaProdutos = somaProdutos + valorProduto;
		return somaProdutos;
	}
	//metodo que mostra ao usuario toda compra feita, com nome, valor, e valor total se caso continuar comprando mais
	public void mostrarProdutos(String nomeProduto, double valorProduto, double somaProduto) {
		System.out.println("Nome do Produto: "+ nomeProduto);
		System.out.println("Valor do Produto:"+ valorProduto);
		System.out.println("Soma dos produtos: " +somaProduto);
	}

}
