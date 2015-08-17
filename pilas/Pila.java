class Pila{
	//atributos
	private int []pila;
	private int tope;
	//constructores
	public Pila(int max){
	pila= new int[max];
	tope=-1;
	}	
	public boolean ValidaEspacio(){
		return (tope<pila.length-1);
	}
	public void Push(int dato){ 
		tope++;
		pila[tope]=dato;
	}
	public boolean ValidaVacio(){
		return (tope==-1);
	}
	public int Pop(){
		int aux=pila[tope];
			tope--;
		return aux;
	}
	public int GetDatoTope(){
		return pila[tope];
	}
	public void Listar(){
		int i;
		for (i=tope;i>=0;i--)
			System.out.println(pila[i]);
	}

}