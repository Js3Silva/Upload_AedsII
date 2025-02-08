package application;

import java.util.Scanner;

public class Program {

	
	public static int verificarRepeticao(int n, int[] vetor, int indice) {
		if(indice < 0)
			return 0;
		else if(vetor[indice] == n)
			return 1+verificarRepeticao(n, vetor, indice - 1);
		else
			return verificarRepeticao(n, vetor, indice - 1);
	}
	
	public static double somaDouble(double[] v, int indice) {
		if(indice < 0) 
			return 0;
		else
			return v[indice] + somaDouble(v, indice - 1);
	}
	
	public static int somaPares (int n) {
		if(n == 0)
			return 0;
		else if(n%2 == 0)
			return n + somaPares(n-2);
		else
			return somaPares(n-1);
	}
	
	public static void menu() {
		System.out.println("Escolha uma opção: ");
		System.out.println("-------------------");
		System.out.println("1 - Somar todos os números pares até o limite ");
		System.out.println("2 - Somar todos os elementos do vetor");
		System.out.println("3 - Quantidade de repetições do número escolhido");
		System.out.println("-------------------");
		System.out.println("0 - SAIR");
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, opcao;
		
		do {
		menu();
		opcao = teclado.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Digite o limite: ");
			n = teclado.nextInt();
			System.out.println("Resultado: " + somaPares(n));
			break;
		case 2:
			System.out.println("Qual o tamanho do vetor? ");
			n = teclado.nextInt();
			double[] vetor = new double[n];
			for(int i = 0; i<vetor.length; i++) {
				vetor[i] = teclado.nextDouble();
			}
			System.out.println("Resultado: " + somaDouble(vetor, n-1));
			break;
		case 3:
			System.out.println("Qual o tamanho do vetor? ");
			n = teclado.nextInt();
			int[] v = new int[n];
			for(int i = 0; i<v.length; i++) {
				v[i] = teclado.nextInt();
			}
			System.out.println("Qual número você deseja verificar? ");
			int numero = teclado.nextInt();
			System.out.println("Resultado: " + verificarRepeticao(numero, v, n-1));
			break;
		default: 
			
			break;
		}
	}while(opcao!=0);
		
	teclado.close();	
	}

}