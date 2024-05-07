package AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObjectModel.LoginPage;
import PageObjectModel.RegisterationPage;


public class AbstractComponents {
	
	WebDriver driver;
	public AbstractComponents(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//span[text()='My Account']")
	public WebElement myAccountHeader;
	
	
	@FindBy(linkText="Register")
	public  WebElement register;
	
	@FindBy(linkText="Login")
	public  WebElement Login;
	
	public void goToMyaccountPage() {
		myAccountHeader.click();
	}
	public RegisterationPage goToRegisterPage() {
		register.click();
		RegisterationPage RegisterationpageObj=new RegisterationPage(driver);
		return RegisterationpageObj;	

			}
	public LoginPage goToLoginPage() {
		Login.click();
		LoginPage LoginPageObj=new LoginPage();
		return LoginPageObj;	

	}
}
