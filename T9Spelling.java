import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class T9Spelling {

	public static void main(String[] args) throws IOException {

		int T, aux;
		aux = 1;

		final String filename = "output.txt";

		BufferedWriter wr = new BufferedWriter(new FileWriter(new File(filename), true));

		BufferedReader sc = new BufferedReader(new FileReader("input.in"));

		T = sc.read();
		int valor;

		String entrada, vazio, traducao = "";
		
		vazio = sc.readLine();

			while (sc.readLine() != null) {

				entrada = sc.readLine();
				System.out.println(entrada);
					
				char letra;
				valor = -1;

				for (int i = 0; i < entrada.length(); i++) {
					
					letra = entrada.charAt(i);
															
					switch (letra) {

					case 'a':
						if (valor != 2) {
							traducao = traducao + "2";
							valor = 2;
						} else {
							traducao = traducao + "2";
							valor = 2;
						}
						break;
					case 'b':
						if (valor != 2) {
							traducao = traducao + "22";
							valor = 2;
						} else {
							traducao = traducao + "22";
							valor = 2;
						}
						break;
					case 'c':
						if (valor != 2) {
							traducao = traducao + "222";
							valor = 2;
						} else {
							traducao = traducao + "222";
							valor = 2;
						}
						break;
					case 'd':
						if (valor != 3) {
							traducao = traducao + "3";
							valor = 3;
						} else {
							traducao = traducao + "3";
							valor = 3;
						}
						break;
					case 'e':
						if (valor != 3) {
							traducao = traducao + "33";
							valor = 3;
						} else {
							traducao = traducao + "33";
							valor = 3;
						}
						break;
					case 'f':
						if (valor != 3) {
							traducao = traducao + "333";
							valor = 3;
						} else {
							traducao = traducao + "333";
							valor = 3;
						}
						break;
					case 'g':
						if (valor != 4) {
							traducao = traducao + "4";
							valor = 4;
						} else {
							traducao = traducao + "4";
							valor = 4;
						}
						break;
					case 'h':
						if (valor != 4) {
							traducao = traducao + "44";
							valor = 4;
						} else {
							traducao = traducao + "44";
							valor = 4;
						}
						break;
					case 'i':
						if (valor != 4) {
							traducao = traducao + "444";
							valor = 4;
						} else {
							traducao = traducao + "444";
							valor = 4;
						}
						break;
					case 'j':
						if (valor != 5) {
							traducao = traducao + "5";
							valor = 5;
						} else {
							traducao = traducao + "5";
							valor = 5;
						}
						break;
					case 'k':
						if (valor != 5) {
							traducao = traducao + "55";
							valor = 5;
						} else {
							traducao = traducao + "_";
							traducao = traducao + "55";
							valor = 5;
						}
						break;
					case 'l':
						if (valor != 5) {
							traducao = traducao + "555";
							valor = 5;
						} else {
							traducao = traducao + "555";
							valor = 5;
						}
						break;
					case 'm':
						if (valor != 6) {
							traducao = traducao + "6";
							valor = 6;
						} else {
							traducao = traducao + "6";
							valor = 6;
						}
						break;
					case 'n':
						if (valor != 6) {
							traducao = traducao + "66";
							valor = 6;
						} else {
							traducao = traducao + "66";
							valor = 6;
						}
						break;
					case 'o':
						if (valor != 6) {
							traducao = traducao + "666";
							valor = 6;
						} else {
							traducao = traducao + "666";
							valor = 6;
						}
						break;
					case 'p':
						if (valor != 7) {
							traducao = traducao + "7";
							valor = 7;
						} else {
							traducao = traducao + "7";
							valor = 7;
						}
						break;
					case 'q':
						if (valor != 7) {
							traducao = traducao + "77";
							valor = 7;
						} else {
							traducao = traducao + "77";
							valor = 7;
						}
						break;
					case 'r':
						if (valor != 7) {
							traducao = traducao + "777";
							valor = 7;
						} else {
							traducao = traducao + "777";
							valor = 7;
						}
						break;
					case 's':
						if (valor != 7) {
							traducao = traducao + "7777";
							valor = 7;
						} else {
							traducao = traducao + "7777";
							valor = 7;
						}
						break;
					case 't':
						if (valor != 8) {
							traducao = traducao + "8";
							valor = 8;
						} else {
							traducao = traducao + "8";
							valor = 8;
						}
						break;
					case 'u':
						if (valor != 8) {
							traducao = traducao + "88";
							valor = 8;
						} else {
							traducao = traducao + "88";
							valor = 8;
						}
						break;
					case 'v':
						if (valor != 8) {
							traducao = traducao + "888";
							valor = 8;
						} else {
							traducao = traducao + "888";
							valor = 8;
						}
						break;
					case 'w':
						if (valor != 9) {
							traducao = traducao + "9";
							valor = 9;
						} else {
							traducao = traducao + "9";
							valor = 9;
						}
						break;
					case 'x':
						if (valor != 9) {
							traducao = traducao + "99";
							valor = 9;
						} else {
							traducao = traducao + "99";
							valor = 9;
						}
						break;
					case 'y':
						if (valor != 9) {
							traducao = traducao + "999";
							valor = 9;
						} else {
							traducao = traducao + "999";
							valor = 9;
						}
						break;
					case 'z':
						if (valor != 9) {
							traducao = traducao + "9999";
							valor = 9;
						} else {
							traducao = traducao + "9999";
							valor = 9;
						}
						break;
					default:
						traducao = traducao + "_";
						break;
					}
				}
				// Code here :)

				
				wr.write("Case #" + aux + ": " + traducao);
				wr.newLine();
				aux++;
				valor = -1;
				traducao = "";
			
		}
			
			
		wr.close();

	}
}
