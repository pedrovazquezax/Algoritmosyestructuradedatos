class OrdenamientoDouble{


	private void CambiaDatos(double []A,int i, int j){
		double x;
		x=A[j];
		A[j]=A[i];
		A[i]=x;
	}


	public void Intercambio(double []A,int indice){
		int i,j;
		for(i=0;i<indice;i++){
			for(j=(i+1);j<=indice;j++){
				if (A[i]>A[j]) {
						
					
					CambiaDatos(A,i,j);
			
				}	
			}

		}
	}

	public void Seleccion(double []A,int indice){
		int i,j;
		int im;

			for (i=0;i<indice;i++) {
				im=i;
					for (j=(i+1);j<=indice;j++) {
						if (A[im]>A[j]) {
							im=j;
						}
						
					}
				
				if (i!=im) {
					CambiaDatos(A,im,i);
				}
			}

	}
	
	public void Insercion(double []A,int indice){
		int i,j;
		double aux;
		for (i=1;i<=indice;i++) {
			j=i;
			aux=A[i];
			while(j>0&&aux<A[j-1]){
				A[j]=A[j-1];
				j--;
			}
			A[j]=aux;
		}

	}
}