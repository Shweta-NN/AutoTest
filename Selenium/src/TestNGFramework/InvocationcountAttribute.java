package TestNGFramework;

import org.testng.annotations.Test;

public class InvocationcountAttribute 
{
	@Test(invocationCount = 4)
	public void test1()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void test2()
	{
		System.out.println("World");
	}
}
