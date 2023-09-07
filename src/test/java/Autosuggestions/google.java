package Autosuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {

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
				driver.get("https://www.google.com/");
				driver.findElement(By.xpath("//textarea[@type='search']']")).sendKeys("phone");
				Thread.sleep(3000);
				//address of the list
				List<WebElement> allLists = driver.findElements(By.xpath("//li[@data-view-type='1']"));
				
				for(WebElement list : allLists) {
					System.out.println(list.getText());
				}
	}

}
