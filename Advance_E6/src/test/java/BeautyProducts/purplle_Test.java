package BeautyProducts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class purplle_Test {
	@Test
	public void purplleProducts() {
		WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.purplle.com/");
	driver.quit();
	}
}
