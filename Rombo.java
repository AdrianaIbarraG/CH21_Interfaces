
public class Rombo implements Calculable {
	private String name; 
	private double lado;
	private double DiagonalMayor;
	private double diagonalmenor;
	
	public Rombo(String name, double lado, double diagonalMayor, double diagonalmenor) {
		super();
		this.name = name;
		this.lado = lado;
		DiagonalMayor = diagonalMayor;
		this.diagonalmenor = diagonalmenor;
	}//Constructor

	public double calcularArea() {
		return (getDiagonalMayor() * getdiagonalmenor())/2;	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado()*4);
	}// calcularPerimetro
		
	
	public String getName() {
		return name;
	}//get Name

	public void setName(String name) {
		this.name = name;
	}//setName

	public double getLado() {
		return lado;
	}//getLado

	public void setLado(double lado) {
		this.lado = lado;
	}//setLado

	public double getDiagonalMayor() {
		return DiagonalMayor;
	}//getDiagonalMayor

	public void setDiagonalMayor(double diagonalMayor) {
		DiagonalMayor = diagonalMayor;
	}//setDiagonalMayor

	public double getdiagonalmenor() {
		return diagonalmenor;
	}//getdiagonalmenor

	public void setdiagonalmenor(double diagonalmenor) {
		this.diagonalmenor = diagonalmenor;
	}//setdiagonalmenor

	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", DiagonalMayor=" + DiagonalMayor + ", diagonalmenor="
				+ diagonalmenor + "]";
	}//toString

	@Override
	public double getBase() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAltura() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}//class Rombo
