package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItemDePedido;
import entidades.Pedido;
import entidades.Produto;
import entidades.enums.StatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfAtual = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		ItemDePedido itemPedido = new ItemDePedido();
		Produto produto = new Produto();

		System.out.println("Digite os dados do cliente: ");
		System.out.print("Nome: ");
		String nomeCliente = sc.nextLine();

		System.out.print("Email: ");
		String emailCliente = sc.nextLine();

		System.out.print("Data de nascimento: ");
		String dataNascimento = sc.nextLine();
		Date dataCliente = sdf.parse(dataNascimento);

		Cliente cliente = new Cliente(nomeCliente, emailCliente, dataCliente);

		System.out.println("\nDigite os dados do pedido: ");
		System.out.print("Status: ");
		String status = sc.nextLine();

		Date dataAtual = new Date();

		Pedido pedido = new Pedido(dataAtual, StatusPedido.valueOf(status));
		
		System.out.print("Quantos itens para esta ordem? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("\nDigite os dados do item #"+i+":");
			
			System.out.print("Nome produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			
			System.out.print("Preço produto: ");
			Double precoProduto = sc.nextDouble();
			
			System.out.print("Quantidade produto: ");
			int quantidadeProduto = sc.nextInt();
			
			produto.setNome(nomeProduto);
			produto.setPreco(precoProduto);
			
			itemPedido.setProduto(produto);
			itemPedido.setQuantidade(quantidadeProduto);
		
			
			pedido.addItem(itemPedido);
			
		}
		

	}

}
