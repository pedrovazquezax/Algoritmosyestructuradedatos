class PilaDinamica{
	//atributos
	private Nodo tope;
	//constructores
	public void Push(int dato){ 
		Nodo q= new Nodo(dato,tope);
		tope=q;
	}
	public boolean ValidaVacio(){
		return(tope==null);
	}
	public Nodo Pop(){
		Nodo aux=tope;
		tope=tope.GetLigaDer();
		return aux;
	}
	public int GetDatoTope(){
		return tope.GetInfo();
	}
	public void Listar(){
		Nodo q;
		for(q=tope;q!=null;q=q.GetLigaDer())
			System.out.println(q.GetInfo());

	}

}