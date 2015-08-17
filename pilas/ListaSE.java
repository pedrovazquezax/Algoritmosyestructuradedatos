class ListaSE{
	//atributos
	private Nodo h;
	private Nodo t;
	private boolean existe;
	//metodos
	public void InsertaAlFinal(int dato){
		Nodo q= new Nodo(dato,null);
		if (t==null)
			h=q;//integrarlo a la lista ligada
		else
			t.SetLigaDer(q);
			
			t=q;
		
	}
	public void InsertaAlInicio(int dato){
		Nodo q= new Nodo(dato,null);
		if (t==null)
			t=q;
			h=q;
	}
	public Nodo Buscar(int dato){
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
	public void Actualizar(int dato){
		Nodo q= Buscar(dato);
		if (q!=null)
			q.SetInfo(Teclado.entero("Dame el numero entero"));
		else 
			System.out.println("no existe el dato");
	}
	public void InsertaDespues(int dato){
		Nodo q,anterior=Buscar(dato);
		int datonvo;
		if (anterior!=null){
			datonvo=Teclado.entero("Dame el dato nuevo");
			q=new Nodo(datonvo,anterior.GetLigaDer());
			anterior.SetLigaDer(q);
			if (anterior==t) {
				t=q;
			}
		}
	}
	public Nodo BuscarAnterior(int dato){
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
	public void InsertaAnterior(int dato){
		Nodo q,anterior=BuscarAnterior(dato);
		int datonvo;
		if (anterior==null&&existe){
			datonvo=Teclado.entero("Dame el dato nuevo");
			q=new Nodo(datonvo,h);
			h=q;
		}
		else if(anterior!=null&&existe){
			datonvo = Teclado.entero("Dame el dato nuevo");
			q=new Nodo(datonvo,anterior.GetLigaDer());
			anterior.SetLigaDer(q);
		}
	}
	  public void OrdenarS() {
 
        Nodo i,j;
        int aux1,aux2;
        for (i=h;i!=null;i=i.GetLigaDer()){
            for (j=i.GetLigaDer();j!=null;j=j.GetLigaDer()){
                if (i.GetInfo() > j.GetInfo()) {
                    aux1=i.GetInfo();
                    aux2=j.GetInfo();
                    i.SetInfo(aux2);
                    j.SetInfo(aux1);
                }
            }
        }
    }
    public Nodo Borrar(int dato){
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