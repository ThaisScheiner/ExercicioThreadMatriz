package controller;

public class ThreadMatrizController extends Thread
{
	private int num;
	private int matriz[][] = new int [3][5];
	
	public ThreadMatrizController(int matriz[][], int num) 
	{
		this.num = num;
		this.matriz = matriz;
	}
	
	@Override
	public void run() 
	{
		ThreadCalcSoma();

	}
	
	private void ThreadCalcSoma()
	{
		int resultado = 0;
		
		for(int i = 0; i < 5; i++)
		{
			resultado = matriz[num][i];
		}
		System.out.println("A soma da linha " + num + " = " +  resultado);
	}
}
