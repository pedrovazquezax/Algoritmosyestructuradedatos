class TestCalculadora{
	public static void main(String[] args){
		Calculadora1 calc;
		String eInfija;
		int max;
		
		System.out.println("Caculadora");
		eInfija=Teclado.cadena("Dame la expresion infija:  ");
		
		
		eInfija=depurar(eInfija);
		
		max =eInfija.length();
		
		calc = new Calculadora1(max);

		calc.LlenarPEntrada(eInfija);
		calc.CInf_Pos();
	
		calc.Imprimir();
	}


  private static String depurar(String s) {
    s = s.replaceAll("\\s+", ""); 
    s = "(" + s + ")";
    String simbols = "+-*/()^";
    String str = "";
  
  
    for (int i = 0; i < s.length(); i++) {
      if (simbols.contains("" + s.charAt(i))) {
        str += " " + s.charAt(i) + " ";
      }else str += s.charAt(i);
    }
    return str.replaceAll("\\s+", " ").trim();
  } 
}