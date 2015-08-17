class Direccion {
	//atributos
	private String calle;
	private int numero;
	private String colonia;
	private int cp;
	private String cd;
	
	public void LeeCalle(){
		calle=Teclado.cadena("De la calle de la direccion ");
	}
	
	public void LeeNumero(){
		numero=Teclado.entero("De El numero de la direccion ");
	}
	
	public void LeeColonia(){
		colonia=Teclado.cadena("De la colonia de la direccion ");
	}
	
	public void LeeCd(){
		cd=Teclado.cadena("De la ciudad, nunicipio o delelegacion  de la direccion ");
	}
	
	public void LeeCp(){
		cp=Teclado.entero("De el codigo postal de la direccion ");
	}

	public void Capturar(){
		LeeCalle();
		LeeNumero();
		LeeColonia();
		LeeCd();
		LeeCp();
	}

	public void Listar(){
		System.out.println("\t"+calle+"\t"+numero+"\t"+colonia+"\t"+cd+"\t"+cp+"\t");
	}

	public void Actualizar(){
		int o;
		Menu m=new Menu();
		do{
			o=m.DespliegaMenu("Que desea Actualizar\n1.-La calle\n2.-El numero\n3.-La colonia\n4.-la cuidad\n5.-El codigo postal\n6.-Salir\n\tOpcion:  ",6);

			switch(o){

				case 1:
					LeeCalle();
				break;

				case 2:
					LeeNumero();
				break;

				case 3:
					LeeColonia();
				break;

				case 4:
					LeeCd();
				break;

				case 5:
					LeeCp();
				break;
			}
		}while(o!=6);
		
	}
}