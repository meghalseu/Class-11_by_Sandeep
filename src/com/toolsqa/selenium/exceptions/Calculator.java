package com.toolsqa.selenium.exceptions;

public class Calculator {
	int a, b;
	
	public Calculator(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int add()
	{
		
		return a+b;
	}
	
	public int div() throws Exception
	{
		if(b==0)
			throw new Exception("Argument B is 0 - Which is Illegal to supply");
		
		return a/b;
	}
}
