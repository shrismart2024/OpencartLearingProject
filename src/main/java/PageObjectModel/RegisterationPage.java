package PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class RegisterationPage extends AbstractComponents {
	WebDriver driver;

	public RegisterationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id="input-firstname")
	public  WebElement firstName;
		
	@FindBy(id="input-lastname")
	public  WebElement lastName;
		
	@FindBy(id="input-email")
	public  WebElement email;
		
	@FindBy(id="input-telephone")
	public  WebElement telephone;
		
	@FindBy(id="input-password")
	public  WebElement password;
		
	@FindBy(id="input-confirm")
	public  WebElement confirmPassword;
	
	@FindBy(name="agree")
	public  WebElement privcyPolicy;
	
	@FindBy(css="input[value='Continue']")
	public  WebElement sumbitButton;
	
	@FindBy(linkText ="Success")
	public  WebElement successText;
	
	@FindBy(xpath ="//div[text()='First Name must be between 1 and 32 characters!']")
	public  WebElement FirstNameSkip;
	
	@FindBy(css="input[name='newsletter'][value='1'")
	public  WebElement YesToNewsletter;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public  WebElement ErrorMsg;
	
	
	
	public boolean VerifyRegistrationfields(String FirstName, String LastName,String Email,String Telephone,String Password) {
		firstName.sendKeys(FirstName);
		lastName.sendKeys(LastName);
		email.sendKeys(System.currentTimeMillis()+Email);
		telephone.sendKeys(Telephone);
		password.sendKeys(Password);
		confirmPassword.sendKeys(Password);
		privcyPolicy.click();
		sumbitButton.click();
	boolean store=successText.isDisplayed();
	return store;			
	}
	
	public boolean Verify_By_Skipping_Mandatory_fields() {
		sumbitButton.click();
		boolean store=FirstNameSkip.isDisplayed();
		return store;			
	}
	public boolean Verify_By_opting_for_Newsletter_subscription() {
		YesToNewsletter.click();
		return YesToNewsletter.isSelected();
	}
	public String Verify_user_is_restricted_from_registring_a_duplicate_account() {
		firstName.sendKeys("Mamata");
		lastName.sendKeys("Ghodake");
		email.sendKeys("mamata@gmail.com");
		telephone.sendKeys("554");
		password.sendKeys("cxzczx");
		confirmPassword.sendKeys("cxzczx");
		privcyPolicy.click();
		sumbitButton.click();	
		System.out.println(ErrorMsg.getText());
		return ErrorMsg.getText();
	}
}
