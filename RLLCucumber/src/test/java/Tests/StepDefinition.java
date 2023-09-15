package Tests;

import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import BankPages.SignupPage;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Driver {
	UUID uuid = UUID.randomUUID();
	private Scenario scenario;
	@When("the user clicks on the {string} button")
	public void the_user_clicks_on_the_button(String string) {
	} 
		SignupPage signupPage = new SignupPage(driver);{
	     signupPage.clickSigUpHere();
	     logger.info("User Register Button");
		
	}

	@And("the user should be on the registration page")
	public void the_user_should_be_on_the_registration_page() {
	  
	}

	@And("the user enters the valid personal details")
	public void the_user_enters_the_valid_personal_details() {
		SignupPage signupPage = new SignupPage(driver);
		signupPage.selectTitle("Ms.");
	    signupPage.enterFirstName("Sindhu");
	    signupPage.enterLastName("Chirra");
	     signupPage.selectFemaleGender("F");
	     signupPage.enterDateofBirth("07/03/2000");
	     signupPage.enterSocialsecurityNumber("502-59-5470");
	     signupPage.enterEmailaddress(uuid +"@gmail.com");
	     signupPage.enterPassword("Sindhu.123");
	     signupPage.enterConfirmPassword("Sindhu.123");
	     signupPage.clickNextBtn();
	     signupPage.enterAddress("Hyderabad");
	     signupPage.enterLocality("Abcd");
	     signupPage.enterRegion("TS");
	     signupPage.enterPostalCode("506111");
	     signupPage.enterCountry("India");
	     signupPage.enterHomePhone("(123)456-789");
	     signupPage.enterMobilePhone("(976)654-240");
	     signupPage.enterWorkPhone("(459)412-489");
	     signupPage.clickTermsCheckbox();
	     }

	@And("he clicks on the register button")
	public void he_clicks_on_the_register_button() {
	}
		@Then("he should should verify- {string}")
		public void he_should_should_verify(String string) {
		SignupPage signupPage = new SignupPage(driver);
		signupPage.clickRegisterBtn();
		String expectedErrMsg = "Successaa";
	    String actualErrMsg = signupPage.getSIGNINMsg();
	     AssertJUnit.assertEquals(actualErrMsg, expectedErrMsg);
		}

}
  


