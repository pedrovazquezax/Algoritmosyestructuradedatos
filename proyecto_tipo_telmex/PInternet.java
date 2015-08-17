class PInternet{
	//Atributos
	private double precio;
	private int megas;//numero canales


	//metodos
	public void LeePrecio(){
		precio=Teclado.Double("Dame el precio del paquete de Internet ");
	}

	public void LeeMegas(){
		megas=Teclado.entero("Dame el ancho de banda del internet en Mbps ");
	}
	
	public void Capturar(){
		LeePrecio();
		LeeMegas();
		
	}

	public void Listar(){
		System.out.println("Precio del Internet: "+precio+"\tAncho de banda en Mbps: "+megas);
	}

	public void Actualizar(){
		int o;
		Menu m=new Menu();
		do{
			o=m.DespliegaMenu("Que desea Actualizar\n1.-Precio paquete\n2.-Ancho de banda en Mbps\n3.-Salir\n\tOpcion:  ",3);

			switch(o){

				case 1:
					LeePrecio();
				break;

				case 2:
					LeeMegas();
				break;
			}
		}while(o!=3);
		
	}
	public void CapturarP(){
		LeeMegas();
		
	}

	public void ListarP(){
		System.out.println("Ancho de banda en Mbps: "+megas);
	}

	public void ActualizarP(){
		int o;
		Menu m=new Menu();
		do{
			o=m.DespliegaMenu("Que desea Actualizar\n1.-Ancho de banda en Mbps\n2.-Salir\n\tOpcion:  ",2);

			switch(o){

				case 1:
					LeeMegas();
				break;
			}
		}while(o!=2);
		
	}
	public double getPrecio(){
		return precio;
	}
	public int getMB(){
		return megas;
	}

}
