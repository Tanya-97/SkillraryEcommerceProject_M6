package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_Browser {

	public static void main(String[] args) throws Throwable {
	//driver related statement
		WebDriverManager.firefoxdriver().setup();
		//opening the firefoxBrowser
		WebDriver driver = new FirefoxDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open the browser
		driver.get("https://www.facebook.com/");
		//get the tittle of the webpage
		System.out.println(driver.getTitle());
		//printing the current url
		System.out.println(driver.getCurrentUrl ());
		Thread.sleep(4000);
		driver.close();
		
	}

}
