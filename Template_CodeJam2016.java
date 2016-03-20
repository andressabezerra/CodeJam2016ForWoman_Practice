import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Template_CodeJam2016 {
	
	public static void main(String[] args) throws IOException {

		int T, aux;
		aux = 1;
		
		final String filename = "output.txt";

		BufferedWriter wr = new BufferedWriter(new FileWriter(new File(filename), true));

		Scanner sc = new Scanner(new FileReader("input.in"));

		T = sc.nextInt();
		
		while(sc.hasNext()){
			
			// Code here :)			
		
			wr.write("Case #" + aux + ": ");
			wr.newLine();
			aux++;
			
		}
		
		wr.close();
		
	}
}
