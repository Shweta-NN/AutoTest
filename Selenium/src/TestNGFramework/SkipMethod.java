package TestNGFramework;

import org.testng.annotations.Test;

public class SkipMethod
{
	@Test(enabled = false)
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
