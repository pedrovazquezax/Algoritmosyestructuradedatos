class Empleado{
	//Atributos
	private int clave;
	private String nombre;
	private int edad;
	private ArregloDouble sueldos;
	private ArregloCadenas tels;
	private Direccion dir;
	//constructor
	public Empleado(int maxSueldos, int maxTels){
		sueldos=new ArregloDouble(maxSueldos);
		tels=new ArregloCadenas(maxTels);
		dir=new Direccion();
	}
	//metodos
	public void LeeClave(){
		clave=Teclado.entero("Clave del empleado ");
	}

	public void LeeNombre(){
		nombre=Teclado.cadena("Nombre del empleado ");
	}

	public void LeeEdad(){
		edad=Teclado.entero("Edad del empleado ");
	}

	public void LeeTels(){
		
		Menu m = new Menu();
		int oS;
		do{
			oS=m.DespliegaMenu("\tSeleccione\n1.-Insertar Telefonos\n2.-Salir\nOpcion:  ",2);
		if (tels.ValidaEspacio()==true) {
						tels.Insertar(Teclado.cadena("Da el telefono\n"));
					}
					else{
						System.out.println("no hay espacio en el arreglo\n");
						oS=2;
					}
		}while(oS!=2);
	}

	
	public void LeeSueldos(){
		Menu m = new Menu();
		int oS;
		do{
			oS=m.DespliegaMenu("\tSeleccione\n1.-Insertar sueldos\n2.-Salir\nOpcion:  ",2);
		if (sueldos.ValidaEspacio()==true) {
						sueldos.Insertar(Teclado.Double("Da el sueldo \n"));
					}
					else{
						System.out.println("no hay espacio en el arreglo\n");
						oS=2;
					}
		}while(oS!=2);
	}

	public void LeeDirecion(){
		dir.Capturar();
	}

	public void Capturar(){
		LeeClave();
		LeeNombre();
		LeeEdad();
		LeeTels();
		LeeSueldos();
		LeeDirecion();
	}

	public void Listar(){
		System.out.println(clave+"\t"+nombre+"\t"+edad);
		sueldos.ListarT();
		tels.ListarT();
		dir.Listar();

	}

	public void Actualizar(){
		int o;
		Menu m = new Menu();
		do{
			o=m.DespliegaMenu("Que desea actualizar\n1.-Nombre\n2.-Edad\n3.-Telefonos\n4.-Sueldos\n5.-Direccion\n6.-Salir\nOpcion: ",6);
			switch(o){
				
				case 1://nombre
					LeeNombre();
				break;

				case 2://Edad
					LeeEdad();
				break;

				case 3://Telefonos
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

				case 4://Sueldos
					int o3;
					do{
						o3=m.DespliegaMenu("Que desea actualizar\n1.-Insertar\n2.-Actualizar\n3.-Borrar\n4.-Salir\nOpcion: ",4);
						switch(o3){
							case 1://insertar
								LeeSueldos();
							break;

							case 2://Actualizar
								double buscar=Teclado.Double("El sueldo que desea actualizar\n");
								int posbuscar=0;

								double datoact=Teclado.Double("dame un nuevo Sueldo   \n");
								posbuscar=sueldos.BuscaInfo(buscar,posbuscar);
								
								if (posbuscar==-1) {
									System.out.println("No se encuentra el sueldo");
								}
								else{
									System.out.println("Posicion = Valor");
									while(posbuscar!=-1){
											sueldos.Listar(posbuscar);
											posbuscar =sueldos.BuscaInfo(buscar,posbuscar);
									}
								}
								posbuscar=Teclado.entero("Cual es la posicion del dato a actualizar: ");
								sueldos.Actualizar(posbuscar,datoact);	
							break;

							case 3://Borrar
								Double nborrar=Teclado.Double("dame el numero a borrar \n ");
								int posborrar=0;

								posborrar=sueldos.BuscaInfo(nborrar,posborrar);

								if (posborrar!=-1){
									System.out.println("Posicion = Valor");
									do{
										sueldos.Listar(posborrar);
										posborrar=sueldos.BuscaInfo(nborrar,posborrar);
									}while(posborrar!=-1);
										posbuscar=Teclado.entero("Cual es la posicion del dato a actualizar: ");
										sueldos.Borrar(posborrar);
								}
								else{
									System.out.println("no encuentra el dato\n");
								}

									break;
								}


					}while(o3!=4);
				break;

				case 5://Direccion
					dir.Actualizar();
				break;
			}


		}while(o!=6);

	}
}
