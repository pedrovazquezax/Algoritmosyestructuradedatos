class ColaDinamica{
	
	private Nodo h,t;

	public void Insertar(int dato){
			Nodo q= new Nodo(dato,null);
			if (t==null)
				h=q;
			else
				t.SetLigaDer(q);
				
				t=q;
	}
	public boolean ValidaVacio(){
		return(h==null);
	}
	public Nodo Borrar(){
		Nodo aux=h;
		
		if(h==t)
			h=t=null;
		else
			h=h.GetLigaDer();
		return aux;
	}
	public void Listar(){
		Nodo q;
		for(q=h;q!=null;q=q.GetLigaDer())
			System.out.println(q.GetInfo());
	}
}