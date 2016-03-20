import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) throws IOException {

		int T, aux;
		aux = 1;

		final String filename = "output.txt";

		BufferedWriter wr = new BufferedWriter(new FileWriter(new File(filename), true));

		BufferedReader leitor = new BufferedReader(new FileReader("input.in"));

		T = leitor.read();

		ArrayList palavras = new ArrayList();
		String palavra;

		ArrayList frases = new ArrayList();

		while (leitor.readLine() != null) {

			String line = leitor.readLine();
			palavras.add(line);
		}

		System.out.println(palavras);

		wr.close();

	}
}
