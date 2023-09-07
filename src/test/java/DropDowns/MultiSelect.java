package DropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

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
				driver.get("https://demoapp.skillrary.com/");
				//address of dropdown
				WebElement dropdown = driver.findElement(By.id("cars"));
				Select s= new Select(dropdown);
				s.selectByIndex(0);
				Thread.sleep(2000);
				s.selectByValue("199");
				Thread.sleep(2000);
//s.selectByVisibleText("");
				//				Thread.sleep(2000);
				
               s.deselectByIndex(0);
               s.deselectByValue("199");
               //
               System.out.println(s.isMultiple());
               List<WebElement>Options = s.getAllSelectedOptions();
               for(WebElement b:Options) {
            	   System.out.println(b.getText());
               }
	}

}
