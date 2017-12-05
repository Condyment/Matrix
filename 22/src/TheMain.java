import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TheMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {

			FileReader in = new FileReader("data.txt");
			char[] arra = new char[10];
			in.read(arra);

			String p = "" + arra[0];
			String o = "" + arra[1];
			int m = Integer.parseInt(p);
			int n = Integer.parseInt(o);
			int numbers[] = new int[10];
			int matrice[][] = new int[m][n];
			int y = 0;
			for (int i = 2; i < 6; i++) {

				numbers[y] = Integer.parseInt(String.valueOf(arra[i]));
				y++;

			}

			for (int i = 0; i < 4; i++) {
				System.out.println(numbers[i]);

			}
			int l = 0;
			for (int i = 0; i < matrice.length; i++) {
				for (int j = 0; j < matrice[i].length; j++) {
					matrice[i][j] = numbers[l];
					l++;
				}
			}
			for (int i = 0; i < matrice.length; i++) {
				for (int j = 0; j < matrice[i].length; j++) {
					System.out.println(matrice[i][j]);
				}
			}

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			int matrice1[][] = new int[m][n];

			for (int i = 0; i < matrice1.length; i++) {
				for (int j = 0; j < matrice1[i].length; j++) {
					String str = br.readLine();
					matrice1[i][j] = Integer.parseInt(str);

				}
			}

			int matricesuma[][] = new int[m][n];
			for (int i = 0; i < matrice.length; i++) {
				for (int j = 0; j < matrice[i].length; j++) {
					matricesuma[i][j] = matrice1[i][j] * matrice[j][i];
				}
			}
			FileWriter fw = new FileWriter("out.txt");
			for (int i = 0; i < matricesuma.length; i++) {
				for (int j = 0; j < matricesuma[i].length; j++) {
				fw.write("\n"+matricesuma[i][j]);
				}
			}
			fw.close();

		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
		System.out.println("done");
	}

}
