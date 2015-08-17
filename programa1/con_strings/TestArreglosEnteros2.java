class TestArreglosEnteros2{

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
		int opcion,pos,max;
		String dato;
		
		//Teclado teclado=new Teclado;

		ArregloEnteros2 miarreglo=new ArregloEnteros2(Teclado.entero("tamaño del arreglo   "));
			do{
				opcion=menu();
				switch(opcion){
					case 1: //Insertar
						if (miarreglo.ValidaEspacio()==true) {
						dato=Teclado.cadena("dato  \n");
						miarreglo.Insertar(dato);
					}
					else{
						System.out.println("no hay espacio en el arreglo\n");
					}

					break;
					
					case 2://Borrar
						String nborrar=Teclado.cadena("la cadena a Borrar \n ");
						
						int posborrar=miarreglo.BuscaInfo(nborrar);

						if (posborrar!=-1){

							miarreglo.Borrar(posborrar);

						}
						else{
							System.out.println("no encuentra el dato\n");
						}

					break;

					case 3://Actualizar
						String buscar=Teclado.cadena("El dato que desea actualizar\n");

						int posbuscar =miarreglo.BuscaInfo(buscar);

						if (posbuscar<0){
							System.out.println("no hay dato\n");
						}
						else{
							miarreglo.Actualizar(posbuscar);
							}
					break;

					case 4: //Listar
						int indice3=miarreglo.Indice1();
						if (indice3>0){
						miarreglo.ListarT();
						}
						else{
							System.out.println("no hay datos\n");
						}
					break;

					case 5://Buscar
						String buscar2=Teclado.cadena("El dato que desea buscar\n\n");

						int casilla=miarreglo.BuscaInfo(buscar2);
						System.out.println("la casilla en que se encuentra el dato buscado  "+casilla+"\n\n");
						miarreglo.Listar(casilla);
						
					break;
					
					case 6://Ordenar
						miarreglo.Ordenar();
					break;
				}
			}while(opcion!=7);//Salir
		

	}


}

