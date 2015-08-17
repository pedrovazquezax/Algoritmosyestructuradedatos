class Paquetes{
	//atributos
	private Double precio;
	private PTelefono ptel;//paquete telefono
	private PTele ptele;//paquete television
	private PInternet pi;//paquete Internet
	//constructores
	public Paquetes(){
	ptel=new PTelefono();
	ptele=new PTele();
	pi=new PInternet();
	}
	//metodos
	public void LeePrecio(){
		precio=Teclado.Double("Dame el precio del paquete ");
	}
	public void LeePTel(){
		ptel.CapturarP();
	}
	public void LeePTele(){
		ptele.CapturarP();
	}
	public void LeePI(){
		pi.CapturarP();
	}
	public void Capturar(){
		LeePrecio();
		LeePTel();
		LeePTele();
		LeePI();
	}
	public void Listar(){
		System.out.println("El precio del paquete es : $"+precio+" y lo que contiene es :");
		ptel.ListarP();
		ptele.ListarP();
		pi.ListarP();
	}

	public void Actualizar(){
		int o;
		Menu m=new Menu();
		do{
			o=m.DespliegaMenu("Que desea Actualizar\n1.-El Precio\n 2.-El servicio de Telefono\n 3.-El servicio de Television \n 4.-El servicio de Internet\n5.-Salir\n\tOpcion:  ",5);

			switch(o){

				case 1:
					LeePrecio();
				break;
				case 2:
					ptel.ActualizarP();
				break;
				case 3:
					ptele.ActualizarP();
				break;
				case 4:
					pi.ActualizarP();;
				break;
			}
		}while(o!=5);
		
	}
	public Double getPrecio(){
		return precio;
	}
	public int getMB(){
		return pi.getMB();
	}
	public int getLlamadas(){
		return ptel.getLlamadas();
	}
	public int getNCanales(){
		return ptele.getNCanales();
	}

}