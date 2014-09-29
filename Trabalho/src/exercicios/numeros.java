package exercicios;

import java.util.Scanner;

public class numeros{

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		Integer []  num1    = new Integer[11];
		Integer number     = 0; 
		Integer resultado  = 0;        
		
		for (int i = 0; i < 10; i++) {
			try{
				System.out.println("Digite um numero");
				number = teclado.nextInt();
				num1[i] = number;
			}catch(NumberFormatException e){
				System.out.println("ERRO! NUMERO INCORRETO");
				
			}
		}
		
		for (Integer i : num1) {
			
			if(i == number){
				resultado ++;
			}
		}
		System.out.println("Parabéns Você digitou 10 Numeros!'");
		
	}
}
