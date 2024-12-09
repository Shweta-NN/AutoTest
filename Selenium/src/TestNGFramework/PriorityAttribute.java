package TestNGFramework;

import org.testng.annotations.Test;

public class PriorityAttribute
{
	@Test(priority = 1)
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
