class Cliente{
	//atributos
	private String nombre;
	private String apellido;
	private int clave;
	private Direccion dir;
	private Contrataciones contra;
	private ArregloCadenas tels;
	private int sexo;
	//constructores
	public Cliente(int maxtels){
		contra =new Contrataciones();
		dir=new Direccion();
		tels=new ArregloCadenas(maxtels);
	}
	//metodos
	public void LeeNombre(){
		nombre=Teclado.cadena("Nombre del cliente ");
	}
	public void LeeApellido(){
		apellido=Teclado.cadena("Apellido del cliente ");
	}
	public void LeeClave(){
		clave=Teclado.entero("Clave  del cliente ");
	}
	public void LeeSexo(){
		do{
			sexo=Teclado.entero("Sexo\n1.-Hombre\n2.-Mujer Opcion:  ");
		}while(sexo>2||sexo<1);

	}
	public void LeeTels(){
		
		Menu m = new Menu();
		int oS;
		do{
			oS=m.DespliegaMenu("\tSeleccione\n1.-Insertar Telefonos\n2.-Salir\nOpcion:  ",2);
		switch(oS){
		case 1:
		if (tels.ValidaEspacio()==true) {
						tels.Insertar(Teclado.cadena("Da el telefono\n"));
					}
					else{
						System.out.println("no hay espacio en el arreglo\n");
						oS=2;
					}
		break;
		}
		}while(oS!=2);
	}
	public void LeeDirecion(){
		dir.Capturar();
	}
	public void LeeContratos(){
		contra.Capturar();
	}
	public void Capturar(){
		LeeClave();
		LeeNombre();
		LeeApellido();
		LeeSexo();
		LeeContratos();
		LeeDirecion();
		LeeTels();

	}
	public void Listar(){
		System.out.println("\n\nClave cliente: "+clave+"\n Nombre: "+nombre+"\t"+apellido);
		dir.Listar();
		tels.ListarT();
		contra.Listar();

	}

	public void Actualizar(){
		int o3;
		Menu m= new Menu();
					do{
						o3=m.DespliegaMenu("Que desea actualizar\n1.-Nombre\n2.-Apellido\n3.-Direccion\n4.-Contratos\n5.-Telefonos\n6.-Salir\nOpcion: ",6);
						switch(o3){
							case 1:
								LeeNombre();
							break;

							case 2:
									LeeApellido();	
							break;

							
							case 3://Direccion
								dir.Actualizar();
							break;
						case 4://contratos
							contra.Actualizar();
						break;
						
						case 5://Telefonos
					int o2;
					do{
						o2=m.DespliegaMenu("Que desea actualizar\n1.-Insertar\n2.-Actualizar\n3.-Borrar\n4.-Salir\nOpcion: ",4);
						switch(o2){
							case 1://insertar
								LeeTels();
							break;

							case 2://Actualizar
								String buscar=Teclado.cadena("El dato que desea actualizar\n");

						int posbuscar =tels.BuscaInfo(buscar,0);

						if (posbuscar<0){
							System.out.println("no hay numero\n");
						}
						else{
							tels.Actualizar(posbuscar);
							}
							break;

							case 3://Borrar
							String nborrar=Teclado.cadena("dame el numero a borrar \n ");
						
						int posborrar=tels.BuscaInfo(nborrar,0);

						if (posborrar!=-1){

							tels.Borrar(posborrar);

						}
						else{
							System.out.println("no encuentra el telefono\n");
						}

							break;
						}


					}while(o2!=4);
				break;
			}//switch
		}while(o3!=6);

	
}

public int getClave() {
        return clave;
    }

    public Double getPrecio(){
		return contra.getPrecio();
	}
	public int getSexo(){
		return sexo;
	}
	public int getMB(){
		return contra.getMB();
	}
	public int getLlamadas(){
		return contra.getLlamadas();
	}
	public int getNCanales(){
		return contra.getNCanales();
	}
	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido;
	}
}
