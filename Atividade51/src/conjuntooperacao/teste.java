package conjuntooperacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class teste {

	
	
	public static void main(String[]args) throws IOException{
		
		
		FileReader fr = new FileReader("c:\\arq.txt");
		
		BufferedReader br = new BufferedReader(fr);
		String linha;
		
		
		linha=br.readLine();
		
		
		if(linha!=null){
			System.out.println(linha);
			 
			linha=br.readLine();
			
		}
			
		
	}
}
