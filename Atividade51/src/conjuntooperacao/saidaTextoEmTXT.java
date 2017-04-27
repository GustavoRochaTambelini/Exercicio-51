package conjuntooperacao;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class saidaTextoEmTXT {

	public static void main(String[]args) throws IOException{
		
		InputStreamReader conversor = new InputStreamReader (System.in);// possibilita digitar texto
		
		BufferedReader bf = new BufferedReader(conversor); // pega o texto digitado e mando para o arqSaida
		
		boolean continua= true;
		String linha ;
		
		FileWriter f = new FileWriter ("c:\\arqSaida");//cria arquivo
		PrintWriter out = new PrintWriter (f);//joga o aquivo pra fora
		
		System.out.println("Digite");
		while(continua){
		linha = bf.readLine();  //Lê do teclado
		if (linha.equals("fim")){
		continua=false;
		}else{
		out.println(linha);  //Grava no arquivo
		
		}
		}
		bf.close();
		out.close();
		
	}
	
	
	
}
