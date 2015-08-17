class Estadisticas{
	private ArregloCliente depto;
	//constructores
	public Estadisticas(ArregloCliente ae){
		depto = ae;
	}	
	//metodos
	public void VentasMes(){
		int i,indice=depto.getIndice();
		double total=0.0;
		for (i=0;i<=indice;i++)
			total=total+depto.getDato(i).getPrecio();

		System.out.println("Lo que vas a ganar al mes es $"+total);
		
	}

	public void VentasAnn(){
		int i,indice=depto.getIndice();
		double total=0.0;
		for (i=0;i<=indice;i++)
			total=total+depto.getDato(i).getPrecio();

		total=(total*12);
		System.out.println("Lo que vas a ganar al año es $"+total);
		
	}

	public void VentasDia(){
		int i,indice=depto.getIndice();
		double total=0.0;
		for (i=0;i<=indice;i++)
			total=total+depto.getDato(i).getPrecio();

		total=(total*12)/365;

		System.out.println("Lo que vas a ganar al dia es $"+total);
		
	}
	public void VentasSemana(){
		int i,indice=depto.getIndice();
		double total=0.0;
		for (i=0;i<=indice;i++)
			total=total+depto.getDato(i).getPrecio();

		total=((total*12)/365)*7;

		System.out.println("Lo que vas a ganar a la semana es $"+total);
		
	}
	public void Hay(){
		int i,indice=depto.getIndice();
			int h=0,m=0;
				for (i=0;i<=indice;i++){
					if(depto.getDato(i).getSexo()==1)
						h++;
					else
						m++;
				}
				if (m==h){
					System.out.println("Hay la misma cantidad de mujeres y hombres");
					System.out.println("Hay "+m+" mujeres y "+h+" hombres");
				}
				else if(m>h){
					System.out.println("Hay mas mujeres que hombres");
					System.out.println("Hay "+m+" mujeres y "+h+" hombres");
				}
				else{
					System.out.println("Hay mas hombres que mujeres");
					System.out.println("Hay "+m+" mujeres y "+h+" hombres");
				}
	}
	public void PromMes(){
		int i,indice=depto.getIndice();
		double prom=0.0;
		for (i=0;i<=indice;i++)
			prom=prom+depto.getDato(i).getPrecio();

		prom=prom/(indice+1);

		System.out.println("Lo que paga en promedio un cliente al mes es  $"+prom);
		

	}
	public void PromMB(){	
		int i,indice=depto.getIndice();
		int prom=0;
		for (i=0;i<=indice;i++)
			prom=prom+depto.getDato(i).getMB();

		prom=prom/(indice+1);

		System.out.println("El promedio del ancho de banda en MB por cliente es  "+prom);
		}

		public void PromLlamadas(){
		int i,indice=depto.getIndice();
		int prom=0;
		for (i=0;i<=indice;i++)
			prom=prom+depto.getDato(i).getLlamadas();

		prom=prom/(indice+1);

		System.out.println("El promedio de las llamadas totales(maximas)  por cliente es  "+prom);
		}
	public void PromCanales(){
		int i,indice=depto.getIndice();
		int prom=0;
		for (i=0;i<=indice;i++)
			prom=prom+depto.getDato(i).getNCanales();

		prom=prom/(indice+1);

		System.out.println("El promedio del numero de canales por cliente es  "+prom);
	}
	public void MaxPago(){
		int i,indice=depto.getIndice();
		Double aux=depto.getDato(0).getPrecio();
		int aux2=0;
		for (i=0;i<=indice;i++)
			if(depto.getDato(i).getPrecio()>aux){
				aux=depto.getDato(i).getPrecio();
				aux2=i;
			}

		System.out.println("El cliente que paga mas es "+depto.getDato(aux2).getNombre()+" "+depto.getDato(i).getApellido()+"y paga $"+aux);
		}
	public void Est(){
		int o;
		Menu m=new Menu();
		do{
		o=m.DespliegaMenu("\nQue estadistica desea obtener\n1.-Dinero ganado al mes\n2.-Dinero ganado al año\n3.-Dinero ganado al dia\n4.-Dinero ganado a la semana\n5.-¿Que clientes hay mas Hombres o mujeres?\n6.-Promedio de pago al mes por cliente\n7.-Promedio de Ancho de banda por cliente\n8.-Promedio de llamadas maximas por cliente\n9.-Promedio de canales de television por cliente\n10.-Salir\nOpcion: ",10);
		switch(o){
			case 1://ventas mes
			VentasMes();
			break;

			case 2://ventas año
			VentasAnn();
			break;

			case 3://ventas dia
			VentasDia();
			break;

			case 4:
			VentasSemana();
			break;

			case 5://cuantos hay
			Hay();

			break;

			case 6://prom mes
			PromMes();

			break;

			case 7://prom mb
			PromMB();

			break;

			case 8://prom llamadas
			PromLlamadas();
			break;

			case 9://prom canales 
			PromCanales();

			break;
			
		}
		}while(o!=10);
	}

}