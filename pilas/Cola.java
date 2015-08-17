class Cola{
	private int []cola;
	private int h,t;
public void cola(int max){
	cola=new int [max];
	h=t=-1;

}
public boolean ValidaEspacio(){
	return(t<cola.length-1);	
}
public void Insertar(int dato){
if (h==-1)
	h++;
t++;
cola[t]=dato;
}
public boolean ValidaVacio(){
	return(h==-1);

}
public int Borrar(){
	int aux=cola[h];
	if(h==t)
		h=t=-1;
	else
		h++;
	return aux;
}
public void Listar(){
	int i;
	for(i=h;i<=t;i++)
		System.out.println("["+i+"]="+cola[i]);
}
}