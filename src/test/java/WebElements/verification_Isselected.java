package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verification_Isselected {

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
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//address of radio button
		WebElement radioBtn = driver.findElement(By.xpath("//input[@value='1']"));
		radioBtn.click();
		if(radioBtn.isSelected()) {
			System.out.println("if block");
		}
		else {
			System.out.println("else block");
		}
	}

}
