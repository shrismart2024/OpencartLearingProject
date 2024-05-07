package StepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjectModel.LandingPage;
import PageObjectModel.RegisterationPage;
import TestComponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageDefination extends BaseTest{
	WebDriver driver;
	public RegisterationPage RegisterationpageObj;

	@Given("I launch the application")
	public void i_launch_the_application() throws IOException {
		lanchApplication();
	}
	@Given("I navigate to My Account")
	public void i_navigate_to_My_Account() throws IOException {
		landingpage.goToMyaccountPage();

	}
	 @When("I click on Registration page")
	 public void i_click_on_Registration_page() {
			 RegisterationpageObj = landingpage.goToRegisterPage();
	
	 }
	 @When("^I provide (.+) (.+) (.+) (.+) (.+)") 
	 public void i_provide_FirstName_LastName_Email_Telephone_Password(String FirstName, String LastName,String Email,String Telephone,String Password) {
				 Assert.assertTrue(RegisterationpageObj.VerifyRegistrationfields(FirstName,LastName,Email,Telephone,Password));
			
	 }
	 @Then("message is diplayed")
	 public void message_is_diplayed() {
			System.out.println("I should see that the User Account has successfully created");

	 }
	 @When("I do not provide and click on Continue")
	 public void i_do_not_provide_and_click_on_Continue() {
		 Assert.assertTrue(RegisterationpageObj.Verify_By_Skipping_Mandatory_fields());

			System.out.println("user should not provide any fields");

	 }
	 @Then("Warning message should displayed")
	 public void warning_message_should_displayed() {
			System.out.println("Warning message for all the mandatory fields");
 
	 }
	 
	 
	 
	 
	 
	 
	 
	
}
