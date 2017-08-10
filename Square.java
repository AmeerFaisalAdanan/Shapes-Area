public class Square extends Shape{
	private double length;
	
	public Square(double length){
		this.length = length;
	}
	/*
	 * @return The area of an Square.
	 */
	@Override
	public double area() {
		return length * length;
	}
	
	//@return The perimeter of an Square.
	@Override
	public double perimeter() {
		return ((2 * length) + (2 * length));
	}

}