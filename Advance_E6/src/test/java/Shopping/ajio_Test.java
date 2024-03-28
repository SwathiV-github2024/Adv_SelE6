package Shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ajio_Test {

	@Test
	public void ajio() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com");
		driver.quit();
		
	}
}
