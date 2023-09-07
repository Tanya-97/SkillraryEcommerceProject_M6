package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Programs {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.firefoxdriver().setup();
		//opening the firefoxBrowser
		WebDriver driver = new FirefoxDriver();
		//maximize the browser
		driver.manage().window().maximize();		
		//open the browser
		driver.get("https://www.facebook.com/");
		WebElement ele= driver.findElement(By.id("email"));
		ele.sendKeys("asfdfgh");
		Thread.sleep(3000);
		ele.clear();
	}

}
