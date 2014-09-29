package exercicios;

import java.util.Scanner;


public class pares{

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int number;
		System.out.println("Digite um Numero por Favor");
		number = teclado.nextInt();
		String msg  = "";
		
		if((number % 2) == 0){
			msg = "O numero é PAR ";
		}else{
			msg = "O numero é IMPAR ";
		}
		
		if(number > 0){
			msg += " e Positivo";
		}else{
			msg += " e Negativo";
		}
		System.out.println(msg);
	}
}