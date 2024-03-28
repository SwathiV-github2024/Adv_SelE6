package Basics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;





public class Launch {
	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
}
