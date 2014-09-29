package exercicios;

import java.util.Scanner;


	public class Tabuada {
		
		public static void main(String[] args) {
			Scanner recebe = new Scanner(System.in);

			String  msg = "";
			int     number   = 0;
			Boolean verde   = false;
			
			while(!verde){
				try{
					System.out.println("Digite algum numero de 1 a 10");
					number = recebe.nextInt();
					if(!((number < 1 ) || (number > 10 ))){
						verde = true;
					}
				}catch (NumberFormatException e) {
					System.out.println("Não é Valido");
				
				}
			}
			
			for (int i = 1; i <= 10 ; i++) {
				msg += number+" X "+i+" = "+number*i+" \n";
			}
				
			System.out.println(msg);
		}
}