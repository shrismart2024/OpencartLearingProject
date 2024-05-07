package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;


public class LandingPage extends AbstractComponents {
	WebDriver driver;  
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void goTo() {
		driver.get("https://www.tutorialsninja.com/demo/");

	}


}
