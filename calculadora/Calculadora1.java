class Calculadora1{
	private Pila entrada;
	private Pila salida;
	private Pila temporal;
  private String eInfija;
	private String ePosfija;
  private String resultado;
		
    public Calculadora1(int max1){
			entrada = new Pila(max1);
			salida =new Pila(max1);
			temporal= new Pila(max1);
		}
    public void LlenarPEntrada(String expr){
      String[] arregloInfijo = expr.split(" ");
       for (int i = arregloInfijo.length - 1; i >= 0; i--) {
        entrada.Push(arregloInfijo[i]);
      }
    }
		
    public void CInf_Pos(){
			do{
      if (Prioridad(entrada.GetDatoTope())==1){
        temporal.Push(entrada.Pop());
      }else if (Prioridad(entrada.GetDatoTope())==2){
            while(!temporal.GetDatoTope().equals("(")) {
              salida.Push(temporal.Pop());
            }
            temporal.Pop();
            entrada.Pop();
           }
          else if(Prioridad(entrada.GetDatoTope())==6){
            salida.Push(entrada.Pop());
          }
          else{
            while(entrada.Mayor()&&Prioridad(entrada.GetDatoTope())<=Prioridad(temporal.GetDatoTope())){
              salida.Push(temporal.Pop());
            }
            temporal.Push(entrada.Pop());
          }
          
        }while(!entrada.ValidaVacio());

        while(temporal.Mayor()){
        salida.Push(temporal.Pop());
      }
      ePosfija = salida.aString();
    }

    public void Imprimir(){      
      System.out.println("Expresion Postfija: " + ePosfija);


    }

		private static int Prioridad(String op) {
			    int prioridad =6;
			    if (op.equals("^")) prioridad = 5;
			    if (op.equals("*") || op.equals("/")) prioridad = 4;
			    if (op.equals("+") || op.equals("-")) prioridad = 3;
			    if (op.equals(")")) prioridad = 2;
			    if (op.equals("(")) prioridad = 1;
    		return prioridad;
  		}
    
}