package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_LoginPage_java {
	//declaration
	//address of email textfield
	@FindBy(id="email")
	private WebElement emailTf;
	
	//address of password textfield
	@FindBy(id="pass")
	private WebElement passwordTf;
	
	//address of login button
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	//initialization
	public Fb_LoginPage_java(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void emailTextField(String value) {
		emailTf.sendKeys(value);
	}
	public void passwordTextField(String value) {
		passwordTf.sendKeys(value);
	}
	public void loginButton() {
		loginBtn.click();
	}
	//getter and setter method to practise
	public WebElement getEmailTf() {
		return emailTf;
	}
	public void setEmailTf(WebElement emailTf) {
		this.emailTf = emailTf;
	}
	public WebElement getPasswordTf() {
		return passwordTf;
	}
	public void setPasswordTf(WebElement passwordTf) {
		this.passwordTf = passwordTf;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}

}
