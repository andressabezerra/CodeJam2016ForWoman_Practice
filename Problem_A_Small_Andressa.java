import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_A_Small_Andressa {

	public static void main(String[] args) throws IOException {

		int T, aux;
		aux = 1;

		final String filename = "output.txt";

		BufferedWriter wr = new BufferedWriter(new FileWriter(new File(filename), true));

		Scanner sc = new Scanner(new FileReader("input.in"));

		T = sc.nextInt();

		int qtItensLoja, valor;
		ArrayList valoresItens = new ArrayList();
		ArrayList comDesconto = new ArrayList();
		ArrayList semDesconto = new ArrayList();

		String saida;

		for (int a = 0; a < T; a++) {

			while (sc.hasNext()) {

				qtItensLoja = sc.nextInt();
				saida = "";

				for (int i = 0; i < 2 * qtItensLoja; i++) {
					valoresItens.add(sc.nextInt());
				}
				
				int j = 0;
							
				while(j < valoresItens.size()){
				
					valor = (int) Math.round((int)valoresItens.get(j)*0.75);
					
					if(valoresItens.contains(valor)){
						
						valoresItens.set(j, -1);
						
						for(int k =0; k < valoresItens.size(); k++){
							if (valoresItens.get(k).equals(valor)){
								valoresItens.set(k, -1);
								break;
							}
						}
						
						comDesconto.add(valor);
						
					}
					
					j++;
				}
				
				for (int i = 0; i < comDesconto.size(); i++) {

					saida = saida + comDesconto.get(i) + " ";

				}

				wr.write("Case #" + aux + ": " + saida);
				wr.newLine();
				aux++;
				saida = "";
				valoresItens.clear();
				comDesconto.clear();
	
			}
		}

		wr.close();

	}
}
