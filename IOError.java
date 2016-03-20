import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IOError {

	static String entrada;
	static int n;
	static ArrayList saida = new ArrayList();
	static ArrayList saidaOficial = new ArrayList();
	static ArrayList result = new ArrayList();
	static ArrayList results = new ArrayList();
	static BufferedWriter wr = null;
	static Scanner sc;

	public static void main(String[] args) throws IOException {

		final String filename = "output.txt";

		wr = new BufferedWriter(new FileWriter(new File(filename), true));

		sc = new Scanner(new FileReader("input.in"));

		int tam, comeco, fim;
		int aux = 1;
		String entradaBin, frase, auxiliar;

		tam = sc.nextInt();

		for (int a = 0; a < tam; a++) {

			while (sc.hasNext()) {

				tam = sc.nextInt();
				entrada = sc.next();

				if (!entrada.isEmpty()) {
					comeco = 0;
					fim = 8;
					frase = "";
					
					entradaBin = entrada.replaceAll("I", "1");
					String entradaBin2 = entradaBin.replaceAll("O", "0");

					while (fim <= entradaBin2.length()) {
						char ch = Character
								.valueOf(((char) Integer.parseInt((String) entradaBin2.substring(comeco, fim), 2)));
						auxiliar = Character.toString(ch);
						frase = frase + auxiliar;
						comeco = comeco + 8;
						fim = fim + 8;
					}

					wr.write("Case #" + aux + ": " + frase);
					wr.newLine();
					aux++;
				}
			}
		}

		wr.close();

	}

}
