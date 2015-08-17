class Pila{
	//atributos
	private String []pila;
	private int tope;
	//constructores
	public Pila(int max){
	pila= new String[max];
	tope=-1;
	}	
	public boolean ValidaEspacio(){
		return (tope<pila.length-1);
	}
	public void Push(String dato){ 
		tope++;
		pila[tope]=dato;
	}
	public boolean ValidaVacio(){
		return (tope==-1);
	}
	public boolean Mayor(){
		return (tope>0);
	}
	public String Pop(){
		String aux=pila[tope];
			tope--;
		return aux;
	}
	public String GetDatoTope(){
		return pila[tope];
	}
	public void Listar(){
		int i;
		for (i=tope;i>=0;i--)
			System.out.println(pila[i]);
	}
	public String aString(){
		int i;
		StringBuffer cadena = new StringBuffer();
		for ( i=0;i<=tope;i++){
   		cadena =cadena.append(pila[i]);
	}
		return cadena.toString();
	}

}