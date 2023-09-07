package TestNG_Distribution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_CrossBrowser {
	@Parameters({"browsername"})
	@Test
	public void crossBrowser(String browser) throws Throwable {
		WebDriver driver;
		if(browser.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				//opening edge browser
				driver= new EdgeDriver();
	}
		else {
			WebDriverManager.firefoxdriver().setup();
			//openingfirefox browser
			driver = new FirefoxDriver();
		}
		//maximize the browser
				driver.manage().window().maximize();
				//implicitwait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//entering the url
				driver.get("https://www.amazon.in/");
				Thread.sleep(2000);
				driver.close();

	} 
}