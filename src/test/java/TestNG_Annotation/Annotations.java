package TestNG_Annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {
	WebDriver driver;
	@BeforeMethod
	public void openong() {
		WebDriverManager.edgedriver().setup();
		//opening the firefoxBrowser
		 driver = new EdgeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test (priority=1,invocationCount=2)
	public void fbBrowser() {
		driver.get("https://www.facebook.com/");
	}
	@Test (priority=-1)
	public void amazon() {
		driver.get("https://www.amazon.com/");
		
	}
	@AfterMethod
	public void closing() {
		driver.close();
	}
	

}
