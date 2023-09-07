package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile_Browser {

	public static void main(String[] args) throws Throwable {
//create an object for properties class
		Properties p= new Properties();
		//creating an object for physical file
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(fis);
		String appURL= p.getProperty("url");
		String User= p.getProperty("username");
		String password= p.getProperty("password");
		String browser= p.getProperty("browser");

		WebDriver driver;
		if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			//opening edge browser
			driver = new EdgeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			//opening of firefox driver
			driver= new FirefoxDriver();
		}
		
		//maximize the browser
		driver.manage().window().maximize();
		//implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//entering the url
		driver.get(appURL);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(User);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		

		
	}

}
