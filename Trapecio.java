
public class Trapecio implements Calculable{
	private String name;
	private double baseMayor;
	private double basemenor;
	private double altura;
	private double lado;
	private double lado2;
	
	public Trapecio(String name, double baseMayor, double basemenor, double altura, double lado, double lado2) {
		super();
		this.name = name;
		this.baseMayor = baseMayor;
		this.basemenor = basemenor;
		this.altura = altura;
		this.lado = lado;
		this.lado2 = lado2;
	}//Constructor
	
	public double calcularArea() {
		return (getAltura()*(getBaseMayor()+getBasemenor()))/2;	
	}//calcularArea
	
	public double calcularPerimetro() {
		return (getLado() + getLado2() + getBaseMayor()+ getBasemenor());
	}// calcularPerimetro
	
	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	public double getBaseMayor() {
		return baseMayor;
	}//getBaseMayor

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}//setBaseMayor

	public double getBasemenor() {
		return basemenor;
	}//getBasemenor

	public void setBasemenor(double basemenor) {
		this.basemenor = basemenor;
	}//setBasemenor

	public double getAltura() {
		return altura;
	}//getAltura

	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura

	public double getLado() {
		return lado;
	}//getLado

	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	
	public double getLado2() {
		return lado2;
	}//getLado2

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}//setLado2

	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", baseMayor=" + baseMayor + ", basemenor=" + basemenor + ", altura=" + altura
				+ ", lado=" + lado + ", lado2=" + lado2 + "]";
	}//toString

	@Override
	public double getBase() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}//class Trapecio
