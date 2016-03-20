import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) throws IOException {

		int T, aux, k;
		aux = 1;

		final String filename = "output.txt";

		BufferedWriter wr = new BufferedWriter(new FileWriter(new File(filename), true));

		Scanner sc = new Scanner(new FileReader("input.in"));

		T = sc.nextInt();
		int count, A1, A2, B1, B2, aryaWins;
		String jogador = "";

		for (int casosTeste = 0; casosTeste < T; casosTeste++) {

			A1 = sc.nextInt();
			System.out.println(A1);
			A2 = sc.nextInt();
			System.out.println(A2);
			B1 = sc.nextInt();
			System.out.println(B1);
			B2 = sc.nextInt();
			System.out.println(B1);
			aryaWins = 0;

			for (int A = A1; A <= A2; A++) {

				for (int B = B1; B <= B2; B++) {

					count = 0;

					while (A >= 0 && B >= 0) {

						System.out.println("entrou 1");

						if (A > B && count == 0) {
							count++;
							k = B;
							while (A - k * B < 0) {
								System.out.println("entrou 4");
								k--;
							}
							A = A - k * B;
						} else if (A > B) {
							k = B;
							while (A - k * B < 0) {
								System.out.println("entrou 4");
								k--;
							}

							if (count / 2 == 0) {
								A = A - k * B;
							} else{
								A = A - (k -1)* B;
							}
							
						} else {
							k = A;
							while (B - k * A < 0) {
								System.out.println("entrou 5");
								k--;
							}
							
							if (count / 2 == 0) {
								B = B - k * A;
							} else{
								B = B - k * A;
							}
							
						}
					}

					if (count > 0 && A > 0 && B <= 0) {
						aryaWins++;
					} else if (count == 0 && A <= 0 && B > 0) {
						aryaWins++;
					}

				}
			}

			wr.write("Case #" + aux + ": " + aryaWins);
			wr.newLine();
			aux++;
			aryaWins = 0;

		}

		wr.close();

	}
}
