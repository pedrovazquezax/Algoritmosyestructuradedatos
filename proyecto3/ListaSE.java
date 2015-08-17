class ListaSE{
	//atributos
	private Nodo h;
	private Nodo t;
	private boolean existe;
	//metodos
	public void InsertaAlFinal(Proceso dato){
		Nodo q= new Nodo(dato,null);
		if (t==null)
			h=q;//integrarlo a la lista ligada
		else
			t.SetLigaDer(q);
			
			t=q;
		
	}
	public void InsertaAlInicio(Proceso dato){
		Nodo q= new Nodo(dato,null);
		if (t==null)
			t=q;
			h=q;
	}
	public Nodo Buscar(Proceso dato){
		Nodo q;
		for(q=h;q!=null;q=q.GetLigaDer())
		if (dato==q.GetInfo())
			return q;
		
		System.out.println("No exixte el dato");
		return null;
	}
	public void Listar(){
		Nodo q;
		for(q=h;q!=null;q=q.GetLigaDer())
			System.out.println(q.GetInfo());
		
	}
	public void Actualizar(Proceso dato){
		Nodo q= Buscar(dato);
		Proceso datonvo=new Proceso();
		if (q!=null){
			datonvo.Capturar();
			q.SetInfo(datonvo);
		}
		else 
			System.out.println("no existe el dato");
	}
	public void InsertaDespues(Proceso dato){
		Nodo q,anterior=Buscar(dato);
		Proceso datonvo=new Proceso();
		if (anterior!=null){
			datonvo.Capturar();
			q=new Nodo(datonvo,anterior.GetLigaDer());
			anterior.SetLigaDer(q);
			if (anterior==t) {
				t=q;
			}
		}
	}
	public Nodo BuscarAnterior(Proceso dato){
		Nodo aux,anterior=null;
		existe=false;
		for(aux=h;aux!=null;aux=aux.GetLigaDer()){
			if (dato==aux.GetInfo()) {
				existe=true;
				return anterior;
			}
			anterior=aux;
		}

		System.out.println("no existe el dato");
		return null;

	}
	public void InsertaAnterior(Proceso dato){
		Nodo q,anterior=BuscarAnterior(dato);
		Proceso datonvo= new Proceso();
		if (anterior==null&&existe){
			datonvo.Capturar();
			q=new Nodo(datonvo,h);
			h=q;
		}
		else if(anterior!=null&&existe){
			datonvo.Capturar();
			q=new Nodo(datonvo,anterior.GetLigaDer());
			anterior.SetLigaDer(q);
		}
	}
	  public void OrdenarS() {
 
        Nodo i,j;
        Proceso aux1,aux2;
        for (i=h;i!=null;i=i.GetLigaDer()){
            for (j=i.GetLigaDer();j!=null;j=j.GetLigaDer()){
                if (i.GetInfoOrd() > j.GetInfoOrd()) {
                    aux1=i.GetInfo();
                    aux2=j.GetInfo();
                    i.SetInfo(aux2);
                    j.SetInfo(aux1);
                }
            }
        }
    }
    public Nodo Borrar(Proceso dato){
    	Nodo aux=null,anterior=BuscarAnterior(dato);
    	if (existe){
    		if (anterior!=null){
    			aux=anterior.GetLigaDer();
    			anterior.SetLigaDer(aux.GetLigaDer());
    				if (t==aux)
    					t=anterior;
    		}
    		else if(h==t){
    			aux=h;
    			h=t=null;
    		}
    		else{
    			aux=h;
    			h=h.GetLigaDer();
       		}
		 }
	return aux;
	}

}