public class TestCliente{
	public static int Menu(){
		int opcion;
		do{
			opcion = Teclado.entero("1)Insertar\n2)Borrar\n3)Actualizar\n4)Listar\n5)Buscar\n6)Ordernar\n7)Estadisticas\n8)Salir\n\tOpcion: ");
			if (opcion >8 || opcion <1)
				System.out.println("opcion no valida...");
		}while(opcion <1 || opcion >8);
		return opcion;
	}
	

	public static void main(String[] args){
	
		int clave, opcion,pos, max,maxtels;
		Cliente cliente;
		Estadisticas e;

		ArregloCliente miarreglo= new ArregloCliente(Teclado.entero("Tamaño del arreglo: "));
		maxtels=Teclado.entero("Dame en numero de telefonos para el cliente: ");
		
		do{
			opcion=Menu();
			switch(opcion){
				
				case 1:
					if(miarreglo.ValidaEspacio()){
						cliente = new Cliente(maxtels);
						cliente.Capturar();
						miarreglo.InsertarCliente(cliente);
						}
					else
						System.out.println("No hay espacio en el arreglo");
				break;
				
				case 2://borrar
					clave=Teclado.entero("Dame la clave a borrar: ");
					pos = miarreglo.BuscaInfo(clave,0);
					if(pos!=-1){
					    cliente =miarreglo.Borrar(pos);
					}
					miarreglo.Listar();
				break;

				case 3://actualizar
					clave=Teclado.entero("Dame la clave del cliente a modificar: ");
					pos=miarreglo.BuscaInfo(clave,0);
					if(pos!=-1){
					    	miarreglo.Actualizar(pos);
					}
				break;
				
				case 4://listar
					miarreglo.Listar();
				break;
				
				case 5://buscar
					clave=Teclado.entero("Clave del cliente a buscar: ");
				    pos=miarreglo.BuscaInfo(clave,0);
				    if(pos!=-1){
					   	miarreglo.Listar(pos);
					}
				break;
				
				case 6://ordenar
					miarreglo.Ordenar();
				break;
					
				case 7:
					e = new Estadisticas(miarreglo);
					e.Est();
					
				break;


			}
		}while(opcion!=8);



	}
}