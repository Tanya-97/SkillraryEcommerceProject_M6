package Locators;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tag_Name {

	public static void main(String[] args)   {
		//driver related statement
				WebDriverManager.chromedriver().setup();
				//opening the chromeBrowser
				WebDriver driver = new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//open the browser
				driver.get("https://www.facebook.com/");
				List<WebElement> allLinks = driver.findElements(By.tagName("a"));
				for (WebElement b : allLinks){
					System.out.println(b.getText());
				}
	}

}
