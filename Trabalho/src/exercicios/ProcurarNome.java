package exercicios;

import java.util.Scanner;

public class ProcurarNome {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String names;
		String   recebe   = "";
		String  msg    = "";
		
		for(int i = 0; i < 3; i++){
			System.out.println("Digite um Nome");
			names = teclado.toString(); 
		}
		
		System.out.println("Digite um nome para pesquisa:");
		recebe = teclado.toString();
	
		for (String nome : names) {
			if(nome.contains(recebe)){
				recebe  = "o Nome é:"+nome;
				break;
			}
		}
		
		if(!msg.equals("")){
			System.out.println(msg);
		}else{
			System.out.println("Não consta no banco de dados!");;
		}
	}

}