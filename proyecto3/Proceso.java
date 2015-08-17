class Proceso{
	//atributos
	private String id;
	private int nopags;
	private int prioridad;
	//constructores 

	//metodos
	public void LeeId(){
		id=Teclado.cadena("Ingresa el id");
	}

	public void LeePags(){
		nopags=Teclado.entero("Ingresa tu el numero de paginas");
	}
	public void LeePrior(){
		do{
			prioridad=Teclado.entero("Ingresa la prioridad");
		}while(prioridad<0||prioridad>10);
	}
	public void Capturar(){
		LeeId();
		LeePags();
		LeePrior();
	}
	public int GetPrior(){
		return prioridad;
	}

}