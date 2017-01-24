public abstract class Shape
{
	protected String shapeName;
	public double radius;

	public double area()
	{
		return 4*Math.PI*radius*radius;
	}

	public String toString()
	{
	    return "Shape name: " + shapeName;
   }
}