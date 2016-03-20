import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreCredit {

	public static void main(String[] args) throws IOException {

		int T, aux;
		aux = 1;

		final String filename = "output.txt";

		BufferedWriter wr = new BufferedWriter(new FileWriter(new File(filename), true));

		Scanner sc = new Scanner(new FileReader("input.in"));

		T = sc.nextInt();

		int itemA, itemB, valorCartao, tamanhoLoja, somaPrecoProdutos, qtdadeItensEscolhidos;
		ArrayList precos = new ArrayList();
		ArrayList lojaOrdenada = new ArrayList();
		ArrayList valoresEscolhidos = new ArrayList();
		boolean achouItens;

		for (int a = 0; a < T; a++) {

			while (sc.hasNext()) {

				valorCartao = sc.nextInt();
				System.out.println(valorCartao);
				tamanhoLoja = sc.nextInt();
				System.out.println(tamanhoLoja);
				itemA = 0;
				itemB = 0;

				for (int i = 0; i < tamanhoLoja; i++) {
					precos.add(sc.nextInt());
					System.out.println(precos);
				}

				somaPrecoProdutos = 0;
				achouItens = false;

				for (int i = 0; i < precos.size(); i++) {
					if (achouItens == false) {
						for (int j = i + 1; j < precos.size(); j++) {
							if ((int) precos.get(i) + (int) precos.get(j) == valorCartao) {
								itemA = i + 1;
								itemB = j + 1;
								achouItens = true;
								break;
							}
						}
					}
				}

				System.out.println(itemA);
				System.out.println(itemB);
				// Code here :)

				wr.write("Case #" + aux + ": " + itemA + " " + itemB);
				wr.newLine();
				aux++;
				achouItens = false;
				precos.clear();
				valorCartao = 0;
			}
		}
		
		wr.close();

	}
}
