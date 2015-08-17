class Nodo{
	//atributos
	private Proceso info;
	private Nodo ligaDer;
	//constructores
	public Nodo(Proceso dato,Nodo id){
		info=dato;
		ligaDer=id;

	}	
	//metodos
	public void SetInfo(Proceso dato){
		info=dato;
	}
	public void SetLigaDer(Nodo id){
		ligaDer=id;
	}
	public Proceso GetInfo(){
		return info;
	}

	public int GetInfoOrd(){
		return info.GetPrior();
	}
	public Nodo GetLigaDer(){
		return ligaDer;
	}
}