package exercicios;

public class VetorSalarios {
	
	String [][] pessoa;
	int    tamanho;
	public VetorSalarios(){
	tamanho = 0;  
	pessoa  = new String[0][2];
	}
	public void add(String nome, String salario ){
	tamanho ++;
	String [][] tmp = new String[tamanho][2];
	for (int i = 0; i < pessoa.length;i++) {
	tmp[i] = pessoa[i];  
	}
	pessoa = new String[tamanho][2]; 
	pessoa = tmp;
	pessoa[tamanho-1][0] = nome;
	pessoa[tamanho-1][1] = salario;
	}
	    public String[][] getValues(){
	    return pessoa;
	    }
	}

