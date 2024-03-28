package BeautyProducts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class nykaa_Test {
	
	@Test
	public void nykaaProducts() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.quit();
	}
}
