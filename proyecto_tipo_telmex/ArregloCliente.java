class ArregloCliente{
	 private Cliente []arreglo;
    private int indice;
    Ordenamientos ord = new Ordenamientos();

     public ArregloCliente(int max){
        arreglo = new Cliente[max];
        indice=-1;
    }

    public boolean ValidaEspacio() {
        return (indice < arreglo.length-1) ;
    }

    public void InsertarCliente(Cliente dato) {
        indice ++;
        arreglo[indice]=dato;
    }
    public void Listar() {
        int i;
        for(i=0;i<=indice;i++){
            arreglo[i].Listar();
        }
    }
    public void Listar(int pos){
        arreglo[pos].Listar();
    }
    public int BuscaInfo(int dato, int pos){ //el main pide el dato abuscar, realiza la busqueda a traves de ejecutar busca info
		int i;
		for(i=pos; i<=indice ; i++)
			if(arreglo[i].getClave()==dato)
				return i;
		System.out.println("no se encontro el dato");
		return -1;
	}
	public void Actualizar(int pos){
        arreglo[pos].Actualizar();
    }
    public Cliente Borrar(int pos){
        Cliente aux = arreglo[pos];
        arreglo[pos]=arreglo[indice];
        indice--;
        return aux;
    } public void Ordenar(){
        Ordenamientos ord = new Ordenamientos();
        ord.insercion2(arreglo,indice);
    }

    public int getIndice(){
        return indice;
    }

    public Cliente getDato(int pos){
        return arreglo[pos];
    }

}
