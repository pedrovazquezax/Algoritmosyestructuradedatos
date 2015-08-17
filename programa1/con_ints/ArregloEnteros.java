class ArregloEnteros{
	//atributos
		private int arreglo[];
		private int indice;
	//constructores 


		public ArregloEnteros(int max){

			arreglo=new int[max];
			indice = -1;

	}
	//metodos
	public boolean ValidaEspacio(){
		if (indice<arreglo.length-1)
			return true;
		else
			return false;
	}


	public void Insertar(int dato){
		indice ++;
		arreglo[indice]=dato;

	}

	public void ListarT (){
	
	for (int i=0;i<=indice;i++)
		System.out.println("["+i+"]="+arreglo[i]);
		//System.out.println(arreglo[i]);

	}

	public int BuscaInfo(int dato){

		for(int i=0;i<=indice;i++){
			if(arreglo[i]==dato)
				return i;
		}
		return -1;
	}

	public void Actualizar(int pos){
		arreglo[pos]=Teclado.entero("dame un nuevo valor   \n");
	}

	public int Indice1(){
		int x=indice;
		return x;
	}

	public void Listar(int pos){
		System.out.println("el numero es "+arreglo[pos]);
	}


	public void Borrar(int pos){
			
			arreglo[pos]=arreglo[indice];
			indice--;
	}
	public void Ordenar(){
		Ordenamiento ordenar1=new Ordenamiento();
		ordenar1.Intercambio(arreglo,indice);


	}
	
	

}