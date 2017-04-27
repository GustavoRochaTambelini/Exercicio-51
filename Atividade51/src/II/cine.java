package II;

import java.util.Scanner;

public class cine {
	
	
	public static void main(String [] args){
		Scanner teclado= new Scanner (System.in);
		int cad [][]= new int [12][22];
		int op=1;
		for(int i=0;i<12;i++){
			for(int j=0;j<22;j++){
				cad [i][j]=0;
			}
		}
		do{
		System.out.println("1- vender ingresso\n2- ver isposocao das cadeiras \n3-reintegrar");
		
		switch (op){
		case 1:
			
		
			
		System.out.println("\nFila: ");
			int li = teclado.nextInt();
			System.out.println("\nCadeira: ");
			int co = teclado.nextInt();
			cad[li-1][co-1]=1;
			break;
		case 2 :
			char letr1='z';
			int charVal = letr1;
			for(int i=0;i<12;i++){
				for(int j=0;j<22;j++){
					if(cad[i][j]==0){
						System.out.println(""+charVal);
					}else
						System.out.println("&");
				}
			}
			
			break;
		case 3 :
			System.out.println("Reiniciar uma(1).....\nReiniciar TUDO (2....)");
			int cond = teclado.nextInt();
			if (cond==1){
			System.out.println("\nFila: ");
			int lin = teclado.nextInt();
			System.out.println("\nCadeira: ");
			int col = teclado.nextInt();
			cad[lin-1][col-1]=0;
			}else
				for(int i=0;i<12;i++){
					for(int j=0;j<22;j++){
						cad[i][j]=0;
					}
				}
			break;
			default:
				op=0;
		}
	} while(op!=0);
}

	

}
