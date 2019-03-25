package abstractEx;

public class Rectangle extends Polygon 
{

	
	public void area(int x, int y) 
	{
		System.out.println("Area  = "+(x*y));
		
		
	}

	
	void perimeter(int x, int y) 
	{
		System.out.println("Periemeter  = "+(2*(x+y)));
		
	}

}
