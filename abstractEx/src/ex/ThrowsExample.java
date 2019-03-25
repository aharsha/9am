package ex;

public class ThrowsExample {

	public static void main(String[] args) throws Exception
	{
		
	
	m1();
	
	

	}
	
	public static void m1() throws InterruptedException
	{
		int x=10/0;//chance of AE //Unchecked Exception
		
		System.out.print("H");
		Thread.sleep(2000); //chance of InterruptedException //Checked Exception
		System.out.print("A");
		Thread.sleep(2000);
		System.out.print("R");
		Thread.sleep(2000);
		System.out.print("S");
		Thread.sleep(2000);
		System.out.print("H");
		Thread.sleep(2000);
	}

}
