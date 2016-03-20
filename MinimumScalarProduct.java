import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class MinimumScalarProduct {

	static int n;
	static Scanner sc;
	static int tamanho;
	static ArrayList vet1;
	static ArrayList vet2;
	static ArrayList prods;
	static BufferedWriter wr = null;

	public static void main(String[] agrs) throws IOException {

		final String filename = "output.txt";

		wr = new BufferedWriter(new FileWriter(new File(filename), true));

		sc = new Scanner(new FileReader("input.in"));

		vet1 = new ArrayList();
		vet2 = new ArrayList();
		prods = new ArrayList();

		n = sc.nextInt();

		while (sc.hasNext()) {
			
			tamanho = sc.nextInt();

			for (int j = 0; j < tamanho; j++) {
				vet1.add(sc.nextInt());
			}

			for (int j = 0; j < tamanho; j++) {
				vet2.add(sc.nextInt());

			}

			quickSort(vet1, 0, vet1.size() - 1);
			quickSort(vet2, 0, vet2.size() - 1);
			prods.add(calculaProd(vet1, vet2));

			vet1.clear();
			vet2.clear();

		}

		for (int i = 0; i < prods.size(); i++) {
			
			int aux = i+1;
			wr.write("Case #" + aux + ": " + prods.get(i).toString() );
			wr.newLine();

		}

		wr.close();

	}

	public static BigInteger calculaProd(ArrayList vet1, ArrayList vet2) {

		BigInteger prod;
		BigInteger result = BigInteger.valueOf(0);
		
		int n = vet1.size() - 1;

		for (int i = 0; i < vet1.size(); i++) {
			
			BigInteger a = new BigInteger(Integer.toString((int) vet1.get(i)));
			BigInteger b = new BigInteger(Integer.toString((int) vet2.get(n)));
			prod = a;
			prod = prod.multiply(b);
			result = result.add(prod);
			n--;
		}
		return result;
	}

	public static void quickSort(ArrayList v, int esquerda, int direita) {

		int esq = esquerda;
		int dir = direita;
		int pivo = (int) v.get((esq + dir) / 2);
		int troca;

		while (esq <= dir) {
			while ((int) v.get(esq) < pivo) {
				esq = esq + 1;
			}

			while ((int) v.get(dir) > pivo) {
				dir = dir - 1;
			}

			if (esq <= dir) {
				troca = (int) v.get(esq);
				v.set(esq, v.get(dir));
				v.set(dir, troca);

				esq = esq + 1;
				dir = dir - 1;
			}
		}

		if (dir > esquerda)
			quickSort(v, esquerda, dir);
		if (esq < direita)
			quickSort(v, esq, direita);
	}

}
