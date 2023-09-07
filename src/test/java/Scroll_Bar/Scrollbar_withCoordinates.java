package Scroll_Bar;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollbar_withCoordinates {

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
		driver.get("https://www.amazon.com/");
		//address of career
		WebElement career =driver.findElement(By.xpath("//a[text()='Careers']"));
		org.openqa.selenium.Point coOrdinates = career.getLocation();
		int x = coOrdinates.getX();
		int y = coOrdinates.getY();
		
		
		//downcasting statement
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+ x + "," + y +")");
		Thread.sleep(3000);
	   js.executeScript("arguments[0].click();",career);
		Thread.sleep(3000);
		//career.click();
	}

}
