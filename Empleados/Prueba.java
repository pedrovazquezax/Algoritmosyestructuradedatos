class Prueba{

	public static void main(String[] args) {
		int maxSueldos,maxTels;
		maxSueldos=Teclado.entero("El maximo de sueldos ");
		maxTels=Teclado.entero("El maximo de telefonos ");

		Empleado e=new Empleado(maxSueldos,maxTels);
		int o;
		Menu m = new Menu();
		do{
			o=m.DespliegaMenu("Que desea hacer\n1.-Capturar\n2.-listar\n3.-Actualizar\n4.-Salir\nOpcion: ",4);
			switch(o){
				case 1:
				e.Capturar();
				break;

				case 2:
				e.Listar();
				break;

				case 3:
				e.Actualizar();
				break;

			}
		}while(o!=4);
	}
}