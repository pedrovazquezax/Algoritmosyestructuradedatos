class Ordenamiento{
	
	private void CambiaDatos(Nodo aux,Nodo aux1){
		Nodo
		String X=A[j];
		A[j]=A[i];
		A[i]=X;
	}


	public void Intercambio(Nodo t,Nodo h){
		Nodo aux,aux1;
		for(aux=h;aux!=null;aux=aux.GetLigaDer()){
			for(aux1=aux.GetLigaDer();aux!=null;aux1=aux1.GetLigaDer()){
				if (aux.GetInfo()>aux1.GetInfo()) {
						
					
					CambiaDatos(aux,aux1);
			
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