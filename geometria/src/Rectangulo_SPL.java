/**
 * @author Suar PL
 * @version 1.2
 */


public class Rectangulo_SPL extends FiguraGeometrica_SPL {
	private double l1;
	private double l2;
	
	/**Constructor de la clase. 
	 * @param tipoFigura es el tipo de figura
	 * @param l1 es la longitud del lado 1
	 * @param l2 es la longitud del lado 2
	*/
	public Rectangulo_SPL(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**M�todo para calcular el �rea
	* @return Devuelve un float con el �rea
	*/
	@Override
	public double area() {
		return l1 * l2;
	}
	/**M�todo para calcular el per�metro
	* @return Devuelve un float con el per�metro
	*/	
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
