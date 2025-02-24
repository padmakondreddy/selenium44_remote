package ABC1;

import org.testng.annotations.Test;

public class Calculation {

	
	int a=300,b=20,c,d; //decclaration section variables or objects section

	
  @Test
  public void Add() {
	 
	  d=a+b;
	  System.out.println("Sum is :"+d);
	  
  }
  
  @Test
  public void multiplication() {
	  
	  c=a*b;
	  System.out.println("Multiplication is :"+c);	  
  }

  
  @Test
  public void subtraction() {
	  
	  c=a-b;
	  System.out.println("after subtraction is :"+c);	  
  }

  
  @Test
  public void division() {
	  
	  c=a/b;
	  System.out.println("after division is :"+c);	  
  }
  
  
   
}
