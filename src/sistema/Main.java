package sistema;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\n======== MENU PRINCIPAL ========");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Mostrar um Produto");
			System.out.println("3 - Mostrar todos os Produtos");
			System.out.println("4 - Alterar Produto");
			System.out.println("5 - Excluir Produto");
			System.out.println("6 - Finalizar Sistema");
			System.out.print("Escolha uma opção: ");
			
			opcao = Integer.parseInt(sc.nextLine());
			
			switch(opcao) {
				case 1:
					System.out.print("Código: ");
					int codigo = Integer.parseInt(sc.nextLine());
					
					System.out.print("Nome Produto: ");
					String nomeProduto = sc.nextLine();
					
					System.out.print("Preço: ");
					double preco = Double.parseDouble(sc.nextLine());
					
					System.out.print("Quantidade: ");
					int quantidade = Integer.parseInt(sc.nextLine());
					
					// Cria Objeto
					Produto p = new Produto(codigo, nomeProduto, preco, quantidade);
					
					// temporário
					System.out.println(p.getCodigo());
					System.out.println(p.getNomeProduto());
					System.out.println(p.getPreco());
					System.out.println(p.getQuantidade());
					
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
			}
		} while(opcao!=6);
		
		sc.close();
	}

}
