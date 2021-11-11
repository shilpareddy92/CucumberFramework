package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Programpage {

	public Programpage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[text()='Programming Language']")
	private WebElement AllLanguage;
	
	
	
	
	public void clickOn_AllLanguage() {
		AllLanguage.click();
		
	}
	
	
}
	
