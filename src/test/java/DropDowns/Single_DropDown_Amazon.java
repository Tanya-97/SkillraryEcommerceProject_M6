package DropDowns;

import java.util.concurrent.TimeUnit;
import java.util.List;
//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Single_DropDown_Amazon {

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
		driver.get("https://www.amazon.in/");
		//address of dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
				//create an object for select class
				Select s = new Select(dropdown);
		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByValue("search-alias=baby");
		Thread.sleep(3000);
        s.selectByVisibleText("Electronics");
        //checking the type of drop down
        System.out.println(s.isMultiple());
        List <WebElement> allOptions = s.getOptions();
        for (WebElement b: allOptions) {
        	System.out.println(b.getText());
        }

	}

}
