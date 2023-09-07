package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class x_path_1 {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.firefoxdriver().setup();
		//opening the firefoxBrowser
		WebDriver driver = new FirefoxDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open the browser
		driver.get("https://www.facebook.com/");
		//adress of email textfield using x path contains attributes
		driver.findElement (By.xpath("//input[@id='email']")).sendKeys("hi");
		//adress of password textfield using x path contains attributes
		driver.findElement (By.xpath("//input[contains(@name,'pass')")) .sendKeys("Hello");
		Thread.sleep(3000);
		//address of create page by xpath text
		driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		
		
	}

}
