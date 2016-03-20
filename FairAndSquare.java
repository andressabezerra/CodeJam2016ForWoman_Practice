import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FairAndSquare {
	
	public static void main(String[] args) throws IOException {

		int T, aux;
		aux = 1;
		
		final String filename = "output.txt";

		BufferedWriter wr = new BufferedWriter(new FileWriter(new File(filename), true));

		Scanner sc = new Scanner(new FileReader("input.in"));

		T = sc.nextInt();
		int a, b, count;
		double sqrt;
		
		while(sc.hasNext()){
			
			a = sc.nextInt();
			b = sc.nextInt();
			count = 0;
			
			for(int i = a; i <=b; i++){
				
				sqrt = Math.sqrt(i);
				
				if(ehPalindromo(Integer.toString(i)) == true && (i == Math.round(sqrt)*Math.round(sqrt))){
					
				}
			}
			
			
			// Code here :)			
		
			wr.write("Case #" + aux + ": " + count);
			wr.newLine();
			aux++;
			
		}
		
		wr.close();
		
	}

	private static boolean ehPalindromo(String string) {
		// TODO Auto-generated method stub
		return false;
	}
}
