package appCalculadoraDeEquacoes;

import java.util.Scanner;

public class CalculadoraEquacaoLinear {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int variavelAx;
		int variavelB;
		int numeroAposIgualdade;
		
		System.out.println("digite a variável ax: ");
		variavelAx = ler.nextInt();
		System.out.println("digite a variável b");
		variavelB = ler.nextInt();
		System.out.println("Número após sinal de iguadade (=)");
		numeroAposIgualdade = ler.nextInt();
		
		if(variavelAx == 0) {
			System.out.println("Não é uma equação de 1 grau, pois não satisfaz 'x' diferente de '0'");
		}
		else {
			System.out.println(variavelAx + "x " + variavelB + " = " + numeroAposIgualdade );
		}		
		
		
		ler.close();
	}

}
