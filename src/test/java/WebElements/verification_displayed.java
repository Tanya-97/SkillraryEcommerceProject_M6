package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verification_displayed {

	public static void main(String[] args) {
		//driver related statement
				WebDriverManager.firefoxdriver().setup();
				//opening the firefoxBrowser
				WebDriver driver = new FirefoxDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//implicitwait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//entering the url
				driver.get("https://www.facebook.com/");
				//address of emailtextfield
				WebElement ele= driver.findElement(By.id("email"));
				if(ele.isDisplayed()) {
					ele.sendKeys("hi");
				}
				else
				{
					System.out.println("webElement is not displayed");
				}
	}

}
