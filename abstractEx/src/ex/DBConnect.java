package ex;

import java.util.Scanner;

public class DBConnect {

	public static void main(String[] args) {

Scanner scanner=new Scanner(System.in);
System.out.println("Enter Database name");
String s1=scanner.next();
if(s1.equals("Oracle")||s1.equals("MySql")||s1.equals("H2"))
{
System.out.println("Enter user name");
String s2=scanner.next();
System.out.println("connected");
}
else
{
throw new DataBaseException("wrong db name");	
}

	}

}
