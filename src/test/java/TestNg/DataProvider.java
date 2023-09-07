package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {
	@org.testng.annotations.DataProvider
	public Object[] [] getData(){
		Object[][] a=new Object[3][2];
		a[0][0]="assdffh";
		a[0][1]="12assdffh";
		
		a[1][0]="s123dffh";
		a[1][1]="123jh546";
		
		a[2][0]="a#@$%fh";
		a[2][1]="hbedf@!^%";
		return a;
	}
	@Test(dataProvider="getData")
	public void demo(String username,String pwd) {
		WebDriverManager.edgedriver().setup();
		//opening the firefoxBrowser
		WebDriver driver = new EdgeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("pwd");
		driver.findElement(By.name("login")).click();
		driver.close();

	}
}
