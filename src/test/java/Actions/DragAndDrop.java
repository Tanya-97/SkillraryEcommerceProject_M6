package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		//driver related statement
				WebDriverManager.edgedriver().setup();
				//opening the firefoxBrowser
				WebDriver driver = new EdgeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//implicitwait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//entering the url
				driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
				//address of blocl1
				WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
						//address of block4
						WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
						Actions a = new Actions(driver);
				a.dragAndDrop(block1,block4).perform();
	}

}
