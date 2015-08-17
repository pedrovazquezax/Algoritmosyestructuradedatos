class PTelefono{
	//Atributos
	private double precio;
	private int llamadasL;//llamadas locales
	private int llamadasC;//llamadas celulat
	private int llamadasLD;//llamadas larga distancia


	//metodos
	public void LeePrecio(){
		precio=Teclado.Double("Dame el precio del paquete de telefono ");
	}

	public void LeeLlamadasL(){
		llamadasL=Teclado.entero("Dame numero de llamadas locales del paquete de telefono ");
	}
	public void LeeLlamadasLD(){
		llamadasLD=Teclado.entero("Dame numero de llamadas a larga distancia del paquete de telefono ");
	}
	
	public void LeeLlamadasC(){
		llamadasC=Teclado.entero("Dame numero de llamadas a celular del paquete de telefono ");
	}
	public void Capturar(){
		LeePrecio();
		LeeLlamadasL();
		LeeLlamadasC();
		LeeLlamadasLD();
	}

	public void Listar(){
		System.out.println("Precio del Telefono: "+precio+"\tNoº llamadas locales: "+llamadasL+"\nNoº llamadas a larga distancia: "+llamadasLD+"\tNoº llamadas a celular: "+llamadasC);
	}

	public void Actualizar(){
		int o;
		Menu m=new Menu();
		do{
			o=m.DespliegaMenu("Que desea Actualizar\n1.-Precio paquete\n2.-Noº llamadas locales\n3.-Noº llamadas Larga distancia\n4.-Noº llamadas a celular\n5.-Salir\n\tOpcion:  ",5);

			switch(o){

				case 1:
					LeePrecio();
				break;

				case 2:
					LeeLlamadasL();
				break;

				case 3:
					LeeLlamadasLD();
				break;

				case 4:
					LeeLlamadasC();
				break;

				
			}
		}while(o!=5);
		
	}

	public void CapturarP(){
		LeeLlamadasL();
		LeeLlamadasC();
		LeeLlamadasLD();
	}

	public void ListarP(){
		System.out.println("Noº llamadas locales: "+llamadasL+"\tNoº llamadas a larga distancia: "+llamadasLD+"\nNoº llamadas a celular: "+llamadasC);
	}

	public void ActualizarP(){
		int o;
		Menu m=new Menu();
		do{
			o=m.DespliegaMenu("Que desea Actualizar\n1.-Noº llamadas locales\n2.-Noº llamadas Larga distancia\n3.-Noº llamadas a celular\n4.-Salir\n\tOpcion:  ",4);

			switch(o){

				case 1:
					LeeLlamadasL();
				break;

				case 2:
					LeeLlamadasLD();
				break;

				case 3:
					LeeLlamadasC();
				break;

				
			}
		}while(o!=4);
		
	}
	public double getPrecio(){
		return precio;
	}
	public int getLlamadas(){
		return llamadasL+llamadasLD+llamadasC;
	}
}
