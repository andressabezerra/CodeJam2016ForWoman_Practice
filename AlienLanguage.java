import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AlienLanguage {

	public static void main(String[] args) throws IOException {

		int inicio, fim, count, qtLetras, qtPalavras, qtTestes, aux;
		aux = 1;
		String palavra, palavraSemParenteses, palavraSemParenteses2;

		final String filename = "output.txt";

		ArrayList dicionario = new ArrayList();

		BufferedWriter wr = new BufferedWriter(new FileWriter(new File(filename), true));

		Scanner sc = new Scanner(new FileReader("input.in"));

		qtLetras = sc.nextInt();
		qtPalavras = sc.nextInt();
		qtTestes = sc.nextInt();

		for (int i = 0; i < qtPalavras; i++) {
			dicionario.add(sc.next());
		}

		for (int j = 0; j < qtTestes; j++) {

			count = 0;
			palavraSemParenteses = "";
			palavraSemParenteses2 = "";
			inicio = 0;
			fim = inicio + 3;

			palavra = sc.next();

			if (palavra.length() == qtLetras && dicionario.contains(palavra)) {
				count++;
			} else {

				char a;
				int m = 0;

				while (m < palavra.length()) {
					a = palavra.charAt(m);

					if (a == '(') {
						m = m+2;
						palavraSemParenteses = palavraSemParenteses + a;
					} else {
						if (a != ')') {

						}

					}
				}

				System.out.println(palavraSemParenteses);

				while (fim <= palavraSemParenteses.length()) {
					System.out.println(palavraSemParenteses.substring(inicio, fim));
					if (dicionario.contains(palavraSemParenteses.substring(inicio, fim))) {
						count++;
					}
					inicio++;
					fim++;
				}

			}

			wr.write("Case #" + aux + ": " + count);
			count = 0;
			wr.newLine();
			aux++;
			palavraSemParenteses = "";
			inicio = 0;
			fim = 0;

		}

		wr.close();

	}
}
