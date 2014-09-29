package exercicios;

import java.math.BigDecimal;
import java.util.Scanner;

public class Maca {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int quantas;
		int quantidade; 
		BigDecimal valor  = new BigDecimal("0.00");
		
		System.out.println("Quantas maçãs foram compradas?");
		quantidade = teclado.nextInt();
		
		if(quantidade <= 12){
			valor = new BigDecimal("1.30");
			valor = valor.multiply(new BigDecimal(String.valueOf(quantidade)));
		}else{
			valor = new BigDecimal("1.00");
			valor = valor.multiply(new BigDecimal(String.valueOf(quantidade)));
		}
		
		System.out.println("a compra é de:"+ valor.toString());
		
	
	}

}
