package Shift;

public class Final {
	
		 int age=20;
	
	
	void display()
	{
		//reassing value to age variable
		//gives compile time error 
		  age = 63;
		  System.out.println(age);
	}
	public static void main(String[] args) {
       Final f=new Final();
      
        f.display();
		
	}

}