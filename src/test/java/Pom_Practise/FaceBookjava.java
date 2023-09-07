package Pom_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.Fb_LoginPage_java;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookjava {

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
				driver.get("https://www.facebook.com/");
				Fb_LoginPage_java fbLogin=new Fb_LoginPage_java(driver);
				fbLogin.emailTextField("sasi");
				fbLogin.passwordTextField("kala");
				fbLogin.loginButton();
	}

}
