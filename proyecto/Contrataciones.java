class Contrataciones{
	//atributos
	private int dia;
	private int ann;
	private int mes;
	private PTelefono sT;
	private PTele sTele;
	private PInternet sI;
	private Paquetes paq; 
	private int o;
	//constructor
	public Contrataciones(){
		sT=new PTelefono();
		sTele=new PTele();
		sI=new PInternet();
		paq=new Paquetes();
	}

	//metodos
	public void LeeFecha(){
		do{
		dia=Teclado.entero("Dame el dia de contratacion");
		}while(dia>31||dia<1);
		do{
		mes=Teclado.entero("Dame el mes de contratacion ");
		}while(mes>12||mes<1);
		
		do{
		ann=Teclado.entero("Dame el año de contratacion");
		}while(ann>9999||ann<1);
	}
	public void LeeST(){
		sT.Capturar();

	}
	public void LeeSTele(){
		sTele.Capturar();

	}
	public void LeeSI(){
		sI.Capturar();

	}
	public void LeePaq(){
		paq.Capturar();
	}
	public void Capturar(){
		LeeFecha();
		Menu m= new Menu();
		int o1;
		o=m.DespliegaMenu("¿Que esta contratando? \n1.- Servicios \n2.-Paquetes\nOpcion: ",2);
		if (o==2)
			LeePaq();
		else {
			do{
				o1=m.DespliegaMenu("¿Cual servicio? \n1.-Telefono\n2.-Television\n3.-Internet\n4.-Salir\nOpcion: ",4);
				switch(o1){
					case 1:
					LeeST();
					break;
					case 2:
					LeeSTele();
					break;
					case 3:
					LeeSI();
					break;

				}
			}while(o1!=4);

		}

	}
	public void Listar(){
		System.out.println("La fecha de contratacion es "+dia+"/"+mes+"/"+ann+" ");
			if (o==1){
				sT.Listar();
				sTele.Listar();
				sI.Listar();
			}
			else{
				paq.Listar();
			}
	}
	public void Actualizar(){
		if (o==1){
				paq.Actualizar();
			}
			else{
				sT.Actualizar();
				sTele.Actualizar();
				sI.Actualizar();
			}


	}
	public Double getPrecio(){
		if (o==1){
		return sT.getPrecio()+sTele.getPrecio()+sI.getPrecio();
		}
		else{
			return paq.getPrecio();
		}
	}
	public int getMB(){
		if (o==1){
		return sI.getMB();
		}
		else{
			return paq.getMB();
		}
	}
	public int getLlamadas(){
		if (o==1){
		return sT.getLlamadas();
		}
		else{
			return paq.getLlamadas();
		}
		
	}
	public int getNCanales(){
		if (o==1){
		return sTele.getNCanales();
		}
		else{
			return paq.getNCanales();
		}
	}

}