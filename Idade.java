package exercicios;
import java.util.Scanner;

public class Idade {
	public static void main(String [] args){
	
	Scanner teclado = new Scanner(System.in);
	
	int idade;
	int idadeanos;
	int quantidademeses;
	
	System.out.println("Digite a sua idade em dias");
	idade = teclado.nextInt();
	
	idadeanos = idade/365;
	quantidademeses = idade/30;
	
	
	System.out.println("Sua Idade em Anos �:   "   + idadeanos +  "  Sua Idade em Meses �:  "  + quantidademeses +"  Sua Idade em dias �:  " + idade);
	}
			
}