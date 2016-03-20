import java.util.ArrayList;
import java.util.Scanner;

public class OldMagician {

	public static void main(String[] args) {

		int b;
		int p;
		int probBB;
		int probBP;
		int probPP;
		int probPB;
		int maiorProb;

		Scanner sc = new Scanner(System.in);

		int branca = sc.nextInt();
		int preta = sc.nextInt();

		b = branca;
		p = preta;

		int count = 0;

		while (b + p > 1) {

			if (b == 0) {
				b++;
			} else {

				probBP = ((b / (b + p)) * (p / ((b - 1) + p)));
				maiorProb = probBP;
				probBB = ((b / (b + p)) * ((b - 1) / ((b - 1) + p)));
				if (probBB >= maiorProb)
					maiorProb = probBB;
				probPB = ((p / (b + p)) * (b / ((p - 1) + b)));
				if (probPB >= maiorProb)
					maiorProb = probPB;
				probPP = ((p / (b + p)) * ((p - 1) / ((p - 1) + b)));
				if (probPP >= maiorProb)
					maiorProb = probPP;

				if (maiorProb == probBP) {
					b--;
				} else if (maiorProb == probBB) {
					b--;
				} else if (maiorProb == probPP) {
					b++;
				} else if (maiorProb == probPB) {
					b--;
				}
			}

			count++;

		}

		System.out.println(b + " " + p);
		if (b <= 0 && p > 0) {
			System.out.println("BLACK");
		} else if (p <= 0 && b > 0) {
			System.out.println("WHITE");
		} else {
			System.out.println("UNKNOWN");
		}

	}

}
