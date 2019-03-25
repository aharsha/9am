package ex;

public class ThrowExample {

	public static void main(String[] args) {
	
		//System.out.println(10/0); //
		//throw new ArithmeticException();
		
		int age=Integer.parseInt(args[0]);
		if(age<18)
		{
			throw new AgeException("age must not  be < 18");
		}
		else
		{
			System.out.println("eligible for voting");
		}
		}
	}


