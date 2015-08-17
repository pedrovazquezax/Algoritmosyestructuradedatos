
public class Ordenamientos {
    
    		private void imprimePasada(int []v) {
		   for (int i=0; i < v.length; i++) 
				System.out.print(v[i] + "\t");
			System.out.println();
		}
		
      private void intercambiar(int []v, int i, int j) {
		    int aux;
			 
			 aux = v[i];
			 v[i] = v[j];
			 v[j] = aux;
		}

     public void intercambio(int []v) {
	       int i,j;
			 for (i=0; i < v.length-1 ; i++){
			  	for (j = i+1; j < v.length; j++)
					if (v[i] > v[j])
						intercambiar(v,i,j);
				 imprimePasada(v);
			}

	  }
	
	public void seleccion(int []v) {
	       int indiceMenor=0,i,j, n;
			 n = v.length;
			 
			 for (i=0; i < n-1 ; i++) {
					indiceMenor= i;
				 	for (j = i+1; j < n ; j++) 
					    if (v[j]< v[indiceMenor])
						    indiceMenor = j;
				   if (i != indiceMenor)
			        intercambiar(v,i,indiceMenor);
				   imprimePasada(v);
		
			 }
	}


    
	public void insercion(int []v, int indice) {
	       int i,j,aux;
		 
			 for (i=1; i <= indice ; i++) {
					j=i;
					aux = v[i];
					while (j > 0 && aux < v[j-1]) {
					    v[j] = v[j-1];
						 j--;
					}
					v[j] = aux;
			     imprimePasada(v);
			}
	}
        
        	public void insercion2(Cliente []v, int indice) {
	       int i,j;
               Cliente aux;
               
		 
			 for (i=1; i <= indice ; i++) {
					j=i;
					aux = v[i];
					while (j > 0 && aux.getClave() < v[j-1].getClave()) {
					    v[j] = v[j-1];
						 j--;
					}
					v[j] = aux;

			}
	}
}
