package estruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack<String> pilhaLivros = new Stack<String>();

		int opcao;
		String nome = null;

		do {

			System.out.println("\n************************************");
			System.out.println("  [1] Adicionar livro na pilha");
			System.out.println("  [2] Listar todos os livros");
			System.out.println("  [3] Retirar livro da pilha");
			System.out.println("  [0] Sair");
			System.out.println("************************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.print("\nDigite o nome do livro: ");
				nome = sc.nextLine();
				nome = sc.nextLine();
				pilhaLivros.add(nome);
				System.out.println("\nPilha: \n");
				for (String livro : pilhaLivros) {
					System.out.println(livro);
				}
				System.out.println("\nLivro adicionado!");
				break;

			case 2:
				System.out.println("\nLista de livros na pilha: \n");
				for (String livro : pilhaLivros) {
					System.out.println(livro);
				}
				break;

			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				} else {
					String livroRetirado = pilhaLivros.pop();
					System.out.println("\nPilha: \n");
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
					System.out.printf("\nO livro %s foi retirado da pilha!\n", livroRetirado);
				}

			}

		} while (opcao != 0);

		System.out.println("\nPrograma finalizado!");

		sc.close();

	}

}
