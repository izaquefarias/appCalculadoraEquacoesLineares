package appCalculadoraDeEquacoes;

import java.util.Scanner;

public class CalculadoraEquacaoLinear {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int variavelAx;
		int variavelB;
		int numeroAposIgualdade;
		
		System.out.println("digite a vari�vel ax: ");
		variavelAx = ler.nextInt();
		System.out.println("digite a vari�vel b");
		variavelB = ler.nextInt();
		System.out.println("N�mero ap�s sinal de iguadade (=)");
		numeroAposIgualdade = ler.nextInt();
		
		if(variavelAx == 0) {
			System.out.println("N�o � uma equa��o de 1 grau, pois n�o satisfaz 'x' diferente de '0'");
		}
		else {
			System.out.println(variavelAx + "x " + variavelB + " = " + numeroAposIgualdade );
		}		
		
		
		ler.close();
	}

}
