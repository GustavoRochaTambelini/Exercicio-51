package conjuntooperacao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class entradaSaida {

	public static void main(String[]args)throws IOException{
		
		File diretorio = new File("novo");// criando local onde estará o  diretorio
		diretorio.mkdir();// cria um diretório com o nome do arquivo, no caso ("c:\\novo")
		
		File subir1 = new File(diretorio,"subir1");//local e nome
		subir1.mkdir();//criando 
		
		File subir2 = new File (diretorio,"subir2");
		subir2.mkdir();
		
		File arquivo = new File(diretorio,"arquivoVazio.txt");
		FileWriter f = new FileWriter(arquivo);
		f.close();
		
		String[] arquivos = diretorio. list();
		for (int i =0;i<arquivos.length; i++) {
		File filho = new File( diretorio, arquivos[ i]);
		System. out. println(filho.getAbsolutePath());
		}
		
		
		
		
	}
	
	
	
}
