class ColaCircular{
	private int []colaCir;
	private int h,t;
public void ColaCircular(int max){
	colaCir=new int [max];
	h=t=-1;

}
public boolean ValidaEspacio(){
		return !((h==0 && t==colaCir.length-1)||(t+1==h));
}
public void Insertar(int dato){
if (h==-1)
	h++;
if (t==colaCir.length-1)
	t=-1;
t++;
colaCir[t]=dato;
}
public boolean ValidaVacio(){
	return (h==-1);
}
public int Borrar(){
	int aux=colaCir[h];
	if(h==colaCir.length-1)
		h=-1;
	if(h==t)
		h=t=-1;
	else
		h++;
	return aux;
}
public void Listar(){
	int i;
	if (h<=t){
		for(i=h;i<=t;i++)
			System.out.println("["+i+"]="+colaCir[i]);
	}
	else{
		for(i=h;i<=colaCir.length-1;i++)
			System.out.println("["+i+"]="+colaCir[i]);
		for(i=0;i<=t;i++)
			System.out.println("["+i+"]="+colaCir[i]);

	}
}
}
