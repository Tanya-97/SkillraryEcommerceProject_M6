package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opening the firefoxBrowser
		WebDriver driver = new EdgeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//entering the url
		driver.get("https://www.snapdeal.com/");
		//address of sign in
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		//object for actions class
		Actions a= new Actions(driver);
		a.moveToElement(signIn).perform();
		//address of register
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		//switching the control to frame
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("123456");
		Thread.sleep(3000);
		//clicking on cancel
		driver.findElement(By.xpath("//div[@id='close-pop']")).click();
		//shifting control to normal web page
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("asdfghj");
		
	}

}
