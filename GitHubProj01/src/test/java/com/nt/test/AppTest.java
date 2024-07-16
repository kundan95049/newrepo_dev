package com.nt.test;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
	 @Test
	  public void testWithPositive()
	  {
		  Arthimetic ar=new Arthimetic();
		  int actual=30;
		  int expected=ar.sum(10, 20);
		  assertEquals(actual,expected); 
	  }
	 @Test
	  public void testWithNegative()
	  {
		  Arthimetic ar=new Arthimetic();
		  int actual=-30;
		  int expected=ar.sum(-10, -20);
		  assertEquals(actual,expected); 
	  }
	 @Test
	  public void testWithZero()
	  {
		  Arthimetic ar=new Arthimetic();
		  int actual=0;
		  int expected=ar.sum(10,-10);
		  assertEquals(actual,expected); 
		  System.out.println("hiii");
	  }
	 
	 @Test
	 public void testWithMixedValue()
	 {

		 System.out.println("AppTest.testWithMixedValue()");
         
	     System.out.println("Hello");
	 }
	 
}

