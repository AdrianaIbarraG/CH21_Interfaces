
public class Cuadrado implements Calculable{
	
	private String name; 
	private double lado;
	
	public Cuadrado(String name, double lado) {
		super();
		this.name = name;
		this.lado = lado;
	}// constructor 

	public double calcularArea() {
		return (getLado()*getLado());
	}//calcularArea
	
	public double calcularPerimetro() {
		return (getLado()*4);
	}//calcularPerimetro
	
	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	public double getLado() {
		return lado;
	}//getLado

	public void setLado(double lado) {
		this.lado = lado;
	}//setLado

	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}//toString

	@Override
	public double getBase() {
		return 0;
	}

	@Override
	public double getAltura() {
		return 0;
	}
	
	

	
	
	
	
	
}//ClassCuadrado
