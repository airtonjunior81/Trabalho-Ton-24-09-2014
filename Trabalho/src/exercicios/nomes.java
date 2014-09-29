package exercicios;
import java.util.Scanner;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class nomes {
	
	   public static void main(String []args){
		   
		   ArrayList<String> nome = new ArrayList<String>();
		   ArrayList<String> pesquisa = new ArrayList<String>();
		   String          digitado = "";
		   String  msg              = "";
		   
		   while (digitado != ""){
			   digitado = JOptionPane.showInputDialog(null,"Digite Um Nome");
			   nome.add(digitado);
		   }
		   
		       digitado = JOptionPane.showInputDialog(null,"Digite Para Pesquisar");
		       
			 for (String nomes : pesquisa){
				 if(nome.contains(digitado)){
					 pesquisa.addAll(nome);
				 }
			 }
					 
			 
			
    }
}
