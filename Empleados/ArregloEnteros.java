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

	public int BuscaInfo(int dato,int pos){

		int i;
		for(i=pos;i<=indice;i++){
			if(arreglo[i]==dato){
				return i;
			}
		}
		return -1;
	}

	public int BuscaInfo1(int dato,int pos){

		int i;
		for(i=(pos+1);i<=indice;i++){
			if(arreglo[i]==dato){
				return i;
			}
		}
		return -1;
	}

	public void Actualizar(int pos,int dato){
		arreglo[pos]=dato;
	}

	public int Indice1(){
		int x=indice;
		return x;
	}

	public void Listar(int pos){
		System.out.println("["+pos+"]="+arreglo[pos]);
	}
	//public int Listar(int pos){
	//	return arreglo[pos];
	//}


	public void Borrar(int pos){
			
			arreglo[pos]=arreglo[indice];
			indice--;
	}
	public void Ordenar(){
		OrdenamientoInt ordenar1=new OrdenamientoInt();
		//ordenar1.Intercambio(arreglo,indice);
		ordenar1.Seleccion(arreglo,indice);
		//ordenar1.Insercion(arreglo,indice);


	}
	
	

}