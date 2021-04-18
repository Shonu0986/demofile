package Day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParamTest {

	WebDriver driver;

	@BeforeClass
	void setup() {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test(priority = 1)
	void testLogo()
	{
          boolean status=driver.findElement(By.xpath("//div[@id=\"divLogo\"]/img")).isDisplayed();
          
          Assert.assertEquals(status, true, "logo not present");
	}
	
	@Test(priority = 2)
	void testTitle() {
		
		String exp_title=driver.getTitle();
		String act_title="OrangeHRM";
		
		Assert.assertEquals(exp_title,act_title," title are not matching ");
	}
	
	@AfterClass
	void tearDown() {
		
		driver.close();
	}

}
