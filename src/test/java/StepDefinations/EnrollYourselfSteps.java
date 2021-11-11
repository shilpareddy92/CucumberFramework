package StepDefinations;

import CucumberTestContext.TestContext;
import commonLib.Context;
import cucumber.api.java.en.When;
import pageObjects.EnrollYouselfPage;

public class EnrollYourselfSteps {
	
	TestContext testcontext;
	EnrollYouselfPage EnrollYouselfPage;
	
	public EnrollYourselfSteps(TestContext context){
		testcontext = context;
		EnrollYouselfPage = testcontext.getPageObjectManager().getEnrollYouselfPage();
	}
	
	@When("^Please enter firstname \"([^\"]*)\"$")
	public void please_enter_firstname(String arg1) throws InterruptedException  {
		EnrollYouselfPage.Enter_firstName(arg1);
		Thread.sleep(2000);
	}

	@When("^Please enter  lastname \"([^\"]*)\"$")
	public void please_enter_lastname(String arg1) throws InterruptedException  {
		EnrollYouselfPage.Enter_lastName(arg1);
		Thread.sleep(2000);
	}

	@When("^Please enter  emial \"([^\"]*)\"$")
	public void please_enter_emial(String arg1) throws InterruptedException  {
		EnrollYouselfPage.Enter_email(arg1);
		Thread.sleep(2000);
	   
	}

	@When("^Please enter mobile \"([^\"]*)\"$")
	public void please_enter_mobile(String arg1) throws InterruptedException  {
		EnrollYouselfPage.Enter_mobile(arg1);
		Thread.sleep(2000);
	   
	}

	@When("^Please enter country \"([^\"]*)\"$")
	public void please_enter_country(String arg1) throws InterruptedException  {
		EnrollYouselfPage.select_countryDropdown(arg1);
		Thread.sleep(2000);
	}

	@When("^Please enter city \"([^\"]*)\"$")
	public void please_enter_city(String arg1) throws InterruptedException  {
		EnrollYouselfPage.Enter_city(arg1);
		Thread.sleep(2000);
	}

	@When("^Clcik on send button$")
	public void clcik_on_send_button() throws InterruptedException  {
		EnrollYouselfPage.clickOn_Send();
		Thread.sleep(2000);
		String firstname = EnrollYouselfPage.get_FirstName();
		testcontext.scenarioContext.setContext(Context.FIRST_NAME, firstname);
		String text = testcontext.scenarioContext.getContext(Context.FIRST_NAME).toString();
		System.out.println("********"+text);
	}
}
