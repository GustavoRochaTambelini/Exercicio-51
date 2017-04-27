package conjuntooperacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// acontecera a entrada e leitura de um arquivo TXT


public class lendoArquivoTXT {

	
	public static void main(String[]args) throws IOException{
		
		FileReader f = new FileReader("c:\\arq.txt");// busca o arquivo 
		BufferedReader in = new BufferedReader(f);// O BufferedReader faz a leitura do arquivo TXT
		
		String linha =in.readLine();
		
		while(linha !=null ){//Mostra na tela linha por linha do arquivo arq.txt
		System.out.println(linha);
		linha =in.readLine();
		}
		in.close();// fechar o processo 
		
	}
}
