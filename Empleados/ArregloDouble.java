class ArregloDouble{
	//atributos
		private double arreglo[];
		private int indice;
	//constructores 


		public ArregloDouble(int max){

			arreglo=new double[max];
			indice = -1;

	}
	//metodos
	public boolean ValidaEspacio(){
		if (indice<arreglo.length-1)
			return true;
		else
			return false;
	}


	public void Insertar(double dato){
		indice ++;
		arreglo[indice]=dato;

	}

	public void ListarT (){
	
	for (int i=0;i<=indice;i++)
		System.out.println("Sueldo "+(i+1)+"="+arreglo[i]);
		//System.out.println(arreglo[i]);

	}

	public int BuscaInfo(double dato,int pos){

		for(int i=pos;i<=indice;i++){
			if(arreglo[i]==dato)
				return i;
		}
		return -1;
	}

	public void Actualizar(int pos,double dato){
		arreglo[pos]=dato;
	}

	public int Indice1(){
		int x=indice;
		return x;
	}

	public void Listar(int pos){
		System.out.println("el dato es "+arreglo[pos]);
	}


	public void Borrar(int pos){
			
			arreglo[pos]=arreglo[indice];
			indice=indice-1;
	}
	public void Ordenar(){
		OrdenamientoDouble ordenar1=new OrdenamientoDouble();
					
		//ordenar1.Intercambio(arreglo,indice);
		ordenar1.Seleccion(arreglo,indice);
		//ordenar1.Insercion(arreglo,indice);


	}
	
	

}