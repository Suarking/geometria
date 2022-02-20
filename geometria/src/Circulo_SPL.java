
public class Circulo_SPL extends FiguraGeometrica_SPL {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_SPL(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
		int negativo = -1;
		if (radio<0) {
			radio = r * negativo;
		}
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
