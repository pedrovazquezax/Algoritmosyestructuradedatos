class Menu{
	public int DespliegaMenu(String texto, int max){
		int o;
		do{
			o=Teclado.entero(texto);
			 	if (o<1|| o>max) {
			 		System.out.println ("Opcion no valida \n");
			 		
			 	}
		}while (o<1|| o>max);
	return o;
	}
}