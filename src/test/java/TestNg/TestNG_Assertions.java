package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Assertions {
 @Test
 public void assertions() {
	 WebDriverManager.edgedriver().setup();
		//opening the firefoxBrowser
		WebDriver driver = new EdgeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//entering the url
		driver.get("https://www.amazon.in/");
		String title= driver.getTitle();
		//using Hard Assert
		//Assert.assertEquals(title,"sdfghjk");
		//softassert
		SoftAssert s = new SoftAssert();
		s.assertEquals(title,"asdfghj");
		System.out.println(driver.getCurrentUrl());
	
 }
}
