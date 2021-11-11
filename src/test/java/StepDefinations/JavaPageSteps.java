package StepDefinations;

import CucumberTestContext.TestContext;
import cucumber.api.java.en.When;
import pageObjects.JavaPage;

public class JavaPageSteps {
	TestContext testContext;
	JavaPage javapage;;
	
	public JavaPageSteps(TestContext context) {
		testContext = context;
		javapage = testContext.getPageObjectManager().getjavapage();
	}
	

	@When("^select the language and clcik on it which should navigate to language page$")
	public void select_the_language_and_clcik_on_it_which_should_navigate_to_language_page() throws InterruptedException {
		Thread.sleep(5000);
		javapage.clickOn_language();
		Thread.sleep(5000);
		javapage.Verify_javatitle();
	}

	@When("^verify all links  and click on any link$")
	public void verify_all_links_and_click_on_any_link() throws InterruptedException  {
		javapage.verifyLinks();
		
	}

	@When("^User should naviagte to particlar link$")
	public void user_should_naviagte_to_particlar_link()  {
		javapage.Verify_datatypeetitle();
		
		
	}

}
