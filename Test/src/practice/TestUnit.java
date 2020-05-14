package practice;

import org.testng.annotations.Test;

public class TestUnit 
{
	@Test(groups= {"SmokeTest"})
	public void TestMethod1() 
	{
		System.out.println("Printed");
	}

	@Test
	public void TestMethod2() 
	{
		System.out.println("Printed");
	}
}
