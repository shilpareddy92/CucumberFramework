package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLib.DataProvider;
import managers.FileReaderManager;

public class HomePage {
	WebDriver driver;
	DataProvider dataprovider;

	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[@Class= 'navbar__tutorial-menu--text']")
	private WebElement tutorials;
	
	
	@FindBy(xpath ="//a[@class='btn btn-primary-shadow btn-block']")
	private WebElement EnrollYourself;
	
	
	public void clickOn_EnrollYourself() {
		EnrollYourself.click();
	
	}
	
	public void clickOn_tutorials() {
		tutorials.click();
	
	}
	
	public void navigateTo_HomePage() {
		dataprovider =  new DataProvider();
		driver.get(FileReaderManager.getInstance().getdataprovider().getApplicationUrl());
	}
	
	
}
