class PTele{
	//Atributos
	private double precio;
	private int ncanales;//numero canales


	//metodos
	public void LeePrecio(){
		precio=Teclado.Double("Dame el precio del paquete de television ");
	}

	public void LeeNCanales(){
		ncanales=Teclado.entero("Dame numero de canales ");
	}
	
	public void Capturar(){
		LeePrecio();
		LeeNCanales();
		
	}

	

	public void Listar(){
		System.out.println("Precio de la Television: "+precio+"\tNoº canales disponibles: "+ncanales);
	}

	public void Actualizar(){
		int o;
		Menu m=new Menu();
		do{
			o=m.DespliegaMenu("Que desea Actualizar\n1.-Precio paquete\n2.-Noº canales disponibles\n3.-Salir\n\tOpcion:  ",3);

			switch(o){

				case 1:
					LeePrecio();
				break;

				case 2:
					LeeNCanales();
				break;
			}
		}while(o!=3);
		
	}
	public void CapturarP(){
		LeeNCanales();
		
	}
	public void ListarP(){
		System.out.println("Noº canales disponibles: "+ncanales);
	}
	public void ActualizarP(){
		int o;
		Menu m=new Menu();
		do{
			o=m.DespliegaMenu("Que desea Actualizar\n1.-Noº canales disponibles\n2.-Salir\n\tOpcion:  ",2);

			switch(o){

				case 1:
					LeeNCanales();
				break;

				
			}
		}while(o!=2);
		
	}
	public double getPrecio(){
		return precio;
	}
	public int getNCanales(){
		return ncanales;
	}
}
