class ColaCircularDinamica{
	private Nodo h,t;


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
