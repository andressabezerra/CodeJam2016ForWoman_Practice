import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DrearyDesign {

	static int k;
	static int v;

	public static void main(String[] args) throws IOException {

		int dif;
		int dif2;
		int dif3;
		int n;

		final String filename = "output.txt";

		BufferedWriter wr = new BufferedWriter(new FileWriter(new File(filename), true));

		Scanner sc = new Scanner(new FileReader("input.in"));

		n = sc.nextInt();
		int aux = 1;

		for (int i = 0; i < n; i++) {

			while (sc.hasNext()) {

				int count = 0;
				k = sc.nextInt();
				v = sc.nextInt();

					int vermelho;
					for (int verde = 0; verde <= k; verde++) {
						vermelho = k;
						for (int azul = 0; azul <= k; azul++) {

							dif = Math.abs(vermelho - verde);
							dif2 = Math.abs(verde - azul);
							dif3 = Math.abs(vermelho - azul);
							
							vermelho--;
							
							if (dif >= 0 && dif2 >= 0 && dif3 >= 0 && dif <= v && dif2 <= v && dif3 <= v) {
								count++;
							}

						}
					}
				

				
				wr.write("Case #" + aux + ": " + count);
				wr.newLine();
				aux++;

			}
		}
		wr.close();
	}

}
