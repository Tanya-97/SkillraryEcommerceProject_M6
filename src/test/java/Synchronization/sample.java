package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample {

	public static void main(String[] args) {
		//driver related statement
				WebDriverManager.firefoxdriver().setup();
				//opening the firefoxBrowser
				WebDriver driver = new FirefoxDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//implicitwait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//expliciy wait
				WebDriverWait wait=new WebDriverWait(driver, 10);
				
				//open the browser
				driver.get("https://www.facebook.com/");
				WebElement ele= driver.findElement(By.id("email"));
				//using explict wait
				wait.until(ExpectedConditions.visibilityOf(ele));
				ele.sendKeys("Hi");
				WebElement click = driver.findElement(By.linkText("Forgotten password?"));
				wait.until(ExpectedConditions.elementToBeClickable(click));
				click.click();
	}

}
