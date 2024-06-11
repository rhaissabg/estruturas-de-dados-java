package estruturaDeDados;

import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();

		int opcao;
		String nome = null;

		do {
			System.out.println("\n************************************");
			System.out.println("  [1] Adicionar cliente na fila");
			System.out.println("  [2] Listar todos os clientes");
			System.out.println("  [3] Retirar cliente da fila");
			System.out.println("  [0] Sair");
			System.out.println("************************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.print("\nDigite o nome: ");
				nome = sc.nextLine();
				nome = sc.nextLine();
				fila.add(nome);
				System.out.println("\nFila: \n");
				for (String pessoa : fila) {
					System.out.println(pessoa);
				}
				System.out.println("\nCliente adicionado!");
				break;

			case 2:
				System.out.println("\nLista de clientes na fila: \n");
				for (String pessoa : fila) {
					System.out.println(pessoa);
				}
				break;

			case 3:
				System.out.println("\nFila: \n");
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					String pessoaChamada = fila.remove();
					for (String pessoa : fila) {
						System.out.println(pessoa);
					}
					System.out.printf("\nCliente %s foi chamado!\n", pessoaChamada);
					break;
				}

			}

		} while (opcao != 0);

		System.out.println("\nPrograma finalizado!");

		sc.close();

	}

}
