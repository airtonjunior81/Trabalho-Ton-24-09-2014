package exercicios;

public class Vetor {
	
	int [] info;
	int    bigger;
	public Vetor(){
	bigger = 0;  
	info   = new int[0];
	}
	public void add(int valor){
	bigger ++;
	int [] tmp = new int[bigger];
	for (int i = 0; i < info.length;i++) {
	tmp[i] = info[i];  
	}
	info = new int[bigger]; 
	info = tmp;
	info[bigger-1] = valor;
	}
	    public int[] getValues(){
	    return info;
	    }
	}
