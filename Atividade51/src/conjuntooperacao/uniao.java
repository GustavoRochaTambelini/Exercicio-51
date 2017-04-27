package conjuntooperacao;

public class uniao {
	
	public void funcao(){}
	

	public static void main (String[]args){
	
		int a[] = new int [5];
		// 1° conjunto
		a[0]=1;
		a[1]=2;
		// 2° conjunto
		a[2]=1;
		a[3]=3;
		a[4]=6;
		
		
		int vetorAuxiliar []= new int [7];
		
		for(int i = 0; i < 7; i++){
            vetorAuxiliar[i] = 0;
        }
		
		 for(int i = 0; i < 5; i++){
	            vetorAuxiliar[a[i]]++;
	        }
		 
		for(int i=0;i<7;i++){
		//System.out.println(vetorAuxiliar[i]);
		
			if(vetorAuxiliar[i]!=0){
				System.out.println(i);
			}
		}
	
	
	}

}
