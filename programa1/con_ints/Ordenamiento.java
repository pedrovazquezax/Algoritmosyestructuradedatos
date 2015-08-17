class Ordenamiento{


	private void CambiaDatos(int []A,int i, int j){
		int X=A[j];
		A[j]=A[i];
		A[i]=X;
	}


	public void Intercambio(int []A,int indice){
		int i,j;
		for(i=0;i<indice;i++){
			for(j=(i+1);j<=indice;j++){
				if (A[i]>A[j]) {
						
					
					CambiaDatos(A,i,j);
			
				}	
			}

		}
	}
}