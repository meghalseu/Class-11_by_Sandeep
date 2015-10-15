package com.toolsqa.selenium.exceptions;

public class CalculatorRunner {

	public static void main(String[] args)  {

		Calculator c = new Calculator(6, 0);
			
		
		try
		{
			System.out.println("Division : " + c.div()); // No Handler - Termination Abruptly
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println("Addition : " + c.add());
	}

}
