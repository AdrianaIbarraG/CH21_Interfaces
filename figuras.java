
public class figuras {

	public static void imprimirCalculo(Calculable c) {
		System.out.println(c);
		System.out.println("+========================================");
		System.out.println("|El área de ["+c.getName()+"] es: " + c.calcularArea() + 
				"\n" + "|El perímetro de ["+c.getName()+"] es: " + c.calcularPerimetro());
		System.out.println("+========================================");
}// metodo imprimirCalculo
	
}//class figuras
