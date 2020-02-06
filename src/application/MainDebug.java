
package application;
import java.util.*;


public class MainDebug {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int x,y,w,z;
		
		System.out.println("Digite quantas linhas a matriz 1 vai ter");
		x = scn.nextInt();
		
		System.out.println("Digite quantas colunas a matriz 1 vai ter");
		y = scn.nextInt();
		
		int[][] matriz1 = new int[x][y];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.println("Digite um numero para " + (i +1) + " linha e " + (j + 1) + " coluna");
				matriz1[i][j] = scn.nextInt();
			}
		}
		w = 0;
		for (int i = 0; i < matriz1.length; i++) {
			System.out.println(matriz1[i][i]);
			
		}
		
		
		
	}

}
