class TestArreglosEnteros{

	public static int menu(){
		int opcion;
		
		do{
			opcion=Teclado.entero("1)Insertar\n2)Borrar\n3)Actualizar\n4)Listar\n5)Buscar\n6)Ordenar\n7)Salir\nOpcion : ");

			if(opcion<1||opcion>7){
				System.out.println("opcion no valida\n");
				}
				
		}while(opcion<1||opcion>7);
	return opcion;
	}

	public static void main(String[] args) {
		int dato,opcion,pos,max;
		
		//Teclado teclado=new Teclado;

		ArregloEnteros miarreglo=new ArregloEnteros(Teclado.entero("tamaño del arreglo   \n"));
			do{
				opcion=menu();
				switch(opcion){
					case 1: //Insertar
						if (miarreglo.ValidaEspacio()==true) {
						dato=Teclado.entero("dato  \n");
						miarreglo.Insertar(dato);
					}
					else{
						System.out.println("no hay espacio en el arreglo\n");
					}

					break;
					
					case 2://Borrar
						int nborrar=Teclado.entero("dame el numero a borrar \n ");
						int posborrar=0;

						posborrar=miarreglo.BuscaInfo(nborrar,posborrar);

						if (posborrar!=-1){
							do{
								miarreglo.Borrar(posborrar);
								posborrar=miarreglo.BuscaInfo(nborrar,posborrar);
							}while(posborrar!=-1);
						}
						else{
							System.out.println("no encuentra el dato\n");
						}

					break;

					case 3://Actualizar
						int buscar=Teclado.entero("El dato que desea actualizar\n");
						int posbuscar=0;

						int datoact=Teclado.entero("dame un nuevo valor   \n");
						posbuscar=miarreglo.BuscaInfo(buscar,posbuscar);
						if (posbuscar==-1) {
							System.out.println("No se encuentra el dato");
						}
						else{
							while(posbuscar!=-1){
									miarreglo.Actualizar(posbuscar,datoact);
									posbuscar =miarreglo.BuscaInfo(buscar,posbuscar);
							}
						}	
					break;

					case 4: //Listar
						int indice3=miarreglo.Indice1();
						if (indice3!=-1){
						miarreglo.ListarT();
						}
						else{
							System.out.println("no hay datos\n");
						
						}
					break;

					case 5://Buscar
						int buscar2=Teclado.entero("El dato que desea buscar\n\n");
						int pos1=0;
						pos1=miarreglo.BuscaInfo(buscar2,pos1);
						if (pos1==-1) {
							System.out.println("No se encuentra el dato");
						}
						else{
							do{
							miarreglo.Listar(pos1);
							pos1=miarreglo.BuscaInfo1(buscar2,pos1);
							}while(pos1!=-1);
						}
					break;
					
					case 6://Ordenar

						miarreglo.Ordenar();

					break;
				}
			}while(opcion!=7);//Salir
		

	}


}