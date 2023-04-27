public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		// TODO: Aquí se deben instanciar las otras figuras geométricas

		imprimirCalculo(t1); imprimirCalculo(t2);
		
		Cuadrado c1 = new Cuadrado("Bob Esponja", 20);
		Cuadrado c2 = new Cuadrado("Marco", 45);
		
		Rectangulo r1 = new Rectangulo("Rec 1", 10, 20);
		Rectangulo r2 = new Rectangulo("Rec 2", 5, 2);
		
		Rombo rom1 = new Rombo("Rombo 1", 5, 10, 20);
		Rombo rom2 = new Rombo("Rombo 2", 15, 50, 80);
		
		Romboide romboide1 = new Romboide("Pez", 30, 100);
		Romboide romboide2 = new Romboide("Caja romboide", 60, 30);
		
		Trapecio trap1 = new Trapecio("Podio", 50, 25, 10, 12, 15);
		Trapecio trap2 = new Trapecio("Sobre", 10, 5, 10, 8, 10);
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		imprimirCalculo(c1); imprimirCalculo(c2);
		imprimirCalculo(r1); imprimirCalculo(r2); 
		imprimirCalculo(rom1); imprimirCalculo(rom2); 
		imprimirCalculo(romboide1); imprimirCalculo(romboide2); 
		imprimirCalculo(trap1); imprimirCalculo(trap2); 
	}//main

	public static void imprimirCalculo(Calculable c) {
		System.out.println(c);
		System.out.println("+========================================");
		System.out.println("|El área de ["+c.getName()+"] es: " + c.calcularArea() + 
				"\n" + "|El perímetro de ["+c.getName()+"] es: " + c.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras