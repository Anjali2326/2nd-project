package Shift;
import java.sql.SQLException;
import operator.Arithmetic;

public class ExceptionalHandling {
	public static void main(String[] args) {
		
		System.out.println("statement 1");
		System.out.println("statement 2");
		
		try{
		int data=10/0;//IO Exception SQL Exception//end terminate//arithmetic exception
		}catch(ArithmeticException e){
			
			System.out.println("statement 4");
            System.out.println("statement 5");			
		}
		//to use clean up code and closeing connection finally{
		
		System.out.println("hi i am finally block 1");
		System.out.println("hi i am finally block 2");
		System.out.println("hi i am finally block 1");
		System.out.println("hi i am finally block 2");
		}
		
	}

	

