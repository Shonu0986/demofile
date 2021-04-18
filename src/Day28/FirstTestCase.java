package Day28;

import org.testng.annotations.Test;

public class FirstTestCase {

	@Test(priority = 1)
	void openApp() {
		System.out.println("opening applications");

	}

	@Test(priority = 2)
	void login() {

		System.out.println("login to applications");
	}

	@Test(priority = 3)
	void logout() {

		System.out.println("logout from applications");
	}

	@Test(priority = 5)
	void close() {
		System.out.println("close the applications");

	}

}
