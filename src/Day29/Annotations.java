package Day29;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeMethod
	void login() {
		System.out.println("login.......");
	}

	@AfterMethod
	void logout() {

		System.out.println("logout......");
	}

	@Test(priority = 1)
	void search() {
		System.out.println("searching........");
	}

	@Test(priority = 2)
	void advSearch() {

		System.out.println("adv searching......");
	}

	@Test(priority = 3)
	void recharge() {
		System.out.println("reacharge......");
	}
}
