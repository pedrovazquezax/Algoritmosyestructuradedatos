class ArregloCadenas{
	//atributos
		private String arreglo[];
		private int indice;
	//constructores 


		public ArregloCadenas(int max){

			arreglo=new String[max];
			indice = -1;

	}
	//metodos
	public boolean ValidaEspacio(){
		if (indice<arreglo.length-1)
			return true;
		else
			return false;
	}


	public void Insertar(String dato){
		indice ++;
		arreglo[indice]=dato;

	}

	public void ListarT (){
	
	for (int i=0;i<=indice;i++)
		System.out.println("Telefono "+(i+1)+"="+arreglo[i]);
		//System.out.println(arreglo[i]);

	}

	public int BuscaInfo(String dato,int pos){

		for(int i=pos;i<=indice;i++){
			if(dato.equals(arreglo[i]))
				return i;
		}
		return -1;
	}

	public void Actualizar(int pos){
		arreglo[pos]=Teclado.cadena("dame un nuevo dato  \n");
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
		OrdenamientoC ordenar1=new OrdenamientoC();
					
		//ordenar1.Intercambio(arreglo,indice);
		ordenar1.Seleccion(arreglo,indice);
		//ordenar1.Insercion(arreglo,indice);


	}
	
	

}