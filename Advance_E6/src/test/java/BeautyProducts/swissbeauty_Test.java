package BeautyProducts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class swissbeauty_Test {


	@Test
	public void facescanadaProducts() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://swissbeauty.in/");
		driver.quit();
		}
}
