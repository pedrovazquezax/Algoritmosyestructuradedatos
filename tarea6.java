class tarea6{

	public static void main(String[] args) {
		int []A;
		A=new int [5];
		A[0]=1;
		A[1]=2;
		A[2]=3;
		A[3]=14;
		A[4]=10;
		for (int i=0;i<5;i++)
			System.out.println("["+i+"]="+A[i]);
		int pos=Buscar(67,A,4);
		System.out.println("la posicion es "+pos);
		int suma=SumaA(A,4);
		System.out.println("la suma es  " +suma);
	}

	public static int Buscar(int n, int []A,int i){
		
		
		if (i==-1)
		return -1;
		else {
			if (A[i]==n){
				return i;
			}
				else {
					return Buscar(n,A,i-1);
				}
			
		}

	}
	public static  int SumaA(int []A,int i){
		if(i>0)
			return SumaA(A,i-1) +A[i];
		return A[i];

	}
}