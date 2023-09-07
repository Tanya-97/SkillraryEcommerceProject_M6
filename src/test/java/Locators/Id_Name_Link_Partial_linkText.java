package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name_Link_Partial_linkText {

	public static void main(String[] args)  throws Throwable {
		//driver related statement
		WebDriverManager.chromedriver().setup();
		//opening the chromeBrowser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open the browser
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("tanya");
		//address of password
		driver.findElement(By.name("pass")).sendKeys("tanyapassword");
		Thread.sleep(3000);
		//address of link using linkText()
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);
		//address of link using partialLinkText()
		//driver.findElement(By.partialLinktext("forgotten")).click();
		driver.quit();
		}

}
