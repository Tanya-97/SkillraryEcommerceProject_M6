package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css {

	public static void main(String[] args) {
		//driver related statement
		WebDriverManager.chromedriver().setup();
		//opening the chromeBrowser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open the browser
		driver.get("https://www.facebook.com/");
		//fetching address using css
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("hi");
	}

}
