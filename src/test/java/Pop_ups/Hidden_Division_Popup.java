package Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_Division_Popup {

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
				driver.get("https://www.redbus.in/");
				//address of date web element
				driver.findElement(By.xpath("//span[text()='Date']")).click();
				//address of date
				 driver.findElement(By.xpath("//div[text()='Aug']/../../..//span[text()='26']")).click();
				
				
				
	}

}
