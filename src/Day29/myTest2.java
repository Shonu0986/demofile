package Day29;

import org.testng.Assert;
import org.testng.annotations.Test;

public class myTest2 {

	@Test(priority = 3)
	void test1() {
		
		Assert.assertTrue(true);
	}

	@Test(priority = 4)
	void test2()
	{
		Assert.assertTrue(true);
	}
}
