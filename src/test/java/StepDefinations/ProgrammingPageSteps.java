package StepDefinations;

import CucumberTestContext.TestContext;
import cucumber.api.java.en.When;
import pageObjects.Programpage;

public class ProgrammingPageSteps {
	
	TestContext testContext;
	Programpage programpage;
	
	
	public ProgrammingPageSteps(TestContext context) {
		testContext = context;
		programpage = testContext.getPageObjectManager().getProgramPage();
	}
	

	@When("^select the programming language tab$")
	public void select_the_programming_language_tab() {
		programpage.clickOn_AllLanguage();
	}

	

}
