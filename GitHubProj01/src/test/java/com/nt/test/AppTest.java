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
}

