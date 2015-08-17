class Prueba{

	public static void main(String[] args) {
		
		ListaSE se=new ListaSE();
		Proceso dato=new Proceso();
		int o;
		Menu m = new Menu();
		do{
			o=m.DespliegaMenu("Que desea hacer\n1.- Inserta Al Final\n2.-Inserta Al Inicio\n3.-Buscar\n4.-Actualizar\n5.-Inserta Despues\n6.-Buscar Anterior\n7.-Inserta Anterior\n8.-Ordenar\n9.-Listar\n10.-Salir\nOpcion: ",10);
			switch(o){
				case 1:
				
				dato.Capturar();
				se.InsertaAlFinal(dato);
				break;

				case 2:
				
				dato.Capturar();
				se.InsertaAlInicio(dato);
				break;

				case 3:
				//se.Buscar(Teclado.entero("Dame el dato a Buscar "));
				break;

				case 4:
				//se.Actualizar(Teclado.entero("Dame el dato a Actualizar "));
				break;

				case 5:
				//se.InsertaDespues(Teclado.entero("Dame el dato a Buscar para insertar Despues "));
				break;

				case 6:
				//se.BuscarAnterior(Teclado.entero("Dame el dato a Buscar Anterior "));
				break;

				case 7:
				//se.InsertaAnterior(Teclado.entero("Dame el dato a Buscar para insertar Anterior "));
				break;

				case 8:
				se.OrdenarS();
				break;
				
				case 9:
				se.Listar();
				break;

				case 10:
				//se.Borrar(Teclado.entero("Dame el dato a Borrar"));
				break;

			}
		}while(o!=10);
	}
}