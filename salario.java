package exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

//Implemente um programa que possibilite a entrada de N valores de nomes e sal�rios,
//exiba como resultado o sal�rio m�dio calculado e o nome da pessoa que recebe o maior sal�rio.


public class salario {
	
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
		
		String  			msg    = "";
		String  			name        = "";
		String              salario     = "";
		VetorSalarios 	jolene 		= new VetorSalarios();
		String[][]          vetor;        
		String[]            aju;
		
		while(!name.equals("S")){
			
			System.out.println("Digite um Nome");
			name = teclado.toString();
			
			System.out.println("Digite o Salario");
			salario = teclado.toString();
			
			salario = salario.replace(",",".");
			
			if(!name.equals("S")){
				jolene.add(name,salario);
			}
		}
		
		vetor  		= jolene.getValues();
		
		for (int i = 0; i < vetor.length; i++) {
			
			for (int j = 0; j < vetor.length-1; j++) {
				
				if (Float.parseFloat(vetor[j][1]) > Float.parseFloat(vetor[j + 1][1])) {
					aju          = vetor[j];
					vetor[j]     = vetor[j + 1];
					vetor[j + 1] = aju;
				}
			}
		}
		
		
		msg  += "o maior salario �: \n";
		msg += "Nome: "+vetor[vetor.length-1][0]+" \n"; 
		msg += "Salario: "+vetor[vetor.length-1][1]+" \n";
		
		System.out.println(msg);
	}

}