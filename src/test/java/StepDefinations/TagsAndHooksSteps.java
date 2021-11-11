package StepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TagsAndHooksSteps {
	
	@Given("^Write code for  tagOne$")
	public void write_code_for_tagOne() {
	    System.out.println("tagOne");
	    
	}
	
	@When("^Write code for  tagTwo$")
	public void write_code_for_tagTwo()  {
		 System.out.println("tagTwo");
		 Assert.fail();
	   
	}

	@When("^Write code for  tagThree$")
	public void write_code_for_tagThree() {
		 System.out.println("tagThree");
		 Assert.fail();
	    
	}
	@When("^Write code for  tagFour$")
	public void write_code_for_tagFour() {
		 System.out.println("tagFour");
	    
	}
	@When("^Write code for  tagFive$")
	public void write_code_for_tagFive() {
		 System.out.println("tagFive");
	    
	}
	@When("^Write code for  tagSix$")
	public void write_code_for_tagsix() {
		 System.out.println("tagsix");
	    
	}


}
