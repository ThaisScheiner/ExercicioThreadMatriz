package view;

import java.util.Random;

import controller.ThreadMatrizController;

public class Principal {

	public static void main(String[] args) 
	{
		int matriz[][] = new int [3][5];
		Random aleatorio = new Random();
		int i;
		int j;
		
		System.out.println(" Matriz \n");
		for( i = 0; i < matriz.length; i++)
		{
			for(j = 0; j < matriz[i].length; j++)
			{
				matriz[i][j] = aleatorio.nextInt(15);
				
				System.out.println(matriz[i][j]);
			}
			System.out.println();
		
			
		}
		System.out.println("=========================\n");
		
		for(int t = 0; t <3; t++)
		{
			Thread ThreadCalc = new ThreadMatrizController(matriz, t );
			ThreadCalc.start();
		}

	}

}
