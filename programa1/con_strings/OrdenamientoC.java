class Ordenamientoc{


	private void CambiaDatos(String []A,int i, int j){
		String X=A[j];
		A[j]=A[i];
		A[i]=X;
	}


	public void Intercambio(String []A,int indice){
		int i,j;
		for(i=0;i<indice;i++){
			for(j=(i+1);j<=indice;j++){
				if (A[i].compareTo(A[j])>0) {
						
					
					CambiaDatos(A,i,j);
			
				}	
			}

		}
	}

		public void Seleccion(String []A,int indice){
		int i,im,j;

			for (i=0;i<indice;i++) {
				im=i;
					for (j=(i+1);j<=indice;j++) {
						if (A[im].compareTo(A[j])>0) {
							im=j;
						}
						
					}
				
				if (i!=im) {
					CambiaDatos(A,im,i);
				}
			}

	}
	
	public void Insercion(String []A,int indice){
		int i,j;
		String aux;
		for (i=1;i<=indice;i++) {
			j=i;
			aux=A[i];
			//
			while(j>0&&aux.compareTo(A[j-1])<0){
				A[j]=A[j-1];
				j--;
			}
			A[j]=aux;
		}

	}
}