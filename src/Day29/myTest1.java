package Day29;


import org.testng.Assert;
import org.testng.annotations.Test;

public class myTest1 {
	
	@Test(priority = 1)
	void test1() {
		
		Assert.assertTrue(true);
	}

	@Test(priority = 2)
	void test2()
	{
		Assert.assertTrue(false);
	}
}
