package Day28;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
1 launch chrome browser and open applicatins
2 login
3 close

*/

public class TC_login {

	WebDriver driver;

	@Test(priority = 1)
	void setup() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
	}

	@Test(priority = 2)
	void login() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin", Keys.ENTER);

		String act_value = driver.findElement(By.xpath("//div[@class='content-header']/h1")).getText();
		String exp_value = "Dashboard";

		/*if (act_value.equals(exp_value)) {

			System.out.println("test pass");
			Assert.assertTrue(true);

		}
		else {
			System.out.println("failed");
			Assert.assertTrue(false);

		}*/
		Assert.assertEquals(act_value, exp_value);
	}

	@Test(priority = 3)
	void tearDown() {

		driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
	}

	@Test(priority = 4)
	void closeApp() {

		driver.close();
	}

}
