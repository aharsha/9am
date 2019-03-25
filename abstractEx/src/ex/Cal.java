package ex;

public class Cal {

	public static void main(String[] args) 
	{
		int x,y ,result;
		x=0; y=0; result=0;
		try
		{
		x=Integer.parseInt(args[0]);
		 y=Integer.parseInt(args[1]);
result=x/y;
}
		
		catch(ArithmeticException e)
		{
			System.out.println("plz enter non zero denominator");
		}
		catch(NumberFormatException e)
		{
			System.out.println("plz enter number instead of characters");
		}
		catch(Exception e)
		{
			System.out.println("plz enter two values with a space");
		}
		

System.out.println("Division  = "+result);

result=x+y;

System.out.println("Addition  = "+result);

	}

}
