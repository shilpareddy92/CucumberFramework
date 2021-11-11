package StepDefinations;

import CucumberTestContext.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSeps {
	
	TestContext testContext;
	HomePage homepage;
	
	public HomePageSeps(TestContext context) {
		testContext = context;
		homepage = testContext.getPageObjectManager().getHomePage();
	}
	
	@Given("^user is on home page$")
	public void user_is_on_home_page()  {
		homepage.navigateTo_HomePage();
	}
	
	@When("^click on tutorials button$")
	public void click_on_tutorials_button() {
		homepage.clickOn_tutorials();
	}
	
	@When("^click on Enroll yourself button$")
	public void click_on_Enroll_yourself_button() {
		homepage.clickOn_EnrollYourself();
	}


	


}
