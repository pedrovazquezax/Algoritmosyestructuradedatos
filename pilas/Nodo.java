class Nodo{
	//atributos
	private int info;
	private Nodo ligaDer;
	//constructores
	public Nodo(int dato,Nodo id){
		info=dato;
		ligaDer=id;

	}	
	//metodos
	public void SetInfo(int dato){
		info=dato;
	}
	public void SetLigaDer(Nodo id){
		ligaDer=id;
	}
	public int GetInfo(){
		return info;
	}
	public Nodo GetLigaDer(){
		return ligaDer;
	}
}