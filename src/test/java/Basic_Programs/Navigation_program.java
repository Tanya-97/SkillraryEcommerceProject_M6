package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_program {

	public static void main(String[] args) throws Throwable {  
		//driver related statement
				WebDriverManager.firefoxdriver().setup();
				//opening the firefoxBrowser
				WebDriver driver = new FirefoxDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//open the browser
				driver.get("https://www.facebook.com/");
				Thread.sleep(3000);
				driver.navigate().to("https://www.amazon.in/");
				driver.navigate().back();
				Thread.sleep(3000);
				driver.navigate().forward();
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(3000);
				driver.close();
				
	}

}
