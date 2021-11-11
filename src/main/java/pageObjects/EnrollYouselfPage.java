package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import commonLib.DataProvider;

public class EnrollYouselfPage {
	
	WebDriver driver;
	DataProvider dataprovider;

	public EnrollYouselfPage(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="first-name")
	private WebElement txtbx_firstName;
	
	public void Enter_firstName(String firstname) {
		txtbx_firstName.sendKeys(firstname);
	}
	
	@FindBy(id ="last-name")
	private WebElement txtbx_lastName;
	
	public void Enter_lastName(String lastname) {
		txtbx_lastName.sendKeys(lastname);
	}
	
	@FindBy(id ="email")
	private WebElement txtbx_email;
	
	public void Enter_email(String email) {
		txtbx_email.sendKeys(email);
	}
	
	@FindBy(id ="mobile")
	private WebElement txtbx_mobile;
	
	public void Enter_mobile(String mobile) {
		txtbx_mobile.sendKeys(mobile);
	}
	
	@FindBy(name ="country")
	private WebElement countryDropdown;
	
	public void select_countryDropdown(String countryName) {
		Select country = new Select(countryDropdown);
		country.selectByVisibleText(countryName);
	}
	
	@FindBy(id ="city")
	private WebElement txtbx_city;

	public void Enter_city(String City) {
		txtbx_city.sendKeys(City);
	}
	

	@FindBy(xpath ="//button[@class='btn btn-block btn-primary']")
	private WebElement Btn_Send;

	public void clickOn_Send() {
		Btn_Send.click();
	}
	
	public String get_FirstName() {
		return txtbx_firstName.getText();
	}
	
}
	

